import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        double number1, number2 = 0;
        String operation, contiune;

        Scanner s = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        number1 = s.nextDouble();
        System.out.print("Enter the second number: ");
        number2 = s.nextDouble();
        System.out.print("What is your choice (+, -, *, /): ");
        operation = s.next();


        switch (operation) {
            case "+":
                System.out.println("Total: " + (number1 + number2));
                break;
            case "-":
                System.out.println("Substraction: " + (number1 - number2));
                break;
            case "*":
                System.out.println("Multiplication: " + (number1 * number2));
                break;
            case "/":
                if (number2 == 0) {
                    System.out.println("Denominator cannot be 0");
                    break;
                }
                System.out.println("Divide: " + (number1 / number2));
                break;
        }
    }
}
