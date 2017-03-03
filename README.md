Reverse Polish Notation
Reverse Polish Notation (RPN) is a way to represent mathematical expressions that are easy for computers to read. In this
exercise, we're going to create a limited RPN calculator.
In RPN, two numbers come first, followed by an operator. It is evaluated left to right, so the result of the previous expression
is used in the next. (Examples below.)
Your Solution
Your solution should take input from the user for an RPN expression, evaluate it, then print the output. We will keep this
simple, so we will only implement multiplication (*), division (/), addition (+), and substraction (-). Also, assume the user will
enter a valid expression. (No error handling necessary.)
Example input and output
RPN expression (input) is the same as… evaluates to… (output)
3 4 * 3 * 4 12
5 6 + 5 + 6 11
3 4 * 5 + 3 * 4 + 5 17
5 6 + 4 * (5 + 6) * 4 44
Required Tasks
Create an Operator interface, declaring an apply method which:
accepts two operators of type `double'.
returns a result of type double .
Create classes which implement Operator , for the specific operations:
Multiplication
Division
Addition
Subtraction
Create an RpnApp class with a main method which:
asks for user input.
parses the user input, creating the appropriate Operator instances to perform the calculation(s).
displays the result.
loops until the user types quit instead of an RPN expression.
