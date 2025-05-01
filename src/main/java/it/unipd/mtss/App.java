////////////////////////////////////////////////////////////////////
// MATTIA CADAMURO 2111534
// MICHELE TESSER 2111012
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;

public class App {
    public static void main(String[] args) {
        System.out.println("*** Welcome to the Roman Number Printer ***");
        if (args == null || args.length == 0) {
            System.out.println("Usage: java -jar RomanNumberPrinter.jar <number1> <number2> ...");
            return;
        }
        for (String s : args) {
            System.out.println("Result for " + s + " is:");
            checkResult(s);
        }

    }

    public static void checkResult(String input) {
        try {
            String result = RomanPrinter.print(Integer.parseInt(input));
            if (result == "") {
                System.err.println("There is a error for " + input + ", please input again.");
            } else {
                System.out.println(result);
            }
        } catch (Exception e) {
            System.err.println(input + " is not a valid number.");
        }
    }

}