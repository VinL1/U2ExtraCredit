import java.util.Scanner;

public class CalculatorRunner {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);

        System.out.print ("Enter an expression with *, /, +, -, %, or ^: ");
        String inp = input.nextLine();

        Calculator calc = new Calculator(inp);

        if (inp.contains ("*")) {
            System.out.println("The answer is: " + calc.multiply());
        }
        else if (inp.contains("/")) {
            System.out.println("The answer is: " + calc.divide());
        }
        else if (inp.contains ("+")) {
            System.out.println("The answer is: " + calc.add());
        }
        else if (inp.contains ("%")) {
            System.out.println("The answer is: " + calc.mod());
        }
        else if (inp.contains ("^")) {
            System.out.println("The answer is: " + calc.exponent());
        }
        else {
            System.out.println("The answer is: " + calc.subtract());
        }
    }
}
