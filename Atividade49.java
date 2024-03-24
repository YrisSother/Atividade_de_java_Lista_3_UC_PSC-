import java.util.Scanner;
public class Atividade49 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de termos da série (n): ");
        int n = scanner.nextInt();

        double soma = calcularSerie(n);

        System.out.println("Soma dos " + n + " termos da série: " + soma);

        scanner.close();
    }

    // Método para calcular a série
    public static double calcularSerie(int n) {
        double soma = 0;
        int numerador = 1;
        int denominador = 1;

        for (int i = 0; i < n; i++) {
            soma += (double) numerador / denominador;
            numerador++;
            denominador += 2;
        }

        return soma;
    }
}
