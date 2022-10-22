import java.io.IOError;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Восьмиричная: "+koren(751, 8));
        System.out.println("Двоичная: "+koren(751,2));
        System.out.println("Десятичная: "+koren(751,10));
        System.out.println("Шестнадцатиричная: "+koren(751,16));
    }

    public static String koren(int number, int koren) {
        List<Character> tablica = tablicaChisel();
        if (koren < 2 || koren >= tablica.size() || number < 0) {
            throw new IllegalArgumentException();
        }
        StringBuilder value = new StringBuilder();
        while (number > 0) {
            value.insert(0, tablica.get(number % koren));
            number = number / koren;
        } return value.toString();
    }

    private static List<Character> tablicaChisel() {
        ArrayList<Character> tablica = new ArrayList<>();
        for (char i = '0'; i <= '9'; i++) {
            tablica.add(i);
        }
        for (char i = 'A'; i <= 'Z'; i++) {
            tablica.add(i);
        }
        return tablica;
    }
}
