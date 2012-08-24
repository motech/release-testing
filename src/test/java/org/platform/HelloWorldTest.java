package org.platform;

import org.junit.Assert;
import org.junit.Test;

public class HelloWorldTest {

    @Test
    public void shouldPrint() {
        Assert.assertEquals("hello", new HelloWorld().print());
    }
}
