import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишите что-то вроде: 3 + 5");
        String input = scanner.nextLine();
        String result = calc(input);
        System.out.println(result);

    }
    public static String calc(String input) {

        String[] parts = input.trim().split(" ");
        if (parts.length != 3) {
            return "Нужно писать так: число операция число.";
        }

        int a, b;
        try {
            a = Integer.parseInt(parts[0]);
            b = Integer.parseInt(parts[2]);
        } catch (NumberFormatException e) {
            return "Ой! Оба должны быть целыми числами.";
        }

        if (a < 1 || a > 10 || b < 1 || b > 10) {
            return "Числа должны быть от 1 до 10.";
        }
        String op = parts[1];
        return switch (op) {
            case "+" -> "Ответ: " + (a + b);
            case "-" -> "Ответ: " + (a - b);
            case "*" -> "Ответ: " + (a * b);
            case "/" -> "Ответ: " + (a / b);
            default -> "Я знаю только +, -, * или /.";
        };
    }
}