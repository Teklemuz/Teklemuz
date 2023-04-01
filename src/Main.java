import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("please insert first number ");

        int num1 = scanner.nextInt();

        System.out.println("second number ?");
        int num2 = scanner.nextInt();
        switch ("calculator") {
            case "+":
                int sum = num1 + num2;
                System.out.println("the sum is" + sum);
                break;
            case "-":
                int subtract = num1 - num2;
                System.out.println("the result is");
            case "*":
                int multiply = num1 * num2;
                System.out.println("the result is ");
                break;
            case "/":
                int division = num1 / num2;
                System.out.println("the result is ");
                break;
             }
             }}



