package com.bynubian.test.modules;

import java.util.Objects;

import javax.inject.Singleton;

import com.bynubian.test.Person;

import com.google.inject.AbstractModule;

public class ParentModule extends AbstractModule{
	
	@Override
    protected void configure() {
		System.out.println("ParentModule configure()");
		bind(Person.class).in(Singleton.class);
	}
	
	/**
	  * 
	  * 
	  */
	 @Override
	 public boolean equals(final Object object) {
		 if(object == null) return false;
		 return Objects.equals(getClass(), object.getClass());		 
	 }
	 
	 @Override
	 public int hashCode() {
		 return this.getClass().hashCode();
	 }
}
