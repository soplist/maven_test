package com.wk.maven01.model;

import org.junit.*;
import org.junit.Assert.*;

public class HelloWorldTest {
    
    @Test
    public void testHelloWorld() {
    
        Assert.assertEquals("hello",new HelloWorld().sayHello());
    }

}