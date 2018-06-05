package org.reHash.pkg;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.junit.Test;

import junit.framework.TestCase;

//DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

public class bookTest extends TestCase {

	Books bkTest = new Books();
	Person prsn = new Person();

	@Test
	public void testGetPerson() {
		TestCase.assertEquals("MaryAnne", prsn.getName());
	}

	@Test
	public void testGetPubYear() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		TestCase.assertEquals("2018/06/06", dateFormat.format(bkTest.getPubYear()));
	}

	@Test
	public void testSetAuthor() {
		TestCase.assertEquals("myAuthor", bkTest.getAuthor());
	}

	@Test
	public void testSetTitle() {
		TestCase.assertEquals("myTitle", bkTest.getTitle());
	}

}
