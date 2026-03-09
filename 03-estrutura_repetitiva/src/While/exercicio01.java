package While;

import java.util.Locale;
import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int senha = sc.nextInt();

        int senhaCorreta = 2002;

        while (senha != senhaCorreta) {
            System.out.println("Senha Invalida");
            senha = sc.nextInt();

        }
        System.out.println("Acesso permitido");

        sc.close();
    }
}
