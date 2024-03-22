import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos termos da série de Fibonacci você quer gerar? ");
        int n = sc.nextInt();

        int primeiroTermo = 0;
        int segundoTermo = 1;

        System.out.println("\nSérie de Fibonacci até o " + n + "º termo ou até um termo exceder 500:\n");

        for (int i = 1; i <= n; i++) {

            if (primeiroTermo > 500) {
                System.out.println("\nUm termo excedeu 500, parando a geração da série.");
                break;

            }

            System.out.print(primeiroTermo + " ");

            int proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }

        System.out.println("\n");
        sc.close();
    }
}
