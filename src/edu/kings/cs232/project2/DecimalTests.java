package edu.kings.cs232.project2;

/**
 * 
 * Test cases for the Rotaluclac class.
 * 
 * These are decimal specific.
 * 
 * @author Andrea Siejna
 *
 */

import static org.junit.Assert.*;

import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;

import org.junit.Test;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class DecimalTests {

    // TEST CASES FOR DECIMAL OPERATIONS

    // TEST CASES FOR DECIMAL POSITIVE NUMBERS

    // TEST CASES FOR DECIMAL POSITIVE LARGE NUMBERS

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate addition between two Large, positive numbers in base-10
     * (decimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalPositiveLargeAddition() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("123456d 78910d +");
        // 202366
        assertEquals("Incorrect computation.", "202366", answer);

    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate subtraction between two Large, positive numbers in base-10
     * (decimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalPositiveLargeSubtraction() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("123456d 78910d -");
        //-44546
        assertEquals("Incorrect computation.", "44546", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate multiplication between two Large, positive numbers in base-10
     * (decimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalPositiveLargeMultiplication() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        // 9741912960
        String answer = calculatorTester.calculate("1234d 5678d *");
        assertEquals("Incorrect computation.", "7006652", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate division between two Large, positive numbers in base-10
     * (decimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalPositiveLargeDivision() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("123456d 78910d /");
        // 1.56451653783
        assertEquals("Incorrect computation.", "1", answer);
    }


    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate modulus between two Large, positive numbers in base-10
     * (decimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalPositiveLargeModulus() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("123456d 78910d %");
        // 44546
        assertEquals("Incorrect computation.", "44546", answer);
    }


    // TEST CASES FOR DECIMAL POSITIVE SMALL NUMBERS

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate addition between two Small, positive numbers in base-10
     * (decimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalPositiveSmallAddition() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1d 2d +");
        assertEquals("Incorrect computation.", "3", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate subtraction between two Small, positive numbers in base-10
     * (decimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalPositiveSmallSubtraction() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1d 2d -");
        assertEquals("Incorrect computation.", "-1", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate multiplication between two Small, positive numbers in base-10
     * (decimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalPositiveSmallMultiplication() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1d 2d *");
        assertEquals("Incorrect computation.", "2", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate division between two Small, positive numbers in base-10
     * (decimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalPositiveSmallDivision() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1d 2d /");
        assertEquals("Incorrect computation.", "0", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate exponentiation between two Small, positive numbers in base-10
     * (decimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalPositiveSmallExponentiation() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1d 2d ^");
        assertEquals("Incorrect computation.", "1", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate modulus between two Small, positive numbers in base-10
     * (decimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalPositiveSmallModulus() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1d 2d %");
        assertEquals("Incorrect computation.", "1", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate factorial between two Small, positive numbers in base-10
     * (decimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalPositiveSmallFactorial() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("2d !");
        assertEquals("Incorrect computation.", "2", answer);
    }

    // TEST CASES FOR DECIMAL NEGATIVE NUMBERS
    // TEST CASES FOR DECIMAL NEGATIVE LARGE NUMBERS

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate addition between two Large, Negative numbers in base-10
     * (decimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalNegativeLargeAddition() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-123456d -78910d +");
        // -202366
        assertEquals("Incorrect computation.", "-202366", answer);

    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate subtraction between two Large, Negative numbers in base-10
     * (decimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalNegativeLargeSubtraction() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-123456d -78910d -");
        // -44546
        assertEquals("Incorrect computation.", "-44546", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate multiplication between two Large, Negative numbers in base-10
     * (decimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalNegativeLargeMultiplication() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-1234d -5678d *");
        // 9741912960
        assertEquals("Incorrect computation.", "7006652", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate division between two Large, Negative numbers in base-10
     * (decimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalNegativeLargeDivision() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-123456d -78910d /");
        // 1.564516...
        assertEquals("Incorrect computation.", "1", answer);
    }



    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate modulus between two Large, Negative numbers in base-10
     * (decimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalNegativeLargeModulus() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-123456d -78910d %");
        // -44546
        assertEquals("Incorrect computation.", "-44546", answer);
    }


    // TEST CASES FOR DECIMAL Negative SMALL NUMBERS

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate addition between two Small, Negative numbers in base-10
     * (decimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalNegativeSmallAddition() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-1d -2d +");
        assertEquals("Incorrect computation.", "-3", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate subtraction between two Small, Negative numbers in base-10
     * (decimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalNegativeSmallSubtraction() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-1d -2d -");
        assertEquals("Incorrect computation.", "1", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate multiplication between two Small, Negative numbers in base-10
     * (decimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalNegativeSmallMultiplication() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-1d -2d *");
        assertEquals("Incorrect computation.", "2", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate division between two Small, Negative numbers in base-10
     * (decimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalNegativeSmallDivision() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-1d -2d /");
        assertEquals("Incorrect computation.", "0", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate exponentiation between two Small, Negative numbers in base-10
     * (decimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalNegativeSmallExponentiation() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-1d -2d ^");
        assertEquals("Incorrect computation.", "-1", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate modulus between two Small, Negative numbers in base-10
     * (decimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalNegativeSmallModulus() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-1d -2d %");
        assertEquals("Incorrect computation.", "-1", answer);
    }

    // TEST CASES FOR DECIMAL ZERO LARGE NUMBERS

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate addition between zero and one Large, positive numbers in
     * base-10 (decimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalZeroLargeAddition() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0d 78910d +");
        assertEquals("Incorrect computation.", "78910", answer);

    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate subtraction between zero and one Large, positive numbers in
     * base-10 (decimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalZeroLargeSubtraction() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-0d 78910d -");
        assertEquals("Incorrect computation.", "-78910", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate multiplication between zero and one Large, positive numbers in
     * base-10 (decimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalZeroLargeMultiplication() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0d 78910d *");
        assertEquals("Incorrect computation.", "0", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate division between zero and one Large, positive numbers in
     * base-10 (decimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalZeroLargeDivision() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0d 78910d /");
        assertEquals("Incorrect computation.", "0", answer);
    }


    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate modulus between zero and one Large, positive numbers in base-10
     * (decimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalZeroLargeModulus() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0d 78910d %");
        assertEquals("Incorrect computation.", "0", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate factorial of zero in base-10 (decimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalZeroFactorial() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0d !");
        assertEquals("Incorrect computation.", "1", answer);
    }

    // TEST CASES FOR DECIMAL Zero SMALL NUMBERS

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate addition between zero and one Small, positive numbers in
     * base-10 (decimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalZeroSmallAddition() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0d 2d +");
        assertEquals("Incorrect computation.", "2", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate subtraction between zero and one Small, positive numbers in
     * base-10 (decimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalZeroSmallSubtraction() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0d 2d -");
        assertEquals("Incorrect computation.", "-2", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate multiplication between zero and one Small, positive numbers in
     * base-10 (decimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalZeroSmallMultiplication() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0d 2d *");
        assertEquals("Incorrect computation.", "0", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate division between zero and one Small, positive numbers in
     * base-10 (decimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalZeroSmallDivision() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0d 2d /");
        assertEquals("Incorrect computation.", "0", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate exponentiation between zero and one Small, positive numbers in
     * base-10 (decimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalZeroSmallExponentiation() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0d 2d ^");
        assertEquals("Incorrect computation.", "0", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate modulus between zero and one Small, positive numbers in base-10
     * (decimal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalZeroSmallModulus() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0d 2d %");
        assertEquals("Incorrect computation.", "0", answer);
    }


}
