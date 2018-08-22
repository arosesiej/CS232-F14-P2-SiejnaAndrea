package edu.kings.cs232.project2;

/**
 * 
 * Test cases for the Rotaluclac class.
 * 
 * These are octal specific.
 * 
 * @author Andrea Siejna
 *
 */

import static org.junit.Assert.*;

import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;

import org.junit.Test;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class OctalTests {

    // TEST CASES FOR OCTAL OPERATIONS

    // TEST CASES FOR OCTAL OPERATIONS

    // TEST CASES FOR OCTAL POSITIVE NUMBERS

    // TEST CASES FOR OCTAL POSITIVE LARGE NUMBERS

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate addition between two Large, positive numbers in base-8 (octal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalPositiveLargeAddition() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("361100o 232076o +");
        // 202366
        assertEquals("Incorrect computation.", "613176", answer);

    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate subtraction between two Large, positive numbers in base-8
     * (octal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalPositiveLargeSubtraction() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("361100o 232076o -");
        // 44546
        assertEquals("Incorrect computation.", "127002", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate multiplication between two Large, positive numbers in base-8
     * (octal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalPositiveLargeMultiplication() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        // 9741912960
        String answer = calculatorTester.calculate("361100o 232076o *");
        assertEquals("Incorrect computation.", "110452345600", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate division between two Large, positive numbers in base-8 (octal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalPositiveLargeDivision() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("361100o 232076o /");
        // 1.56451653783
        assertEquals("Incorrect computation.", "1", answer);
    }


    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate modulus between two Large, positive numbers in base-8 (octal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalPositiveLargeModulus() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("361100o 232076o %");
        // 44546
        assertEquals("Incorrect computation.", "127002", answer);
    }

    // TEST CASES FOR OCTAL POSITIVE SMALL NUMBERS

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate addition between two Small, positive numbers in base-8 (octal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalPositiveSmallAddition() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1o 2o +");
        assertEquals("Incorrect computation.", "3", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate subtraction between two Small, positive numbers in base-8
     * (octal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalPositiveSmallSubtraction() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1o 2o -");
        assertEquals("Incorrect computation.", "-1", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate multiplication between two Small, positive numbers in base-8
     * (octal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalPositiveSmallMultiplication() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1o 2o *");
        assertEquals("Incorrect computation.", "2", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate division between two Small, positive numbers in base-8 (octal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalPositiveSmallDivision() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1o 2o /");
        assertEquals("Incorrect computation.", "0", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate exponentiation between two Small, positive numbers in base-8
     * (octal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalPositiveSmallExponentiation() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1o 2o ^");
        assertEquals("Incorrect computation.", "1", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate modulus between two Small, positive numbers in base-8 (octal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalPositiveSmallModulus() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1o 2o %");
        assertEquals("Incorrect computation.", "1", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate factorial between two Small, positive numbers in base-8
     * (octal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalPositiveSmallFactorial() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("2o !");
        assertEquals("Incorrect computation.", "2", answer);
    }

    // TEST CASES FOR OCTAL NEGATIVE NUMBERS
    // TEST CASES FOR OCTAL NEGATIVE LARGE NUMBERS

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate addition between two Large, Negative numbers in base-8 (octal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalNegativeLargeAddition() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-361100o -232076o +");
        // -202366
        assertEquals("Incorrect computation.", "-613176", answer);

    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate subtraction between two Large, Negative numbers in base-8
     * (octal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalNegativeLargeSubtraction() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-361100o -232076o -");
        // -44546
        assertEquals("Incorrect computation.", "-127002", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate multiplication between two Large, Negative numbers in base-8
     * (octal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalNegativeLargeMultiplication() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-361100o -232076o *");
        // 9741912960
        assertEquals("Incorrect computation.", "110452345600", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate division between two Large, Negative numbers in base-8 (octal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalNegativeLargeDivision() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-361100o -232076o /");
        // 1.564516...
        assertEquals("Incorrect computation.", "1", answer);
    }


    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate modulus between two Large, Negative numbers in base-8 (octal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalNegativeLargeModulus() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-361100o -232076o %");
        // -44546
        assertEquals("Incorrect computation.", "-127002", answer);
    }



    // TEST CASES FOR OCTAL Negative SMALL NUMBERS

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate addition between two Small, Negative numbers in base-8 (octal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalNegativeSmallAddition() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-1o -2o +");
        assertEquals("Incorrect computation.", "-3", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate subtraction between two Small, Negative numbers in base-8
     * (octal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalNegativeSmallSubtraction() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-1o -2o -");
        assertEquals("Incorrect computation.", "1", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate multiplication between two Small, Negative numbers in base-8
     * (octal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalNegativeSmallMultiplication() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-1o -2o *");
        assertEquals("Incorrect computation.", "2", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate division between two Small, Negative numbers in base-8 (octal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalNegativeSmallDivision() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-1o -2o /");
        assertEquals("Incorrect computation.", "0", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate exponentiation between two Small, Negative numbers in base-8
     * (octal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalNegativeSmallExponentiation() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-1o -2o ^");
        assertEquals("Incorrect computation.", "-1", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate modulus between two Small, Negative numbers in base-8 (octal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalNegativeSmallModulus() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-1o -2o %");
        assertEquals("Incorrect computation.", "-1", answer);
    }



    // TEST CASES FOR OCTAL ZERO LARGE NUMBERS

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate addition between zero and one Large, positive numbers in base-8
     * (octal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalZeroLargeAddition() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0o 232076o +");
        assertEquals("Incorrect computation.", "232076", answer);

    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate subtraction between zero and one Large, positive numbers in
     * base-8 (octal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalZeroLargeSubtraction() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-0o 232076o -");
        assertEquals("Incorrect computation.", "-232076", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate multiplication between zero and one Large, positive numbers in
     * base-8 (octal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalZeroLargeMultiplication() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0o 232076o *");
        assertEquals("Incorrect computation.", "0", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate division between zero and one Large, positive numbers in base-8
     * (octal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalZeroLargeDivision() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0o 232076o /");
        assertEquals("Incorrect computation.", "0", answer);
    }


    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate modulus between zero and one Large, positive numbers in base-8
     * (octal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalZeroLargeModulus() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0o 232076o %");
        assertEquals("Incorrect computation.", "0", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate factorial of zero in base-8 (octal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalZeroFactorial() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0o !");
        assertEquals("Incorrect computation.", "1", answer);
    }

    // TEST CASES FOR OCTAL Zero SMALL NUMBERS

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate addition between zero and one Small, positive numbers in base-8
     * (octal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalZeroSmallAddition() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0o 2o +");
        assertEquals("Incorrect computation.", "2", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate subtraction between zero and one Small, positive numbers in
     * base-8 (octal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalZeroSmallSubtraction() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0o 2o -");
        assertEquals("Incorrect computation.", "-2", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate multiplication between zero and one Small, positive numbers in
     * base-8 (octal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalZeroSmallMultiplication() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0o 2o *");
        assertEquals("Incorrect computation.", "0", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate division between zero and one Small, positive numbers in base-8
     * (octal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalZeroSmallDivision() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0o 2o /");
        assertEquals("Incorrect computation.", "0", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate exponentiation between zero and one Small, positive numbers in
     * base-8 (octal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalZeroSmallExponentiation() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0o 2o ^");
        assertEquals("Incorrect computation.", "0", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate modulus between zero and one Small, positive numbers in base-8
     * (octal).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalZeroSmallModulus() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0o 2o %");
        assertEquals("Incorrect computation.", "0", answer);
    }
}
