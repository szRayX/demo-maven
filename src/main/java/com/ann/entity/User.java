package com.ann.entity;

import com.ann.annotation.Column;
import com.ann.annotation.Table;

/**
 * Created on 2016/5/26.
 *
 * @author 薛磊
 * @since 1.0.0
 */
@Table("USER")
public class User {
    @Column("ID")
    private Long id;

    @Column("NAME")
    private String name;

    @Column("AGE")
    private Integer age;

    @Column("EMAIL")
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
