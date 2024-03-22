import java.util.Scanner;
public class Atividade20 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Digite um número inteiro positivo (menor que 16) para calcular o fatorial ou -1 para sair: ");
            int numero = scanner.nextInt();

            if (numero == -1) {

                break; 
            }

        
            if (numero < 0 || numero >= 16) {

                System.out.println("Número inválido! Por favor, digite um número positivo menor que 16.");
                continue; 
            }


            long fatorial = 1;
            for (int i = 1; i <= numero; i++) {

                fatorial *= i;
            }

            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        scanner.close();
    }
}


    

