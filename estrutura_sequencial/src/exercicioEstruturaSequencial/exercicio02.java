package exercicioEstruturaSequencial;

import java.util.Locale;

public class exercicio02 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        double pi = 3.14159;
        double raio1 = 2.00;
        double area1 = pi * ( raio1 * raio1);
        System.out.printf("A = %.4f%n", area1);

        double raio2 = 100.64;
        double area2 = pi * ( raio2 * raio2);
        System.out.printf("A = %.4f%n", area2);

        double raio3 = 150.00;
        double area3 = pi * ( raio3 * raio3);
        System.out.printf("A = %.4f%n", area3);
    }
}
