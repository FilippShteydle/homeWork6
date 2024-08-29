import java.util.Scanner;

public class Task04 {

  /*  Ввести строку с клавиатуры (латиницей). Из введенной
    строки выбрать все слова, начинающиеся на гласные буквы
    и заканчивающиеся на согласные. Вывести отобранные
    слова на консоль.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String str = scanner.nextLine();
        str.toLowerCase();
        String[] sum = str.split(" ");

        for (int i = 0; i < sum.length; i++) {

            if (sum[i].charAt(0) == 'a' || sum[i].charAt(0) == 'e' || sum[i].charAt(0) == 'i' || sum[i].charAt(0) == 'o' || sum[i].charAt(0) == 'u' || sum[i].charAt(0) == 'y') {

                if (sum[i].charAt(0) != 'a' || sum[i].charAt(0) != 'e' || sum[i].charAt(0) != 'i' || sum[i].charAt(0) != 'o' || sum[i].charAt(0) != 'u' || sum[i].charAt(0) != 'y') {
                    System.out.println(sum[i]);
                } else break;
            }
        }
    }
}
