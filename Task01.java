import java.util.Scanner;

public class Task01 {

/*    Ввести с клавиатуры строку текста, а затем один символ.
    Показать на консоль индексы и количество совпадений (ищем
   вхождения символа в строку). В случае если совпадений не
    найдено, вывести соответствующий текст.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст");
        String str = scanner.nextLine();
        System.out.println("Введите символ");
        String ind = scanner.nextLine();
        int count = 0;

        for (int i = 0; i < str.length();) {

            i = str.indexOf(ind, i);
            if (i == -1) break;
            System.out.print(i + "; ");
            i++;
            count++;
        }
        String b = count > 0 ? "символ " + ind + " встречается " + count + " раз в строке": "Символ " + ind + " не встречается в строке";
        System.out.println(b);
    }
}
