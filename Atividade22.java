import java.util.Scanner;

public class Atividade22 {

    public static boolean ehPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("\n");

        Scanner scanner = new Scanner(System.in);
        int numDivisoes = 0;

        System.out.print("Digite a quantidade de números para encontrar os primos: ");
        int N = scanner.nextInt();

        System.out.println("\n");

        System.out.println("Números primos entre 1 e " + N + ":");

        System.out.println("\n");

        for (int i = 2; i <= N; i++) {
            if (ehPrimo(i)) {
                System.out.println(i);
                numDivisoes++; 
            }
        }

        System.out.println("\n");

        System.out.println("Número total de divisões: " + numDivisoes);

        System.out.println("\n");

        scanner.close();
    }
}
