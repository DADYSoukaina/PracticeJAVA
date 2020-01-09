package testBasics;

import static org.junit.Assert.*;

import org.junit.Test;

import basics.Junit4Exemple;

public class Junit4ExempleTest {

	@Test
	public void test() {

		Junit4Exemple exemple = new Junit4Exemple();
		assertEquals("CD",exemple.truncateAInFirst2Positions("AACD"));
		assertEquals("CD",exemple.truncateAInFirst2Positions("ACD"));
		assertEquals("CD",exemple.truncateAInFirst2Positions("CD"));
		
		assertEquals(true,exemple.areFirstAndLastTwoCharactersTheSame("SODADYSO"));
		assertEquals(false,exemple.areFirstAndLastTwoCharactersTheSame("SOUKAINA"));


		
		

	}

}
