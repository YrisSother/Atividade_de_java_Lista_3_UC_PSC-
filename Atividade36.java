import java.util.Scanner;
public class Atividade36 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Montar a tabuada de: ");
        int numero = scanner.nextInt();


        System.out.print("Começar por: ");
        int inicio = scanner.nextInt();


        System.out.print("Terminar em: ");
        int fim = scanner.nextInt();

 
        if (inicio > fim) {
            System.out.println("O valor inicial deve ser menor que o valor final.");
            return; 
        }

        System.out.println("\n");

        System.out.println( "\nVou montar a tabuada de " + numero + " começando em " + inicio + " e terminando em " + fim + ":");

        for (int i = inicio; i <= fim; i++) {
            System.out.println((numero) + " X " + i + " = " + (numero * i));
        }

        System.out.println("\n");

        scanner.close();
        
    }
}
