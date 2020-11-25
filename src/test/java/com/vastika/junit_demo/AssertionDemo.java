package com.vastika.junit_demo;

import org.junit.Assert;
import org.junit.Test;

public class AssertionDemo {
	
	@Test
	public void testDemo() {
		String s1 = "Nepal";
		String s2 = "Nepal";
		String s3 = "hello";
		
		int a = 5;
		int b = 5;
		int c = 6;
		
		int [] arr1 = {10 ,20 ,30};
		int [] arr2 = {10, 20, 30};
		
		boolean b1 = true;
		boolean b2 = false;
		
		AssertionDemo obj1 = null;
		AssertionDemo obj2 = new AssertionDemo();
		
		Assert.assertEquals(a, b);
		Assert.assertNotEquals(c, a);
		
		Assert.assertEquals(s1, s2);
		Assert.assertNotEquals(s1, s3);
		
		Assert.assertArrayEquals(arr1, arr2);
		
		Assert.assertTrue(b1);
		Assert.assertFalse(b2);
		
		Assert.assertNull(obj1);
		Assert.assertNotNull(obj2);
		
		 
	}

}
