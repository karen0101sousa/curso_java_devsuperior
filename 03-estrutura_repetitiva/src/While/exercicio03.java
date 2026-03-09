package While;

import java.util.Locale;
import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (x != 4) {
            if (x == 1) {
                alcool++;
            }
            else if (x == 2 ) {
                gasolina++;
            }
            else if (x== 3) {
                diesel++;
            }
            x = sc.nextInt();

        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("1.Alcool: " + alcool);
        System.out.println("2.Gasolina: " + gasolina);
        System.out.println("3.Diesel: " + diesel);
        sc.close();
    }
}
