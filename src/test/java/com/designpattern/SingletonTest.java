package com.designpattern;

import static org.testng.Assert.assertTrue;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.testng.annotations.Test;

import com.designpattern.singleton.Singleton;

public class SingletonTest {

	@Test
	public void testSingletonPattern() {
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		assertTrue(s1 == s2);
	}

	@Test(expectedExceptions = InvocationTargetException.class)
	public void violateSingletonPattern() throws Exception {
		Class<?> c = Class.forName("com.designpattern.singleton.Singleton");
		Constructor<?> constructor = c.getDeclaredConstructor();
		constructor.setAccessible(true);
		Singleton s2 = (Singleton) constructor.newInstance();
	}
}
