package org.reHash.pkg;

public class Person {
	//person descriptors
	String name; //fullName
	int maxBooks; //max number of books one can borrow
	
	//Initiate Person Field
	public Person() {
		name = "MaryAnne";
		maxBooks = 3;
	}
	
	//Person methods
	public String getName(){
	return name;
	}

	public void	setName(String nameVal){
		this.name = nameVal;
	}
	
	public int getMaxBooks() {
		return maxBooks;
	}
	
	public void setMaxBooks(int maxBooks) {
		this.maxBooks = maxBooks;
	}
	
	
}

