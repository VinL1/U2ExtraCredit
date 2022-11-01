import java.util.Scanner;

public class CalculatorRunner {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);

        System.out.println ("Enter an expression with *, /, +, -, %, or ^: ");
        String inp = input.nextLine();

        Calculator calc = new Calculator(inp);

        if (inp.contains ("*")) {
            System.out.println(calc.multiply());
        }
        else if (inp.contains("/")) {
            System.out.println(calc.divide());
        }
        else if (inp.contains ("+")) {
            System.out.println(calc.add());
        }
        else if (inp.contains ("%")) {
            System.out.println(calc.mod());
        }
        else if (inp.contains ("^")) {
            System.out.println(calc.exponent());
        }
        else {
            System.out.println(calc.subtract());
        }
    }
}
