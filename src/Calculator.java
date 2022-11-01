public class Calculator {
    private String equation;

    private double dob1;
    private double dob2;

    private int int1;
    private int int2;

    private String answer;

    public Calculator (String equation) {
        this.equation = equation;
    }

    public String add () {
        if (equation.contains(".")) {
            dob1 = Double.parseDouble(equation.substring(0, equation.indexOf("+")));
            dob2 = Double.parseDouble(equation.substring(equation.indexOf("+") + 1));
            answer = Double.toString(dob1 + dob2);
            return answer;
        }
        else {
            int1 = Integer.parseInt(equation.substring(0, equation.indexOf("+")));
            int2 = Integer.parseInt(equation.substring(equation.indexOf("+")));
            answer = Integer.toString (int1 + int2);
            return answer;
        }
    }

    public String subtract () {
        if (equation.contains(".")) {
            if (equation.indexOf("-") != 0) { /*if all positive */
                dob1 = Double.parseDouble(equation.substring(0, equation.indexOf("-")));
                dob2 = Double.parseDouble(equation.substring(equation.substring(1).indexOf ("-")) + 1);
                answer = Double.toString(dob1 - dob2);
                return answer;
            }
            else {
                if ((equation.indexOf("-") == 0)) { /* if first number negative */
                    dob1 = Double.parseDouble(equation.substring(0, (equation.substring(1)).indexOf("-")));
                } else {
                    dob1 = Double.parseDouble(equation.substring(0, equation.indexOf("-")));
                }
                dob2 = Double.parseDouble(equation.substring((equation.substring(1).indexOf("-") + 1)));
                answer = Double.toString(dob1 - dob2);
                return answer;
            }
        }
        else {
            if (equation.indexOf("-") != 0) { /*if all positive */
                int1 = Integer.parseInt(equation.substring(0, equation.indexOf("-")));
                dob2 = Integer.parseInt(equation.substring(equation.substring(1).indexOf ("-")) + 1);
                answer = Integer.toString(int1 - int2);
                return answer;
            }
            else {
                if ((equation.indexOf("-") == 0)) { /* if first number negative */
                    int1 = Integer.parseInt(equation.substring(0, (equation.substring(1)).indexOf("-")));
                } else {
                    int1 = Integer.parseInt(equation.substring(0, equation.indexOf("-")));
                }
                int2 = Integer.parseInt(equation.substring((equation.substring(1).indexOf("-") + 1)));
                answer = Integer.toString(int1 - int2);
                return answer;
            }
        }
    }

    public String multiply () {
        if (equation.contains(".")) {
            dob1 = Double.parseDouble(equation.substring(0, equation.indexOf("*")));
            dob2 = Double.parseDouble(equation.substring(equation.indexOf("*") + 1));
            answer = Double.toString(dob1 * dob2);
            return answer;
        }
        else {
            int1 = Integer.parseInt(equation.substring(0, equation.indexOf("*")));
            int2 = Integer.parseInt(equation.substring(equation.indexOf("*")));
            answer = Integer.toString (int1 * int2);
            return answer;
        }
    }

    public String divide () {
        if (equation.contains(".")) {
            dob1 = Double.parseDouble(equation.substring(0, equation.indexOf("/")));
            dob2 = Double.parseDouble(equation.substring(equation.indexOf("/") + 1));
            answer = Double.toString(dob1 + dob2);
            return answer;
        }
        else {
            int1 = Integer.parseInt(equation.substring(0, equation.indexOf("/")));
            int2 = Integer.parseInt(equation.substring(equation.indexOf("/")));
            answer = Integer.toString (int1 + int2);
            return answer;
        }
    }
}
