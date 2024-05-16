
import java.util.Scanner;

public class Circulo {
    public static void main(String[] args) {

        double A;
        double pi = 3.14159;
        double r = 0;

        Scanner leitura = new Scanner(System.in);

        r = leitura.nextDouble();

        A = pi * Math.pow(r, 2);

        System.out.printf("A=%.4f\n",A);

    }
}
