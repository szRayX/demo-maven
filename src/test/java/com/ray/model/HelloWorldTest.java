package com.ray.model;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created on 2016/5/26.
 *
 * @author 薛磊
 * @since 1.0.0
 */
public class HelloWorldTest {
    @Test
    public void helloTest() {
        Assert.assertEquals("Hello World!", new HelloWorld().hello());
    }
}
