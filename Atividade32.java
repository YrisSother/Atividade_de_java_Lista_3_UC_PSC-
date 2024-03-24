import java.util.Scanner;

public class Atividade32 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n");

        System.out.print("Digite um número inteiro para calcular o fatorial: ");
        int numero = scanner.nextInt();

        System.out.println("\n");

        int fatorial = 1;
        String expressao = ""; 

        for (int i = numero; i >= 1; i--) {
            fatorial *= i;
            expressao += i; 
            if (i != 1) {
                expressao += " . "; 
            }
        }

        System.out.printf("Fatorial de: %d%n", numero);
        System.out.printf("%d! = %s = %d%n", numero, expressao, fatorial);

        System.out.println("\n");

        scanner.close();
    }
}
