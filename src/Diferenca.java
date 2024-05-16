import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {
        int A, B, C, D, resultado;
        Scanner leitura = new Scanner(System.in);

        A = leitura.nextInt();
        leitura.nextLine();
        B = leitura.nextInt();
        leitura.nextLine();
        C = leitura.nextInt();
        leitura.nextLine();
        D = leitura.nextInt();

        resultado = (A * B) - (C * D);

        System.out.println("DIFERENCA = " + resultado);
    }
}
