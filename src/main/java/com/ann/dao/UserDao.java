package com.ann.dao;

import com.ann.annotation.Column;
import com.ann.annotation.Table;
import com.ann.entity.User;

import java.lang.reflect.Field;

/**
 * Created on 2016/5/26.
 *
 * @author 薛磊
 * @since 1.0.0
 */
public class UserDao {
    public String query(User user) throws IllegalAccessException {
        StringBuffer sb = new StringBuffer("SELECT * FROM ");

        Class userClass = user.getClass();
        if (!userClass.isAnnotationPresent(Table.class)) {
            return null;
        }
        Table table = (Table)userClass.getAnnotation(Table.class);
        sb.append(table.value()).append(" WHERE 1=1");

        Field[] fields = userClass.getDeclaredFields();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Column.class)) {
                Column column = field.getAnnotation(Column.class);
                String columnName = column.value();
                field.setAccessible(true);
                Object columnValue =field.get(user);
                if (columnValue == null) {
                    continue;
                }
                sb.append(" AND ").append(columnName).append(" = '").append(columnValue).append("'");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        User user1 = new User();
        user1.setId(123123L);
        user1.setName("John");
        user1.setAge(18);
        user1.setEmail("123@qq.com");

        User user2 = new User();
        user2.setId(123123L);

        UserDao dao = new UserDao();
        try {
            System.out.println(dao.query(user1));
            System.out.println(dao.query(user2));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
