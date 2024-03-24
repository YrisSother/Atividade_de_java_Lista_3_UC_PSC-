import java.util.Scanner;
public class Atividade33 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double numero = 0;

        System.out.println("\n");

        System.out.print("Digite a quantidade de temperaturas: ");
        int N = sc.nextInt();

        double maior = Integer.MIN_VALUE;
        double menor = Integer.MAX_VALUE;
        double soma = 0;

        System.out.println("\n");

        for (double i = 0; i < N; i++) {

            System.out.print("Digite um número: ");
            numero = sc.nextDouble();

            soma += numero;

            if (numero > maior) {
                maior = numero;
            }
            if (numero < menor) {
                menor = numero;
            }

        }

        float media = (float) soma / N;

        System.out.println("\n");
        
        System.out.println("Média da temperatura: " + media);
        System.out.println("Maior temperatura: " + maior);
        System.out.println("Menor temperatura: " + menor);
        
    }
}
