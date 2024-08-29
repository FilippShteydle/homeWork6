import java.util.Scanner;

public class Task05 {

 /*   Ввести строку с клавиатуры. В строке должны содержаться
    слова, которые могут быть раздельные пробелами или
    двоеточиями. Необходимо вычислить количество слов в
    строке, у которых четное количество букв.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine();
        String[] rez = str.split("[: ]");
        int count = 0;

        for (String s : rez) {
            if (s.length() % 2 == 0 && s.length() != 0) count++;
        }
        System.out.println("Число слов с четным количеством букв " + count);
    }
}
