package secaoQuatro_Estrutura_Sequencial;
import java.util.Scanner;

public class entradaDados {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // entrada de string
        String x;
        x = sc.next();
        System.out.println("Voce digitou: " + x);

        //entrada de numero inteiro
        int y;
        y = sc.nextInt();
        System.out.println("Voce digitou: " + y);

        // entrada de double
        double z;
        z = sc.nextDouble();
        System.out.println("Voce digitou: " + z);

        // ler um caractere
        char b;
        b = sc.next().charAt(0);
        System.out.println("Voce digitou: " + b);

        sc.close();
    }
}
