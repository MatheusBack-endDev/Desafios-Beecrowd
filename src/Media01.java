import java.util.Scanner;

public class Media01 {
    public static void main(String[] args) {

        double A, B, C, resultado;
        double PesoA = 2;
        double PesoB = 3;
        double PesoC = 5;

        Scanner leitura = new Scanner(System.in);

        A = leitura.nextDouble();
        B = leitura.nextDouble();
        C = leitura.nextDouble();

        resultado = (A * PesoA + B * PesoB + C * PesoC) / (PesoA + PesoB + PesoC);

        System.out.printf("MEDIA = %.1f\n", resultado);
    }
}
