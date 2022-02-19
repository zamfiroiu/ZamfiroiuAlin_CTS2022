package teste;

import static org.junit.Assert.*;


import org.junit.Test;

import clase.Matematica;

public class MatematicaTests {

	@Test
	public void testCorrectSuma() {
		Matematica object = new Matematica();
		int actualResult = object.suma(8, 6);
		int expectedResult = 14;
		assertEquals(expectedResult, actualResult);
	}

	@Test
	public void testCorrectRaport() {
		Matematica object = new Matematica();
		double actual_result = object.raport(25, 6);
		double expected_result = 4;
		double delta = 0.4;
		assertEquals(expected_result, actual_result, delta);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testErrorDivisionJUnit4() {
		Matematica object = new Matematica();
		object.raport(4, 0);
	}

	@Test
	public void testCorrectIsEven() {
		Matematica object = new Matematica();
		boolean condition1 = object.esteNumarPar(20);
		boolean condition2 = object.esteNumarPar(0);
		boolean condition3 = object.esteNumarPar(9);
		assertTrue(condition1);
		assertTrue(condition2);
		assertFalse(condition3);
	}


//	@Test
//	public void testDivisionTo1() {
//		Matematica object = new Matematica();
//		int numerator = 8;
//		double actual_result = object.raport(numerator, 1);
//		assertEquals(numerator, actual_result, 0.1);
//	}
//
//	@Test
//	public void testDivisionToSameNumber() {
//		Matematica object = new Matematica();
//		int number = 8;
//		double actual_result = object.raport(number, number);
//		double expected_result = 1;
//		double delta = 0.01;
//		assertEquals(expected_result, actual_result, delta);
//	}
//
//	@Test
//	public void testInverseSum() {
//		Matematica object = new Matematica();
//		int param1 = 8;
//		int param2 = 6;
//		int actual_result = object.suma(param1, param2);
//		int expected_result = actual_result - param2;
//		assertEquals(expected_result, param1);
//	}
//
//	@Test
//	public void testCrossCheckSum() {
//		Matematica object = new Matematica();
//		int param1 = 8;
//		int param2 = 6;
//		int actual_result = object.suma(param1, param2);
//		assertEquals(param1 + param2, actual_result);
//	}
//
//	@Test
//	public void testCrossCheckDivision() {
//		Matematica object = new Matematica();
//		int numerator = 25;
//		int denominator = 6;
//		double actual_result = object.raport(numerator, denominator);
//		double delta = 0.4;
//		assertEquals(numerator / denominator, actual_result, delta);
//	}
}
