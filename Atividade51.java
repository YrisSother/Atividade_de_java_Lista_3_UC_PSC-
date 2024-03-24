import java.util.Scanner;
public class Atividade51 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos (N): ");
        int n = scanner.nextInt();

        double resultado = calcularH(n);

        System.out.println("O valor de H com " + n + " termos é: " + resultado);

        scanner.close();
    }

    public static double calcularH(int n) {
        double h = 0.0;

        for (int i = 1; i <= n; i++) {
            h += 1.0 / i;
        }

        return h;
    }
}
