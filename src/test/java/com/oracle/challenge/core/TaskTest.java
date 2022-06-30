package com.oracle.challenge.core;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * The Task test class.
 * 
 * @author Prashanth
 */
public class TaskTest {

	private Task task;
	
	@Before
	public void setUp(){
		task = new Task();
	}
	
	@Test
	public void test_constructor(){
		final long id = 10;
		final String description = "Test name";
		final String date = "10-06-2022";
		
		final Task myTask = new Task(id,description,date);
		
		assertEquals( id, myTask.getId() );
		assertEquals( description, myTask.getDescription());
		assertEquals( date, myTask.getDate());
	}
	
	@Test
	public void test_idSetAndGet(){
		final long id = 10;
		task.setId(id);
		
		assertEquals( id, task.getId() );
	}
	
	@Test
	public void test_nameSetAndGet(){
		final String description = "Test name";
		task.setDescription(description);
		
		assertEquals( description, task.getDescription() );
	}
}
