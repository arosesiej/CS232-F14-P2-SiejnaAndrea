package edu.kings.cs232.project2;

import java.util.Scanner;

/**
 * Main method to test Rotaluclac.
 * 
 * @author Andrea Siejna
 *
 */
public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String postfixEqn = "";

        do {

            System.out.println("Enter an equation in RPN: ");
            postfixEqn = input.nextLine();

            // Handle going to next line

            if (postfixEqn.equalsIgnoreCase("quit")) {

            } else {
                try {

                    Rotaluclac calculator = new Rotaluclac();
                    String answer = calculator.calculate(postfixEqn);
                    System.out.println("Answer: " + answer);

                }

                catch (InvalidEquationException e) {

                    System.out.println(e.getMessage());

                }

                catch (InvalidNumberFormatException e) {

                    System.out.println(e.getMessage());

                }

            }

        } while (!postfixEqn.equals("quit"));

        // PASS IT A MESSAGE

    }

}
