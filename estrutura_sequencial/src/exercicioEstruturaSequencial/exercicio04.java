package exercicioEstruturaSequencial;
import java.util.Locale;
public class exercicio04 {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
        // funcionario 01
        int matricula1 = 25;
        int horas1 = 100;
        double salario1 = 5.50;
        double saldo1 = (horas1 * salario1);

        System.out.println("NUMBER = " + matricula1);
        System.out.printf("SALARY = U$ %.2f%n", saldo1);

        //funcionario 02
        int matricula2 = 1;
        int horas2 = 200;
        double salario2 = 20.50;
        double saldo2 = (horas2 * salario2);

        System.out.println("NUMBER = " + matricula2);
        System.out.printf("SALARY = U$ %.2f%n", saldo2);

        //funcionario 03
        int matricula3 = 6;
        int horas3 = 145;
        double salario3 = 15.55;
        double saldo3 = (horas3 * salario3);

        System.out.println("NUMBER = " + matricula3);
        System.out.printf("SALARY = U$ %.2f%n", saldo3);


    }
}
