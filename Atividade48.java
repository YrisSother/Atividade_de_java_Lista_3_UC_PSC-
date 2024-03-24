import java.util.Scanner;
public class Atividade48 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        int numeroInvertido = inverterNumero(numero);

        System.out.println("Número invertido: " + numeroInvertido);

        scanner.close();
    }

    // Método para inverter o número
    public static int inverterNumero(int numero) {
        int numeroInvertido = 0;

        while (numero > 0) {
            int digito = numero % 10; // Obtém o último dígito do número
            numeroInvertido = numeroInvertido * 10 + digito; // Adiciona o dígito ao número invertido
            numero /= 10; // Remove o último dígito do número original
        }

        return numeroInvertido;
    }

}
