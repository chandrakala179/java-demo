package com.vastika.junit_demo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class AnnotationDemo { 
	
	
	@BeforeClass
	public static void beforeClass () {
		System.out.println("before class runs");
	}
	
	@Before
	public void before() {
		System.out.println("before runs");
	}
	
	@Test
	public void test1() {
		System.out.println("test1 runs");
	}
	
	@Test
	public void test2() {
		System.out.println("test2 runs");
	}
	
	@Test
	public void test3() {
		System.out.println("test3 runs");
	}
	
	@After
	public void after() {
		System.out.println("after runs");
	}
	
	@AfterClass
	public static void afterClass() {
		System.out.println("after class runs");
	}

}
