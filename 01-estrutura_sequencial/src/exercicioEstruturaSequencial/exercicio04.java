package exercicioEstruturaSequencial;
import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int a, b;
        double hour;

        a = sc.nextInt();
        b = sc.nextInt();
        hour = sc.nextDouble();

        double salary = b * hour;

        System.out.println("NUMBER = " + a);
        System.out.printf("SALARY = U$ %.2f%n", salary);

        sc.close();

    }
}
