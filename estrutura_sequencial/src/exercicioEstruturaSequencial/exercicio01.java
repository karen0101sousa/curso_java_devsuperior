package exercicioEstruturaSequencial;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x, y, total;

        x = sc.nextInt();
        y = sc.nextInt();
        total = x + y;

        System.out.println("SOMA = " + total);

        sc.close();

    }
}
