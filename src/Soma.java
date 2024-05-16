import java.util.Scanner;

public class Soma {
    public static void main(String[] args) {
        int A;
        int B;
        int soma    ;

        Scanner lendo = new Scanner(System.in);

        A = lendo.nextInt();
        lendo.nextLine();
        B = lendo.nextInt();

        soma = A + B;

        System.out.println("SOMA = " + soma );

    }
}
