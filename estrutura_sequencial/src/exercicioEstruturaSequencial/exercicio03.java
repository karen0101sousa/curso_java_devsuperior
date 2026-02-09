package exercicioEstruturaSequencial;

import java.util.Scanner;

public class exercicio03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int a,b,c,d;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();

        int diferenca = (a * b) - (c * d) ;

        System.out.println("DIFERENCA = " + diferenca);

        sc.close();
    }
}
