import java.util.Scanner;
import java.util.Stack;
// stack method gets the user's input and puts it a + b,
// puts the operation in the right order and does it

public class RpnApp {

	public static void main(String[] args) {

		// How we will do +, -, /, and *.
		Operator add = new Addition();
		Operator mult = new Multiplication();
		Operator div = new Division();
		Operator sub = new Subtraction();

		Scanner in = new Scanner(System.in);
		
		// asks user for input
		// enter your input with spaces between so it can be read
		System.out.print("Enter your input: ");
		String input = in.nextLine();

		
		// loops until users types quit 
		while (!input.equals("quit"))
		{

			System.out.println("input: " + input);
			
			// break the users 
			// will break input into String tokens.
			String[] tokens = input.split(" ");

			// will store numbers on stack as we go.
			Stack<Double> stack = new Stack<Double>();

			// Each time we loop, we are looking at the next token
			for (int i = 0; i < tokens.length; i++)
			{
				// The current token is at index i.
				
				if (isDouble(tokens[i]))
				{
					// If we have a number, put it on the stack
					Double.valueOf(tokens[i]);
					stack.push(Double.valueOf(tokens[i]));
				}
				else if (tokens[i].equals("*"))
				{
					// Multiplication 
					// If we have an operator, pop two values from stack
					// Do the operation
					// Give the result
					Double a = stack.pop();
					Double b = stack.pop();
					stack.push(mult.apply(b, a));
				}
				else if (tokens[i].equals("+"))
				{
					// Addition 
					// If we have an operator, pop two values from stack
					// Do the operation
					// Give the result
					Double a = stack.pop();
					Double b = stack.pop();
					stack.push(add.apply(b, a));
				}
				else if (tokens[i].equals("-"))
				{
					// Subtraction 
					// If we have an operator, pop two values from stack
					// Do the operation
					// Push the result 
					Double a = stack.pop();
					Double b = stack.pop();
					stack.push(sub.apply(b, a));
				}
				else if (tokens[i].equals("/"))
				{
					// Division
					// If we have an operator, pop two values from stack
					// Do the operation
					// Give the result
					Double a = stack.pop();
					Double b = stack.pop();
					stack.push(div.apply(b, a));
				}
			}

			// will print your answer
			System.out.println("Your Answer is : " + stack.pop());
			
			// asks user for another RPN operation/expression, or  type "quit" to stop
			System.out.print("Enter your input: ");
			input = in.nextLine();
		}
	}

	
	 //Returns true if x is a Double, anything else false.

	public static boolean isDouble(String x)
	{
		try {
			Double.valueOf(x);
		} catch (Exception e)
		{
			return false;
		}

		return true;
	}
}
