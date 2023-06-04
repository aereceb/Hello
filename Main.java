import java.util.Scanner;

public class Main {
    public static void exe1(String niz1, String niz2) {
        int search = niz1.indexOf(niz2);
        System.out.println(search);
    }

    public static String[] exe2(String text) {
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);

        }
        return words;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        String[] words = exe2(text);

    }
}
//Напишете метод, който приема като параметри 2 символни низа и връща първата позиция,
// на която вторият низ се съдържа в първия.
//б) Подайте null като стойност на първия параметър и вижте какъв е резултатът.
//в) Нека методът да връща -5, ако някоя от стойностите на подадените низове е null.
//г) Нека методът да връща -3, ако първият низ е празен (има дължина 0).
//Напишете метод, който приема за параметър даден текст и връща масив, съдържащ думите на този текст.
//Напр: wordify(“Java is cool”) -> [“Java”, “is”, “cool”]