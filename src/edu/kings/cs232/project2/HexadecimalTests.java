package edu.kings.cs232.project2;

/**
 * 
 * Test cases for the Rotaluclac class.
 * 
 * These are hexadecimal specific.
 * 
 * @author Andrea Siejna
 *
 */

import static org.junit.Assert.*;

import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;

import org.junit.Test;


@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class HexadecimalTests {


    // TEST CASES FOR HEXADECIMAL OPERATIONS

    // TEST CASES FOR HEXADECIMAL POSITIVE NUMBERS

    // TEST CASES FOR HEXADECIMAL POSITIVE LARGE NUMBERS

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate addition between two Large, positive numbers in base-16
     * (hexadecimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalPositiveLargeAddition() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1E240h 1343Eh +");
        // 202366
        assertEquals("Incorrect computation.", "3167E", answer);

    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate subtraction between two Large, positive numbers in base-16
     * (hexadecimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalPositiveLargeSubtraction() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1E240h 1343Eh -");
        // 44546
        assertEquals("Incorrect computation.", "AE02", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate multiplication between two Large, positive numbers in base-16
     * (hexadecimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalPositiveLargeMultiplication() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        // 9741912960
        String answer = calculatorTester.calculate("1E240h 1343Eh *");
        assertEquals("Incorrect computation.", "244A9CB80", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate division between two Large, positive numbers in base-16
     * (hexadecimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalPositiveLargeDivision() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1E240h 1343Eh /");
        // 1.56451653783
        assertEquals("Incorrect computation.", "1", answer);
    }


    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate modulus between two Large, positive numbers in base-16
     * (hexadecimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalPositiveLargeModulus() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1E240h 1343Eh %");
        // 44546
        assertEquals("Incorrect computation.", "AE02", answer);
    }


    // TEST CASES FOR HEXADECIMAL POSITIVE SMALL NUMBERS

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate addition between two Small, positive numbers in base-16
     * (hexadecimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalPositiveSmallAddition() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1h 2h +");
        assertEquals("Incorrect computation.", "3", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate subtraction between two Small, positive numbers in base-16
     * (hexadecimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalPositiveSmallSubtraction() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1h 2h -");
        assertEquals("Incorrect computation.", "-1", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate multiplication between two Small, positive numbers in base-16
     * (hexadecimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalPositiveSmallMultiplication() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1h 2h *");
        assertEquals("Incorrect computation.", "2", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate division between two Small, positive numbers in base-16
     * (hexadecimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalPositiveSmallDivision() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1h 2h /");
        assertEquals("Incorrect computation.", "0", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate exponentiation between two Small, positive numbers in base-16
     * (hexadecimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalPositiveSmallExponentiation() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1h 2h ^");
        assertEquals("Incorrect computation.", "1", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate modulus between two Small, positive numbers in base-16
     * (hexadecimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalPositiveSmallModulus() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1h 2h %");
        assertEquals("Incorrect computation.", "1", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate factorial between two Small, positive numbers in base-16
     * (hexadecimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalPositiveSmallFactorial() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("2h !");
        assertEquals("Incorrect computation.", "2", answer);
    }

    // TEST CASES FOR HEXADECIMAL NEGATIVE NUMBERS
    // TEST CASES FOR HEXADECIMAL NEGATIVE LARGE NUMBERS

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate addition between two Large, Negative numbers in base-16
     * (hexadecimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalNegativeLargeAddition() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-1E240h -1343Eh +");
        // -202366
        assertEquals("Incorrect computation.", "-3167E", answer);

    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate subtraction between two Large, Negative numbers in base-16
     * (hexadecimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalNegativeLargeSubtraction() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-1E240h -1343Eh -");
        // -44546
        assertEquals("Incorrect computation.", "-AE02", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate multiplication between two Large, Negative numbers in base-16
     * (hexadecimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalNegativeLargeMultiplication() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-1E240h -1343Eh *");
        // 9741912960
        assertEquals("Incorrect computation.", "244A9CB80", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate division between two Large, Negative numbers in base-16
     * (hexadecimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalNegativeLargeDivision() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-1E240h -1343Eh /");
        // 1.564516...
        assertEquals("Incorrect computation.", "1", answer);
    }


    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate modulus between two Large, Negative numbers in base-16
     * (hexadecimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalNegativeLargeModulus() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-1E240h -1343Eh %");
        // -44546
        assertEquals("Incorrect computation.", "-AE02", answer);
    }



    // TEST CASES FOR HEXADECIMAL Negative SMALL NUMBERS

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate addition between two Small, Negative numbers in base-16
     * (hexadecimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalNegativeSmallAddition() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-1h -2h +");
        assertEquals("Incorrect computation.", "-3", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate subtraction between two Small, Negative numbers in base-16
     * (hexadecimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalNegativeSmallSubtraction() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-1h -2h -");
        assertEquals("Incorrect computation.", "1", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate multiplication between two Small, Negative numbers in base-16
     * (hexadecimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalNegativeSmallMultiplication() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-1h -2h *");
        assertEquals("Incorrect computation.", "2", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate division between two Small, Negative numbers in base-16
     * (hexadecimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalNegativeSmallDivision() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-1h -2h /");
        assertEquals("Incorrect computation.", "0", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate exponentiation between two Small, Negative numbers in base-16
     * (hexadecimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalNegativeSmallExponentiation() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-1h -2h ^");
        assertEquals("Incorrect computation.", "-1", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate modulus between two Small, Negative numbers in base-16
     * (hexadecimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalNegativeSmallModulus() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-1h -2h %");
        assertEquals("Incorrect computation.", "-1", answer);
    }



    // TEST CASES FOR HEXADECIMAL ZERO LARGE NUMBERS

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate addition between zero and one Large, positive numbers in
     * base-16 (hexadecimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalZeroLargeAddition() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0h 1343Eh +");
        assertEquals("Incorrect computation.", "1343E", answer);

    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate subtraction between zero and one Large, positive numbers in
     * base-16 (hexadecimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalZeroLargeSubtraction() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-0h 1343Eh -");
        assertEquals("Incorrect computation.", "-1343E", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate multiplication between zero and one Large, positive numbers in
     * base-16 (hexadecimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalZeroLargeMultiplication() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0h 1343Eh *");
        assertEquals("Incorrect computation.", "0", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate division between zero and one Large, positive numbers in
     * base-16 (hexadecimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalZeroLargeDivision() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0h 1343Eh /");
        assertEquals("Incorrect computation.", "0", answer);
    }


    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate modulus between zero and one Large, positive numbers in base-16
     * (hexadecimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalZeroLargeModulus() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0h 1343Eh %");
        assertEquals("Incorrect computation.", "0", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate factorial of zero in base-16 (hexadecimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalZeroFactorial() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0h !");
        assertEquals("Incorrect computation.", "1", answer);
    }

    // TEST CASES FOR HEXADECIMAL Zero SMALL NUMBERS

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate addition between zero and one Small, positive numbers in
     * base-16 (hexadecimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalZeroSmallAddition() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0h 2h +");
        assertEquals("Incorrect computation.", "2", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate subtraction between zero and one Small, positive numbers in
     * base-16 (hexadecimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalZeroSmallSubtraction() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0h 2h -");
        assertEquals("Incorrect computation.", "-2", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate multiplication between zero and one Small, positive numbers in
     * base-16 (hexadecimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalZeroSmallMultiplication() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0h 2h *");
        assertEquals("Incorrect computation.", "0", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate division between zero and one Small, positive numbers in
     * base-16 (hexadecimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalZeroSmallDivision() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0h 2h /");
        assertEquals("Incorrect computation.", "0", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate exponentiation between zero and one Small, positive numbers in
     * base-16 (hexadecimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalZeroSmallExponentiation() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0h 2h ^");
        assertEquals("Incorrect computation.", "0", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate modulus between zero and one Small, positive numbers in base-16
     * (hexadecimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalZeroSmallModulus() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0h 2h %");
        assertEquals("Incorrect computation.", "0", answer);
    }

}
