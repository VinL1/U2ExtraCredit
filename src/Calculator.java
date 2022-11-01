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
            dob1 = Double.parseDouble(equation.substring(0, equation.indexOf("+") - 1));
            dob2 = Double.parseDouble(equation.substring(equation.indexOf("+") + 2));
            answer = Double.toString(dob1 + dob2);
            return answer;
        }
        else {
            int1 = Integer.parseInt(equation.substring(0, equation.indexOf("+") - 1));
            int2 = Integer.parseInt(equation.substring(equation.indexOf("+") + 2));
            answer = Integer.toString (int1 + int2);
            return answer;
        }
    }

    public String subtract () {
        if (equation.contains(".")) {
            if (equation.indexOf("-") != 0) { /*if all positive */
                dob1 = Double.parseDouble(equation.substring(0, equation.indexOf("-") - 1));
                dob2 = Double.parseDouble(equation.substring((equation.substring(1).indexOf ("-") + 3)));
                answer = Double.toString(dob1 - dob2);
                return answer;
            }
            else {
                if ((equation.indexOf("-") == 0)) { /* if first double negative */
                    dob1 = Double.parseDouble(equation.substring(0, (equation.substring(1)).indexOf("-")));
                } else {
                    dob1 = Double.parseDouble(equation.substring(0, equation.indexOf("-") - 1));
                }
                dob2 = Double.parseDouble(equation.substring((equation.substring(1).indexOf("-") + 3)));
                answer = Double.toString(dob1 - dob2);
                return answer;
            }
        }
        else {
            if (equation.indexOf("-") != 0) { /*if all positive */
                int1 = Integer.parseInt(equation.substring(0, equation.indexOf("-") - 1));
                int2 = Integer.parseInt(equation.substring((equation.substring(1).indexOf ("-")) + 3));
                answer = Integer.toString(int1 - int2);
                return answer;
            }
            else {
                if ((equation.indexOf("-") == 0)) { /* if first int negative */
                    int1 = Integer.parseInt(equation.substring(0, (equation.substring(1)).indexOf("-")));
                } else {
                    int1 = Integer.parseInt(equation.substring(0, equation.indexOf("-") - 1));
                }
                int2 = Integer.parseInt(equation.substring(equation.substring(1).indexOf("-") + 3));
                answer = Integer.toString(int1 - int2);
                return answer;
            }
        }
    }

    public String multiply () {
        if (equation.contains(".")) {
            dob1 = Double.parseDouble(equation.substring(0, equation.indexOf("*") - 1));
            dob2 = Double.parseDouble(equation.substring(equation.indexOf("*") + 2));
            answer = Double.toString(dob1 * dob2);
            return answer;
        }
        else {
            int1 = Integer.parseInt(equation.substring(0, equation.indexOf("*") - 1));
            int2 = Integer.parseInt(equation.substring(equation.indexOf("*") + 2));
            answer = Integer.toString (int1 * int2);
            return answer;
        }
    }

    public String divide () {
        if (equation.contains(".")) {
            dob1 = Double.parseDouble(equation.substring(0, equation.indexOf("/") - 1));
            dob2 = Double.parseDouble(equation.substring(equation.indexOf("/") + 2));
            answer = Double.toString(dob1 / dob2);
            return answer;
        }
        else {
            int1 = Integer.parseInt(equation.substring(0, equation.indexOf("/") - 1));
            int2 = Integer.parseInt(equation.substring(equation.indexOf("/") + 2));
            answer = Integer.toString (int1 / int2);
            return answer;
        }
    }

    public String mod () {
        if (equation.contains(".")) {
            dob1 = Double.parseDouble(equation.substring(0, equation.indexOf("%") - 1));
            dob2 = Double.parseDouble(equation.substring(equation.indexOf("%") + 2));
            answer = Double.toString(dob1 % dob2);
            return answer;
        }
        else {
            int1 = Integer.parseInt(equation.substring(0, equation.indexOf("%") - 1));
            int2 = Integer.parseInt(equation.substring(equation.indexOf("%") + 2));
            answer = Integer.toString (int1 % int2);
            return answer;
        }
    }

    public String exponent () {
        if (equation.contains(".")) {
            dob1 = Double.parseDouble(equation.substring(0, equation.indexOf("^") - 1));
            dob2 = Double.parseDouble(equation.substring(equation.indexOf("^") + 2));
            answer = Double.toString(Math.pow(dob1, dob2));
            return answer;
        } else {
            int1 = Integer.parseInt(equation.substring(0, equation.indexOf("^") - 1));
            int2 = Integer.parseInt(equation.substring(equation.indexOf("^") + 2));
            answer = Integer.toString((int) Math.pow(int1, int2));
            return answer;
        }
    }
}
