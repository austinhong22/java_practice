
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        double a = scanner.nextDouble();
        System.out.println("Enter operation: ");
        String operator = scanner.next();
        System.out.println("Enter second number: ");
        double b = scanner.nextDouble();

        Calculator calc = new Calculator();
        double result = 0;

        switch(operator){
            case "+":
                result = calc.add(a,b);
                break;
            case "-":
                result = calc.subtract(a, b);
                break;
            case "*":
                result = calc.multiply(a, b);
                break;
            case "/":
                try {
                    result = calc.divide(a, b);
                } catch (IllegalArgumentException e) {
                    System.out.println("Error:" + e.getMessage());
                    scanner.close();
                    return;
                }
                break;
            default:
                System.out.println("Invalid operator");
                scanner.close();
                return;
            }
            System.out.println("Result:"+result);
            scanner.close();
    }
    
}
