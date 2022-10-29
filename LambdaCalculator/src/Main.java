import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Calculator calculator = new Calculator();
        calculator.registerOperation("+", (a, b) -> a + b);
        calculator.registerOperation("-", (a, b) -> a - b);
        calculator.registerOperation("/", (a, b) -> a / b);
        calculator.registerOperation("*", (a, b) -> a * b);

        Scanner scanner = new Scanner(System.in);
        System.out.println("\nБудь ласка введіть перше число: ");
        int a = scanner.nextInt();
        System.out.println("Виберіть оператор: (+ - * or /)");
        String operator = scanner.next();
        System.out.println("Будь ласка введіть друге число: ");
        int b = scanner.nextInt();
        scanner.close();
        System.out.println("Результат: ");

        System.out.println(calculator.calculate(a, operator, b));
    }
}