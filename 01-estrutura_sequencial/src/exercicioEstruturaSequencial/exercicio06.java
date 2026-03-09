package exercicioEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class exercicio06 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double a,b,c;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        double areaTriangulo = (a * c) / 2;
        double areaCirculo = (3.14159) * (c * c);
        double areaTrapezio = ((a + b) * c) / 2;
        double areaQuadrado = b * b;
        double areaRetangulo = a * b;

        System.out.printf("TRIANGULO: R$ %.3f%n", areaTriangulo);
        System.out.printf("CIRCULO: R$ %.3f%n", areaCirculo);
        System.out.printf("TRAPEZIO: R$ %.3f%n", areaTrapezio);
        System.out.printf("QUADRADO: R$ %.3f%n", areaQuadrado);
        System.out.printf("RETANGULO: R$ %.3f%n", areaRetangulo);

        sc.close();
    }
}
