package JCalculator;

import java.util.Stack;

/**
 * Write a calculator for evaluating arithmetic expressions.
 *
 * An expression can consist of:
 *
 * Digits (0-9)
 * Dots as decimal marks (valid example: 100.02, not valid example : 100..02)
 * Parentheses
 * Mathematical symbols (allowed are : "+", "-", "*", "/")
 * Rounding is to be performed to 4 significant digits, only the final result is to be rounded. Example: 102.12356 -> 102.1236
 */

public class Calculator {
    private static Stack<Integer> stack = new Stack();

    public String evaluate(String statement){

        char[] array = statement.toCharArray();

        return null;
    }
}