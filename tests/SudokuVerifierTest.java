import static org.junit.Assert.*;

import org.junit.Test;

public class SudokuVerifierTest {

//implement tests to test Sudokuverifier with boundary values.  Use templates from Task 1 to derive and document test cases.
	
// A correct Sudoku string: 417369825632158947958724316825437169791586432346912758289643571573291684164875293
// An incorrect Sudoku string: 123456789912345678891234567789123456678912345567891234456789123345678912234567891
String c = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
String i = "123456789912345678891234567789123456678912345567891234456789123345678912234567891";

String tooShort = "17369825632158947958724316825437169791586432346912758289643571573291684164875293";
String hasChar = "A17369825632158947958724316825437169791586432346912758289643571573291684164875293";
String invalidRow = "457369825632158947918724316825437169791586432346912758289643571573291684164875293";
String invalidColumn = "457369821632158947918724356825437169791586432346912758289643571573291684164875293";
String hasZero = "017369825632158947958724316825437169791586432346912758289643571573291684164875293";


SudokuVerifier v = new SudokuVerifier();

	@Test
	public void testCorrectString() {
		int a = v.verify(c);
		assertEquals("correct string", a, 0);
	}

	@Test
	public void testIncorrectString() {
		int a = v.verify(i);
		assertEquals("incorrect string", a, -2);
	}

	@Test
	public void testCharString() {
		int a = v.verify(hasChar);
		assertEquals("Has characters", a, 1);
	}
	
	@Test
	public void testShortString() {
		int a = v.verify(tooShort);
		assertEquals("Not correct length", a, -1);
	}
	
	@Test
	public void testInvalidRowString() {
		int a = v.verify(invalidRow);
		assertEquals("Dublicate number on row", a, -3);
	}
	
	@Test
	public void testInvalidColumnString() {
		int a = v.verify(invalidColumn);
		assertEquals("Dublicate number on column", a, -4);
	}
	
	@Test
	public void testWithZeroString() {
		int a = v.verify(hasZero);
		assertEquals("invalid number", a, -1);
	}
	
}
