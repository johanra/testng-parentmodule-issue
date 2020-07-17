package com.bynubian.test;

import javax.inject.Inject;

import org.testng.annotations.Guice;
import org.testng.annotations.Test;


@Guice
public class AnotherAppTest {
	
	
	@Inject
	public AnotherAppTest(final Person person) {
		
	}

	@Test
	public void testAnotherApp() {
		
	}
}
