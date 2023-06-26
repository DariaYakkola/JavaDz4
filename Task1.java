package HomeWork;

import java.util.Scanner;
import java.util.Stack;

public class Task1 {
    //Вывести список на экран в перевернутом виде
    public static void main(String[] args) {

        //Реализация через стринг бафер
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку: ");
        StringBuffer message = new StringBuffer(sc.nextLine());
        message.reverse();
        System.out.println(message);

        //Реализация через стэк
        Stack<String> sms = new Stack<>();
        Stack<String> result = new Stack<>();
        System.out.println("Сколько у нас будет элементов?");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("Введите элемент: ");
            sms.push(sc.next());
        }
        for (int j = 0; j < n; j++) {
            result.add(sms.pop());
        }
        System.out.println(result);
    }
}