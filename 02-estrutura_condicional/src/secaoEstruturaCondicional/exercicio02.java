package secaoEstruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio02 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int x;
        System.out.println("Digite um numero: ");
        x = sc.nextInt();

        int resto = x % 2;

        if (resto == 0) {
            System.out.println("PAR");
        }
        else {
            System.out.println("IMPAR");
        }
        sc.close();

    }
}
