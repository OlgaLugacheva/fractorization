package models;

/**
 * Created by Olga on 30.03.2017.
 * Функция факторизации
 */
public class Factorization {


    static int factor = 2;

    public static String Factor(int n) {

        while (n > 1 && factor * factor <= n) {
            while (n % factor == 0) {
                System.out.format(" %d*", factor);
                n /= factor;
            }
            ++factor;
        }
        if (n > 1) {
            return String.valueOf(System.out.format(" %d", n));
        }
        return null;
    }

}
