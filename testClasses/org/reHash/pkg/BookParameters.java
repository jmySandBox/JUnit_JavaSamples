package org.reHash.pkg;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)

public class BookParameters {

	String pBookAuthor;
	String pBookTitle;
	String pPubYear;

	public BookParameters(String pBookAuthor, String pBookTitle, String pPubYear) {

		this.pBookAuthor = pBookAuthor;
		this.pBookTitle = pBookTitle;
		this.pPubYear = pPubYear;
	}

	@Parameters
	public static Collection<Object[]> getData() {

		Object[][] bkValues = new Object[3][3];

		bkValues[0][0] = "Author1";
		bkValues[0][1] = "Title1";
		bkValues[0][2] = "1900";

		bkValues[1][0] = "Author2";
		bkValues[1][1] = "Title2";
		bkValues[1][2] = "1902";

		bkValues[2][0] = "Author3";
		bkValues[2][1] = "Title3";
		bkValues[2][2] = "1903";

		return Arrays.asList(bkValues);

	}

	@Test
	public void verifyParameters() {

		System.out.println("Author - " + pBookAuthor + " Title - " + pBookTitle + " Year - " + pPubYear);

	}

}
