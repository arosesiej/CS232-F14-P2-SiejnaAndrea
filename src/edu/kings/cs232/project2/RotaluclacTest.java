package edu.kings.cs232.project2;

import static org.junit.Assert.*;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

import edu.kings.cs232.project2.Rotaluclac;
import edu.kings.cs232.project2.InvalidNumberFormatException;
import edu.kings.cs232.project2.InvalidEquationException;



/**
 * 
 * Test cases for the Rotaluclac class.
 * 
 * @author Andrea Siejna
 *
 */

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RotaluclacTest {

    /**
     * Test method for Rotaluclac's calculate method. Throws an
     * InvalidNUmberFormatException when given an incorrect format for its desired base.
     * 
     * @throws InvalidNumberFormatException
     */
    @Test(expected = InvalidNumberFormatException.class)
    public void testCalculatesThrowsINFE() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        calculatorTester.calculate("4Ed 2Fd +");
    }

    /**
     * Test method for Rotaluclac's calculate method. Throws an
     * InvalidEquationException when given an incorrect operator.
     * 
     * @throws InvalidEquationException
     */
    @Test(expected = InvalidEquationException.class)
    public void testCalculatesThrowsIEEInvalidOperation() throws InvalidEquationException, InvalidNumberFormatException {

        Rotaluclac calculatorTester = new Rotaluclac();
        calculatorTester.calculate("6 5 &");
    }

    /**
     * Test method for Rotaluclac's calculate method. Throws an
     * InvalidEquationException when given too few numbers to calculate.
     * 
     * @throws InvalidEquationException
     */
    @Test(expected = InvalidEquationException.class)
    public void testCalculatesThrowsIEEFewOperands() throws InvalidEquationException, InvalidNumberFormatException {

        Rotaluclac calculatorTester = new Rotaluclac();
        calculatorTester.calculate("5 +");
    }

    /**
     * Test method for Rotaluclac's calculate method. Throws an
     * InvalidEquationException when given too few operations to calculate.
     * 
     * @throws InvalidEquationException
     */
    @Test(expected = InvalidEquationException.class)
    public void testCalculatesThrowsIEEFewOperators() throws InvalidEquationException, InvalidNumberFormatException {

        Rotaluclac calculatorTester = new Rotaluclac();
        calculatorTester.calculate("1000 4 5 +");
    }
    



    
   // DIFFERENT BASES TEST - last binary
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate addition between different bases.
     * 
     * Octal + Binary.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalBinaryAddition() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("361100o 10011010000111110b +");
        // 202366
        assertEquals("Incorrect computation.", "110001011001111110", answer);

    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate addition between different bases.
     * 
     * Decimal + Binary = Binary.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalBinaryAddition() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("123456d 10011010000111110b +");
        // 202366
        assertEquals("Incorrect computation.", "110001011001111110", answer);

    }
    

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate addition between different bases.
     * 
     * Hexadecimal + Binary = Binary.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalBinaryAddition() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("123456d 10011010000111110b +");
        // 202366
        assertEquals("Incorrect computation.", "110001011001111110", answer);

    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate subtraction between different bases.
     * 
     * Octal - Binary = Binary
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalBinarySubtraction() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1o 10b -");
        assertEquals("Incorrect computation.", "-1", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate subtraction between different bases.
     * 
     * Decimal - Binary = Binary.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalBinarySubtraction() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1d 10b -");
        assertEquals("Incorrect computation.", "-1", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate subtraction between different bases.
     * 
     * Hexadecimal - Binary = Binary.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalBinarySubtraction() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1h 10b -");
        assertEquals("Incorrect computation.", "-1", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate multiplication between different bases.
     * 
     * Octal * Binary = Binary.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalBinaryMultiplication() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1o 10b *");
        assertEquals("Incorrect computation.", "10", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate multiplication between different bases.
     * 
     * Decimal * Binary = Binary.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalBinaryMultiplication() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1d 10b *");
        assertEquals("Incorrect computation.", "10", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate multiplication between different bases.
     * 
     * Hexadecimal * Binary = Binary.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalBinaryMultiplication() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1h 10b *");
        assertEquals("Incorrect computation.", "10", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate division between different bases.
     * 
     * Octal / Binary = Binary
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalBinaryDivision() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1o 10b /");
        assertEquals("Incorrect computation.", "0", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate division between different bases.
     * 
     * Decimal / Binary = Binary.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalBinaryDivision() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1d 10b /");
        assertEquals("Incorrect computation.", "0", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate division between different bases.
     * 
     * Hexadecimal / Binary = Binary.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecmialBinaryDivision() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1h 10b /");
        assertEquals("Incorrect computation.", "0", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate modulus between different bases.
     * 
     * Octal % Binary = Binary
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalBinaryModulus() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1o 10b %");
        assertEquals("Incorrect computation.", "1", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate modulus between different bases.
     * 
     * Decimal % Binary = Binary.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalBinaryModulus() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1d 10b %");
        assertEquals("Incorrect computation.", "1", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate modulus between different bases.
     * 
     * Hexadecimal % Binary = Binary.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalBinaryModulus() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1h 10b %");
        assertEquals("Incorrect computation.", "1", answer);
    }

    // DIFFERENT BASES - octal last
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate addition between different bases.
     * 
     * Binary + Octal = Octal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryOctalAddition() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("11110001001000000b 232076o +");
        // 202366
        assertEquals("Incorrect computation.", "613176", answer);

    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate addition between different bases.
     * 
     * Decimal + Octal = Octal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalOctalAddition() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("123456d 232076o +");
        // 202366
        assertEquals("Incorrect computation.", "613176", answer);

    }
    

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate addition between different bases.
     * 
     * Hexadecimal + Octal = Octal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalOctalAddition() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1E240h 232076o +");
        // 202366
        assertEquals("Incorrect computation.", "613176", answer);

    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate subtraction between different bases.
     * 
     * Binary - Octal = Octal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryOctalSubtraction() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1b 2o -");
        assertEquals("Incorrect computation.", "-1", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate subtraction between different bases.
     * 
     * Decimal - Octal = Octal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalOctalSubtraction() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1d 2o -");
        assertEquals("Incorrect computation.", "-1", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate subtraction between different bases.
     * 
     * Hexadecimal - Octal = Octal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalOctalSubtraction() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1h 2o -");
        assertEquals("Incorrect computation.", "-1", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate multiplication between different bases.
     * 
     * Binary * Octal = Octal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryOctalMultiplication() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1b 2o *");
        assertEquals("Incorrect computation.", "2", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate multiplication between different bases.
     * 
     * Decimal * Octal = Octal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalOctalMultiplication() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1d 2o *");
        assertEquals("Incorrect computation.", "2", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate multiplication between different bases.
     * 
     * Hexadecimal * Octal = Octal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalOctalMultiplication() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1h 2o *");
        assertEquals("Incorrect computation.", "2", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate division between different bases.
     * 
     * Binary / Octal = Octal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryOctalDivision() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1b 2o /");
        assertEquals("Incorrect computation.", "0", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate division between different bases.
     * 
     * Decimal / Octal = Octal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalOctalDivision() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1d 2o /");
        assertEquals("Incorrect computation.", "0", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate division between different bases.
     * 
     * Hexadecimal / Octal = Octal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalOctalDivision() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1h 2o /");
        assertEquals("Incorrect computation.", "0", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate modulus between different bases.
     * 
     * Binary % Octal = Octal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryOctalModulus() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1b 2o %");
        assertEquals("Incorrect computation.", "1", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate modulus between different bases.
     * 
     * Decimal % Octal = Octal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalOctalModulus() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1d 2o %");
        assertEquals("Incorrect computation.", "1", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate modulus between different bases.
     * 
     * Hexadecimal % Octal = Octal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalOctalModulus() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1h 2o %");
        assertEquals("Incorrect computation.", "1", answer);
    }


    // DIFFERENT BASES - decimal last
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate addition between different bases.
     * 
     * Binary + Decimal = Decimal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryDecimalAddition() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("11110001001000000b 78910d +");
        // 202366
        assertEquals("Incorrect computation.", "202366", answer);

    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate addition between different bases.
     * 
     * Decimal + Decimal = Decimal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalDecimalAddition() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("123456d 78910d +");
        // 202366
        assertEquals("Incorrect computation.", "202366", answer);

    }
    

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate addition between different bases.
     * 
     * Hexadecimal + Decimal = Decimal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalDecimalAddition() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1E240h 78910d +");
        // 202366
        assertEquals("Incorrect computation.", "202366", answer);

    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate subtraction between different bases.
     * 
     * Binary - Decimal = Decimal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryDecimalSubtraction() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1b 2d -");
        assertEquals("Incorrect computation.", "-1", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate subtraction between different bases.
     * 
     * Decimal - Decimal = Decimal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalDecimalSubtraction() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1o 2d -");
        assertEquals("Incorrect computation.", "-1", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate subtraction between different bases.
     * 
     * Hexadecimal - Decimal = Decimal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalDecimalSubtraction() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1h 2d -");
        assertEquals("Incorrect computation.", "-1", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate multiplication between different bases.
     * 
     * Binary * Decimal = Decimal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryDecimalMultiplication() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1b 2d *");
        assertEquals("Incorrect computation.", "2", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate multiplication between different bases.
     * 
     * Decimal * Decimal = Decimal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalDecimalMultiplication() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1o 2d *");
        assertEquals("Incorrect computation.", "2", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate multiplication between different bases.
     * 
     * Hexadecimal * Decimal = Decimal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalDecimalMultiplication() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1h 2d *");
        assertEquals("Incorrect computation.", "2", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate division between different bases.
     * 
     * Binary / Decimal = Decimal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryDecimalDivision() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1b 2d /");
        assertEquals("Incorrect computation.", "0", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate division between different bases.
     * 
     * Decimal / Decimal = Decimal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalDecimalDivision() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1o 2d /");
        assertEquals("Incorrect computation.", "0", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate division between different bases.
     * 
     * Hexadecimal / Decimal = Decimal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalDecimalDivision() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1h 2d /");
        assertEquals("Incorrect computation.", "0", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate modulus between different bases.
     * 
     * Binary % Decimal = Decimal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryDecimalModulus() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1b 2d %");
        assertEquals("Incorrect computation.", "1", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate modulus between different bases.
     * 
     * Decimal % Decimal = Decimal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalDecimalModulus() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1o 2d %");
        assertEquals("Incorrect computation.", "1", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate modulus between different bases.
     * 
     * Hexadecimal % Decimal = Decimal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesHexadecimalDecimalModulus() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1h 2d %");
        assertEquals("Incorrect computation.", "1", answer);
    }
    
    // DIFFERENT BASES - hexadecimal last
    
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate addition between different bases.
     * 
     * Binary + Hexadecimal = Hexadecimal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryHexadecimalAddition() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("11110001001000000b 1343Eh +");
        // 202366
        assertEquals("Incorrect computation.", "3167E", answer);

    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate addition between different bases.
     * 
     * Decimal + Hexadecimal = Hexadecimal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalHexadecimalAddition() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("123456d 1343Eh +");
        // 202366
        assertEquals("Incorrect computation.", "3167E", answer);

    }
    

    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate addition between different bases.
     * 
     * Hexadecimal + Hexadecimal = Hexadecimal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalHexadecimalAddition() throws InvalidNumberFormatException, InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1E240h 1343Eh +");
        // 202366
        assertEquals("Incorrect computation.", "3167E", answer);

    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate subtraction between different bases.
     * 
     * Binary - Hexadecimal = Hexadecimal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryHexadecimalSubtraction() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1b 2h -");
        assertEquals("Incorrect computation.", "-1", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate subtraction between different bases.
     * 
     * Decimal - Hexadecimal = Hexadecimal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalHexadecimalSubtraction() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1o 2h -");
        assertEquals("Incorrect computation.", "-1", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate subtraction between different bases.
     * 
     * Hexadecimal - Hexadecimal = Hexadecimal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalHexadecimalSubtraction() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1h 2h -");
        assertEquals("Incorrect computation.", "-1", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate multiplication between different bases.
     * 
     * Binary * Hexadecimal = Hexadecimal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryHexadecimalMultiplication() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1b 2h *");
        assertEquals("Incorrect computation.", "2", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate multiplication between different bases.
     * 
     * Decimal * Hexadecimal = Hexadecimal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalHexadecimalMultiplication() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1o 2h *");
        assertEquals("Incorrect computation.", "2", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate multiplication between different bases.
     * 
     * Hexadecimal * Hexadecimal = Hexadecimal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalHexadecimalMultiplication() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1h 2h *");
        assertEquals("Incorrect computation.", "2", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate division between different bases.
     * 
     * Binary / Hexadecimal = Hexadecimal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryHexadecimalDivision() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1b 2h /");
        assertEquals("Incorrect computation.", "0", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate division between different bases.
     * 
     * Decimal / Hexadecimal = Hexadecimal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalHexadecimalDivision() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1o 2h /");
        assertEquals("Incorrect computation.", "0", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate division between different bases.
     * 
     * Hexadecimal / Hexadecimal = Hexadecimal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalHexadecimalDivision() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1h 2h /");
        assertEquals("Incorrect computation.", "0", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate modulus between different bases.
     * 
     * Binary % Hexadecimal = Hexadecimal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesBinaryHexadecimalModulus() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1b 2h %");
        assertEquals("Incorrect computation.", "1", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate modulus between different bases.
     * 
     * Decimal % Hexadecimal = Hexadecimal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesOctalHexadecimalModulus() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1o 2h %");
        assertEquals("Incorrect computation.", "1", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate modulus between different bases.
     * 
     * Hexadecimal % Hexadecimal = Hexadecimal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesDecimalHexadecimalModulus() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1h 2h %");
        assertEquals("Incorrect computation.", "1", answer);
    }
    
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate a complex equation in decimal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesComplexMethod() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("123 456 + 90 * 678 / 5 -");
        assertEquals("Incorrect computation.", "71", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate a complex equation in decimal.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesComplexMethod2() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("500 123 2899 + 456 * + 372 -");
        assertEquals("Incorrect computation.", "1378160", answer);
    }
    
    /**
     * Test method for Rotaluclac's calculate method. Sees if we can properly
     * calculate a complex equation in different bases.
     * 
     * @throws InvalidEquationException
     * @throws InvalidNumberFormatException
     * 
     */
    @Test
    public void testCalculatesComplexMethodDiffBases() throws InvalidNumberFormatException,
            InvalidEquationException {

        Rotaluclac calculatorTester = new Rotaluclac();
        String answer = calculatorTester.calculate("1111011b 710o + 90d * 2A6h / 101b -");
        assertEquals("Incorrect computation.", "1000111", answer);
    }
}
