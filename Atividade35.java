import java.util.Scanner;
public class Atividade35 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n");
        System.out.print("Digite o número limite para listar todos os números primos até ele: ");
        int limite = scanner.nextInt();

        System.out.println("\n");

        System.out.println("Números primos entre 1 e " + limite + ":");
        System.out.println("\n");
        
        for (int numero = 2; numero <= limite; numero++) {
            if (isPrimo(numero)) {
                System.out.print(numero + " ");
            }
        }
    }

    private static boolean isPrimo(int numero) {

        if (numero < 2) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
