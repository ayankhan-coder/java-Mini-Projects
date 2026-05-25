package projects;
import java.util.Scanner;

class Calculator {
    double add(double a, double b) {
        return a + b;
    }

    double subtract(double a, double b) {
        return a - b;
    }

    double multiply(double a, double b) {
        return a * b;
    }

    double division(double a, double b) {
        return a / b;
    }
}
public class CalculatorProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        while(true) {
            double num1;
            double num2;
            String op;
            double result;

            System.out.print("Enter Number 1 : ");
            try {
                num1 = sc.nextDouble();
            } catch (Exception e) {
                System.out.println("Error : Please Enter Only Numbers");
                return;
            }

            System.out.print("Enter Number 2 : ");
            try {
                num2 = sc.nextDouble();
            } catch (Exception e) {
                System.out.println("Error : Please Enter Only Numbers");
                return;
            }

            System.out.println("Enter Operator : + , - , * , /");
            op = sc.next();

            switch (op) {

                case "+":
                    result = calculator.add(num1, num2);
                    System.out.println(result);
                    break;

                case "-":
                    result = calculator.subtract(num1, num2);
                    System.out.println(result);
                    break;

                case "*":
                    result = calculator.multiply(num1, num2);
                    System.out.println(result);
                    break;

                case "/":
                    if (num2 == 0) {
                        System.out.println("Error : Cannot Divide By Zero");
                    } else {
                        result = calculator.division(num1, num2);
                        System.out.println(result);
                    }
                    break;

                default:
                    System.out.println("Invalid Operator");
                    System.out.println("+ , - , * , /");
            }
        }

    }
}
