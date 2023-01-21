import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ввод текста: ");
        String text = scanner.nextLine();
        char[] Text = text.toCharArray();
        Random rnd = new Random();
        char[] Key = new char[Text.length];
        char[] Result = new char[Text.length];
        for (int i = 0; i < Text.length; i++) {
            Key[i] = (char) rnd.nextInt();
            Result[i] = (char) (Text[i] + Key[i]);
        }
        System.out.println("Ключ: " + String.valueOf(Key));
        System.out.println("Результат: " + String.valueOf(Result));
        char[] Decrypt = new char[Text.length];
        for (int i = 0; i < Text.length; i++) {
            Decrypt[i] = (char) (Result[i] - Key[i]);
        }
        System.out.println("Расшифровка: " + String.valueOf(Decrypt));
    }
}
