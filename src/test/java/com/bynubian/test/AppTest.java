package com.bynubian.test;

import javax.inject.Inject;

import org.testng.annotations.Guice;
import org.testng.annotations.Test;

@Guice
public class AppTest 

{
	@Inject
	public AppTest(final Person person) {
		
	}
	
	@Test
	public void testApp() {
	   
	}
}
