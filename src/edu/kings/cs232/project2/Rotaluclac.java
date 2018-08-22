package edu.kings.cs232.project2;

/**
 * Class that implements a calculator in Reverse Polish Notation by use of a Stack.
 * 
 * @author Andrea Siejna
 * @version 11.6.14
 *
 */
public class Rotaluclac implements Calculator {

    @Override
    public String calculate(String postfixEqn) throws InvalidEquationException,
            InvalidNumberFormatException {

        // Overall final calculation
        String finalAnswer = "";

        // Create our linked stack to calculate with

        LinkedStack<Long> stack = new LinkedStack<Long>();

        // Turn the postfixEqn into an array of each expression: operator or
        // operand
        String[] postfixArray = postfixEqn.split(" ");

        int lastBase = 0;

        // Start calculating
        for (int i = 0; i < postfixArray.length; i++) {

            // Get the current expression
            String current = postfixArray[i];
            String base = "";

            boolean isOperator = false;
            boolean isFactorial = false;

            // If its an operator

            if (current.equals("+") || current.equals("-") || current.equals("*")
                    || current.equals("/") || current.equals("^") || current.equals("%")) {

                isOperator = true;

            } 
            else if (current.equals("!")) {

                isOperator = true;
                isFactorial = true;

            } 
            else {

                boolean throwIEE = false;
                throwIEE = !(current.matches("[a-zA-Z0-9-]*"));

                if (throwIEE) {
                    throw new InvalidEquationException("Invalid character!");
                }

            }

            // See if its an operator
            if (isOperator) {

                // If too few operands
                // Stack must have at least 2 numbers to calculate,
                // unless if factorial
                if (isFactorial) {

                    if (stack.size() < 1) {
                        throw new InvalidEquationException("Too few operands!");
                    } 
                    else {

                    }

                } 
                else {

                    if (stack.size() < 2) {
                        throw new InvalidEquationException("Too few operands!");
                    }

                }

                long calc1 = stack.pop().longValue();
                long calc2 = 0;

                long answer = 0;

                if (current.equals("+")) {
                    calc2 = stack.pop().longValue();
                    answer = calc2 + calc1;

                } 
                else if (current.equals("-")) {
                    calc2 = stack.pop().longValue();
                    answer = calc2 - calc1;

                } 
                else if (current.equals("*")) {
                    calc2 = stack.pop().longValue();
                    answer = calc2 * calc1;

                } 
                else if (current.equals("/")) {
                    calc2 = stack.pop().longValue();
                    answer = calc2 / calc1;

                } 
                else if (current.equals("^")) {
                    calc2 = stack.pop().longValue();
                    answer = calc2;

                    for (int k = 0; k < calc1; k++) {
                        answer *= calc2;
                    }

                } 
                else if (current.equals("%")) {
                    calc2 = stack.pop().longValue();
                    answer = calc2 % calc1;

                } 
                else {

                    // We cannot compute negative factorials
                    if (calc1 >= 0) {

                        double n = calc1;

                        answer = 1;
                        for (int k = 1; k <= n; k++) {
                            answer *= k;
                        }

                        stack.push(answer);
                        break;
                    } 
                    else {

                        throw new InvalidEquationException("Cannot compute negative factorials.");

                    }

                }

                stack.push(answer);

                // Otherwise operand or value
            } 
            else {

                // find the base
                base = current.substring(current.length() - 1, current.length());

                // if this was an expression w/o a base like 16, we assume its
                // decimal

                int baseInt = 0;

                if (base.equals("b")) {

                    baseInt = 2;

                } 
                else if (base.equals("o")) {

                    baseInt = 8;

                } 
                else if (base.equals("d")) {

                    baseInt = 10;

                } 
                else if (base.equals("h")) {

                    baseInt = 16;

                } 
                else {

                    current = current + "d";
                    base = "d";
                    baseInt = 10;

                }

                // remove the base
                current = current.substring(0, current.length() - 1);

                // take the expression and turn it into an integer
                try {
                    long currentInt = Integer.parseInt(current, baseInt);
                    stack.push(currentInt);

                    lastBase = baseInt;
                    
                } catch (NumberFormatException e) {
                    
                    throw new InvalidNumberFormatException("Wrong base!");
                }

            }

        }

        boolean isNegative = false;

        if (stack.size() == 1) {
            Long finalAnswerLong = stack.pop();

            // Dealing with negative numbers
            // Take and turn to positive for conversions sake
            if (finalAnswerLong < 0) {
                isNegative = true;
                finalAnswerLong *= -1;

            }

            if (lastBase == 2) {

                finalAnswer = Long.toBinaryString(finalAnswerLong);

            } 
            else if (lastBase == 8) {

                finalAnswer = Long.toOctalString(finalAnswerLong);

            } 
            else if (lastBase == 10) {

                finalAnswer = Long.toString(finalAnswerLong);

            } 
            else {

                finalAnswer = Long.toHexString(finalAnswerLong);
                finalAnswer = finalAnswer.toUpperCase();

            }

        } 
        else {
            throw new InvalidEquationException("Too many operands!");
        }

        if (isNegative) {
            finalAnswer = "-" + finalAnswer;
        }

        return finalAnswer;

    }
}
