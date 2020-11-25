package com.vastika.junit_demo;

import org.junit.Assert;
import org.junit.Test;

public class AppTest {
	
	@Test
    public void testSum() {
    	int a=5;
    	int b=6;
    	App app = new App();
    	int actual = app.sum(a, b);
    	Assert.assertEquals(11, actual);
    }
}
