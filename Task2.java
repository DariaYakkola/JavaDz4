package HomeWork;

import java.util.Scanner;
import java.util.Stack;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String sms = sc.nextLine();
        System.out.println(correct(sms));
    }

    /**
     * @param message строка для проверки
     * @return результаты проверки
     * @apiNote Given a string s containing just the characters '(', ')', '{', '}', '[' and ']',
     * determine if the input string is valid
     */
    public static String correct(String message) {
        Stack<Character> hooks = new Stack<>();

        for (int i = 0; i < message.length(); i++) {
            if ((message.charAt(i) == '(') || (message.charAt(i) == '[') || (message.charAt(i) == '{')) {
                hooks.push(message.charAt(i));
            } else if (hooks.empty()) {
                return "Некорректный ввод!";
            } else if (message.charAt(i) == ')' && hooks.peek() != '(') {
                return "Некорректный ввод!";
            } else if (message.charAt(i) == ']' && hooks.peek() != '[') {
                return "Некорректный ввод!";
            } else if (message.charAt(i) == '}' && hooks.peek() != '{') {
                return "Некорректный ввод!";
            } else if (message.charAt(i) == ')' && hooks.peek() == '(') {
                hooks.pop();
            } else if (message.charAt(i) == ']' && hooks.peek() == '[') {
                hooks.pop();
            } else if (message.charAt(i) == '}' && hooks.peek() == '{') {
                hooks.pop();
            }
        }
        if (hooks.empty()) {
            return "Корректный ввод!";
        } else {
            return "Некорректный ввод!";
        }
    }
}