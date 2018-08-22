package edu.kings.cs232.project2;

/**
 * 
 * Test cases for the Rotaluclac class.
 * 
 * These are binary specific.
 * 
 * @author Andrea Siejna
 *
 */

import static org.junit.Assert.*;

import org.junit.runners.MethodSorters;
import org.junit.FixMethodOrder;

import org.junit.Test;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class BinaryTests {

    // TEST CASES FOR BINARY OPERATIONS

    // TEST CASES FOR BINARY POSITIVE NUMBERS

    // TEST CASES FOR BINARY POSITIVE LARGE NUMBERS

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate addition between two Large, positive numbers in base-2
     * (binary).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryPositiveLargeAddition() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("11110001001000000b 10011010000111110b +");
        // 123456 + 78910 = 202366
        assertEquals("Incorrect computation.", "110001011001111110", answer);

    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate subtraction between two Large, positive numbers in base-2
     * (binary).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryPositiveLargeSubtraction() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("11110001001000000b 10011010000111110b -");
        // 44546
        assertEquals("Incorrect computation.", "1010111000000010", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate multiplication between two Large, positive numbers in base-2
     * (binary).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryPositiveLargeMultiplication() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        
        String answer = calculatorTester.calculate("010011010010b 01011000101110b *");
        assertEquals("Incorrect computation.", "11010101110100110111100", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate division between two Large, positive numbers in base-2
     * (binary).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryPositiveLargeDivision() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("11110001001000000b 10011010000111110b /");
        // 1.56451653783
        assertEquals("Incorrect computation.", "1", answer);
    }


    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate modulus between two Large, positive numbers in base-8(binary).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryPositiveLargeModulus() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("11110001001000000b 10011010000111110b %");
        // 44546
        assertEquals("Incorrect computation.", "1010111000000010", answer);
    }



    // TEST CASES FOR BINARY POSITIVE SMALL NUMBERS

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate addition between two Small, positive numbers in base-2
     * (binary).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryPositiveSmallAddition() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1b 10b +");
        assertEquals("Incorrect computation.", "11", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate subtraction between two Small, positive numbers in base-2
     * (binary).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryPositiveSmallSubtraction() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1b 10b -");
        // 1 - 2 = -1
        assertEquals("Incorrect computation.", "-1", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate multiplication between two Small, positive numbers in base-2
     * (binary).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryPositiveSmallMultiplication() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1b 10b *");
        assertEquals("Incorrect computation.", "10", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate division between two Small, positive numbers in base-2
     * (binary).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryPositiveSmallDivision() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1b 10b /");
        assertEquals("Incorrect computation.", "0", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate exponentiation between two Small, positive numbers in base-2
     * (binary).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryPositiveSmallExponentiation() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1b 10b ^");
        assertEquals("Incorrect computation.", "1", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate modulus between two Small, positive numbers in base-8(binary).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryPositiveSmallModulus() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1b 10b %");
        assertEquals("Incorrect computation.", "1", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate factorial between two Small, positive numbers in base-2
     * (binary).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryPositiveSmallFactorial() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("10b !");
        assertEquals("Incorrect computation.", "10", answer);
    }

    // TEST CASES FOR BINARY NEGATIVE NUMBERS
    // TEST CASES FOR BINARY NEGATIVE LARGE NUMBERS

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate addition between two Large, Negative numbers in base-2
     * (binary).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryNegativeLargeAddition() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-11110001001000000b -10011010000111110b +");
        // -202366
        assertEquals("Incorrect computation.", "-110001011001111110", answer);

    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate subtraction between two Large, Negative numbers in base-2
     * (binary).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryNegativeLargeSubtraction() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-11110001001000000b -10011010000111110b -");
        // -44546
        assertEquals("Incorrect computation.", "-1010111000000010", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate multiplication between two Large, Negative numbers in base-2
     * (binary).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryNegativeLargeMultiplication() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-010011010010b -01011000101110b *");
        assertEquals("Incorrect computation.", "11010101110100110111100", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate division between two Large, Negative numbers in base-2
     * (binary).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryNegativeLargeDivision() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-11110001001000000b -10011010000111110b /");
        // 1.564516...
        assertEquals("Incorrect computation.", "1", answer);
    }


     /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate modulus between two Large, Negative numbers in
     base-8(binary).
     *
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     *
     */
     @Test
     public void testCalculatesBinaryNegativeLargeModulus() throws
     InvalidNumberFormatException,
     InvalidEquationException {
    
     Rotaluclac calculatorTester = new Rotaluclac();
     String answer = calculatorTester.calculate("-11110001001000000b -10011010000111110b %");
     assertEquals("Incorrect computation.", "-1010111000000010", answer);
     }

    
    // TEST CASES FOR BINARY Negative SMALL NUMBERS

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate addition between two Small, Negative numbers in base-2
     * (binary).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryNegativeSmallAddition() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-1b -10b +");
        assertEquals("Incorrect computation.", "-11", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate subtraction between two Small, Negative numbers in base-2
     * (binary).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryNegativeSmallSubtraction() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-1b -10b -");
        assertEquals("Incorrect computation.", "1", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate multiplication between two Small, Negative numbers in base-2
     * (binary).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryNegativeSmallMultiplication() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-1b -10b *");
        assertEquals("Incorrect computation.", "10", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate division between two Small, Negative numbers in base-2
     * (binary).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryNegativeSmallDivision() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-1b -10b /");
        assertEquals("Incorrect computation.", "0", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate exponentiation between two Small, Negative numbers in base-2
     * (binary).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryNegativeSmallExponentiation() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-1b -10b ^");
        assertEquals("Incorrect computation.", "-1", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate modulus between two Small, Negative numbers in base-8(binary).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryNegativeSmallModulus() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-1b -10b %");
        assertEquals("Incorrect computation.", "-1", answer);
    }



    // TEST CASES FOR BINARY ZERO LARGE NUMBERS

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate addition between zero and one Large, positive numbers in base-2
     * (binary).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryZeroLargeAddition() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0b 10011010000111110b +");
        assertEquals("Incorrect computation.", "10011010000111110", answer);

    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate subtraction between zero and one Large, positive numbers in
     * base-2 (binary).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryZeroLargeSubtraction() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("-0b 10011010000111110b -");
        assertEquals("Incorrect computation.", "-10011010000111110", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate multiplication between zero and one Large, positive numbers in
     * base-2 (binary).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryZeroLargeMultiplication() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0b 10011010000111110b *");
        assertEquals("Incorrect computation.", "0", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate division between zero and one Large, positive numbers in base-2
     * (binary).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryZeroLargeDivision() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0b 10011010000111110b /");
        assertEquals("Incorrect computation.", "0", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate exponentiation between zero and one Large, positive numbers in
     * base-2 (binary).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryZeroLargeExponentiation() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0b 10011010000111110b ^");
        assertEquals("Incorrect computation.", "0", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate modulus between zero and one Large, positive numbers in
     * base-8(binary).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryZeroLargeModulus() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0b 10011010000111110b %");
        assertEquals("Incorrect computation.", "0", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate factorial of zero in base-2 (binary).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryZeroFactorial() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0b !");
        assertEquals("Incorrect computation.", "1", answer);
    }

    // TEST CASES FOR BINARY Zero SMALL NUMBERS

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate addition between zero and one Small, positive numbers in base-2
     * (binary).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryZeroSmallAddition() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0b 10b +");
        assertEquals("Incorrect computation.", "10", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate subtraction between zero and one Small, positive numbers in
     * base-2 (binary).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryZeroSmallSubtraction() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0b 10b -");
        assertEquals("Incorrect computation.", "-10", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate multiplication between zero and one Small, positive numbers in
     * base-2 (binary).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryZeroSmallMultiplication() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0b 10b *");
        assertEquals("Incorrect computation.", "0", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate division between zero and one Small, positive numbers in base-2
     * (binary).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryZeroSmallDivision() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0b 10b /");
        assertEquals("Incorrect computation.", "0", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate exponentiation between zero and one Small, positive numbers in
     * base-2 (binary).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryZeroSmallExponentiation() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0b 10b ^");
        assertEquals("Incorrect computation.", "0", answer);
    }

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate modulus between zero and one Small, positive numbers in
     * base-8(binary).
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryZeroSmallModulus() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("0b 10b %");
        assertEquals("Incorrect computation.", "0", answer);
    }
}
