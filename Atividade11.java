import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1;
        int num2;
        int result = 0;

        System.out.println("\n");

        System.out.println("Insira o primeiro número: ");
        num1 = sc.nextInt();

        System.out.println("Insira o segundo número: ");
        num2 = sc.nextInt();

        result = Math.max(num2, num1) + Math.max(num2, num1);
        System.out.println("A soma entre os dois números é: " + result);

        int menor = Math.min(num1, num2);
        int maior = Math.max(num1, num2);

        System.out.println("\n");

        System.out.println("O intervalo entre os dois números são: ");

        for (int i = menor; i <= maior; i++) {

            System.out.print(i + " ");
        }

        System.out.println("\n");

        sc.close();
    }
}
