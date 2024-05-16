import java.util.Scanner;

public class Produto {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int A, B, prod;
        A = leitura.nextInt();
        leitura.nextLine();
        B = leitura.nextInt();
        prod = A * B;

        System.out.println("PROD = " + prod);

    }
}
