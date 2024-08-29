import java.util.Scanner;

public class Task02 {

/*    Написать программу, которая создаст строку, в которой
    находятся все целые числа, начиная с 1, выписаны в одну
    строку «123456789101112131415...». Строка должна быть
    длиной не более 1 000 символов.
    По числу n (введенного с клавиатуры), выведите цифру на
    n-й позиции (используется нумерация с 1).*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите номер позиции c 1 до 1000");
        int n = scanner.nextInt();
        String str = "";

        for (int i = 1; i < 1000;) {
            str += i;
            i = str.length();
        }
        System.out.println(str.charAt(n-1));
    }

}
