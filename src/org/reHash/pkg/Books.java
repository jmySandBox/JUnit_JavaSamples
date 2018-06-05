package org.reHash.pkg;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Books {
	//Book Descriptors
	String author;
	String title;
	Person prsn;
	DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
	Date pubYear = new Date();
	//pubYear = dateFormat.format(pubYear);
	
	public Books() {
		author = "myAuthor";
		title = "myTitle";
	}
	
	public Date getPubYear() {
		return pubYear;
		//return dateFormat.format(pubYear);
	}
	
	public void setPubYear(Date pubYear) {
		this.pubYear = pubYear;
		//pubYear = dateFormat.format(pubYear);
	}

	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public Person getPrsn() {
		return prsn;
	}
	
	public void setPrsn(Person prsn) {
		this.prsn = prsn;
	}
	
}