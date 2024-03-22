import java.util.Scanner;

public class Atividade12 {
    public static void main(String[] args) {
         System.out.println("\n");
        Scanner sc = new Scanner(System.in);
        int num1;
        int resultado = 0;

        
        System.out.println("Digite o primeiro número: ");
        num1 = sc.nextInt();

        System.out.println("\n");

        while (num1 < 1 || num1 > 10) {

            System.out.println("Digite um valor válido");
            num1 = sc.nextInt();
        }

        for(int multiplicação = 1; multiplicação <= 10; multiplicação++){
            resultado = num1 * multiplicação;
            System.out.println(num1 + " * " + multiplicação + " = " + resultado);
        }

        System.out.println("\n");

        sc.close();
    }
}
