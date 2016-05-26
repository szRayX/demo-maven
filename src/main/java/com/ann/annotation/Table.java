package com.ann.annotation;

import java.lang.annotation.*;

/**
 * Created on 2016/5/26.
 *
 * @author 薛磊
 * @since 1.0.0
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Table {
    String value();
}
