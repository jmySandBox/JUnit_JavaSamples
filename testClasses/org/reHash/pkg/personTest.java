package org.reHash.pkg;

import junit.framework.*;
import org.junit.Test;

public class personTest extends TestCase{

	Person prsnTst = new Person();
	
	@Test
	public void testGetName() {
		//fail("Not yet implemented");
		TestCase.assertEquals("MaryAnne", prsnTst.getName());
		System.out.println("getName OutPut Value is " + prsnTst.getName());
	}

	@Test
	public void testSetMaxBooks() {
		TestCase.assertEquals(3, prsnTst.getMaxBooks());
		System.out.println("setMax Book OutPut Value is " + prsnTst.getMaxBooks());
		}
	
	 public void testSetName() {              
		 prsnTst.setName("Fred");              
		 assertEquals("Fred", prsnTst.getName());  
		 System.out.println("setName OutPut Value is " + prsnTst.getName());
		 }
	 
     public void testSetMaximumBooks() {                           
    	 prsnTst.setMaxBooks(10);              
    	 assertEquals(10, prsnTst.getMaxBooks());       
    	 System.out.println("setMaximum Book OutPut Value is " + prsnTst.getMaxBooks());
    	 }

}
