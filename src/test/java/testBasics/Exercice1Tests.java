package testBasics;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import basics.Exercice1;

class Exercice1Tests {

	Exercice1 ex = new Exercice1();

	/*@BeforeEach
	void beforEach(TestInfo info) {
		System.out.println("Start test case for " + info.getDisplayName());
	}*/

	@Test
	public void additionTest() {
		int actualResult = ex.calculate(7, "+", 8);
		int expectedResult = 15;
		assertEquals(actualResult, expectedResult);
	}

	@Test
	public void substractionTest() {
		int actualResult = ex.calculate(19, "-", 30);
		int expectedResult = -11;
		assertEquals(actualResult, expectedResult);
	}

	@Test
	public void mutiplicationTest() {
		int actualResult = ex.calculate(7, "*", 5);
		int expectedResult = 35;
		assertEquals(actualResult, expectedResult);
	}

	@Test
	public void divisionTest() {
		int actualResult = ex.calculate(19, "/", 3);
		int expectedResult = 6;
		assertEquals(actualResult, expectedResult);
	}
	
	/*@AfterEach
	void afterEach(TestInfo info) {
		System.out.println("End test case for " + info.getDisplayName() +"Secessfully");
	}*/

}
