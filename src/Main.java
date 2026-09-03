import java.util.InputMismatchException;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        String input;
        // take input from the user
        Scanner sc = new Scanner(System.in);

        // Keep running until user chooses to exit
        while(true) {

            double first;
            // Keep asking until a valid number is entered
            while(true) {
                try{
                    System.out.print("Enter first number: ");
                    first = sc.nextDouble();
                    break;

                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number");
                    sc.next();
                }
            }

            double second;
            // keep asking until a valid number is entered
            while(true) {
                try{
                    System.out.print("Enter second number: ");
                    second = sc.nextDouble();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("Invalid input. Please enter a number");
                    sc.next();
                }
            }

            System.out.print("Enter operation: ");
            String operation = sc.next();

            // Perform the selected arithmetic operation
            switch (operation) {
                case "+" -> System.out.println("Ans:- " + sum(first, second));
                case "-" -> System.out.println("Ans:- " + subtract(first, second));
                case "*" -> System.out.println("Ans:- " + multiply(first, second));
                case "/" -> {
                    if(second == 0) {
                        System.out.println("Can't divide by zero");
                    } else{
                        System.out.println("Ans:- " + divide(first, second));
                    }
                }
                default -> System.out.println("Invalid operation");
            }
            System.out.println("Again? -> y/n");
            input = sc.next();
            if(input.equalsIgnoreCase("y")) continue;
            else if(input.equalsIgnoreCase("n")) break;
            else break;
        }

    }
    public static double sum(double first, double second) {
        return first + second;
    }
    public static double subtract(double first, double second) {
        return first - second;
    }
    public static double multiply(double first, double second) {
        return first * second;
    }
    public static double divide(double first, double second) {
        return first / second;
    }
}

