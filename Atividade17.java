import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para calcular o fatorial:");
        int num = scanner.nextInt();

        int resultado = 1;

        if (num < 0) {
            System.out.println("Número inválido. O fatorial não é definido para números negativos.");
        } else {
            for (int i = 1; i <= num; i++) {
                resultado *= i; 
            }

            System.out.println("Fatorial de " + num + " é: " + resultado);
        }

        scanner.close();
    }
}
