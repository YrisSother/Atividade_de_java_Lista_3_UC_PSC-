import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {

        System.out.println("\n");
        Scanner sc = new Scanner(System.in);
        int pares = 0;
        int impares = 0;
        int num;

        System.out.println("Digite dez números");

        System.out.println("\n");

        for(int i = 0; i<10; i++) {
            System.out.printf("Número %d: ",i + 1);
            num = sc.nextInt();

            if (num % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }

        System.out.println("Quantidade de números pares: "+pares);
        System.out.println("Quantidade de números ímpares: "+impares);

        System.out.println("\n");

    }
}
