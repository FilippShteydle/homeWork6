import java.util.Scanner;

public class Task03 {

/*    Подсчитать среднюю длину слова, во введенном с
    клавиатуры предложении.*/

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите предложение");
        String str = scanner.nextLine();
        String[] words = str.split(" ");
        double sum = 0;
        double count = 0;
        double rez;

        for (int i = 0; i < words.length; i++) {
            sum += words[i].length();
            count++;
        }
        System.out.println("Средняя длина слов в предложении " + sum / count);
    }

}
