import java.util.Scanner;

public class Atividade13 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a base: ");
        long num1 = sc.nextLong(); 

        System.out.println("Digite o expoente: ");
        long num2 = sc.nextLong();

        long resultado = 1; 

        for(long i = 1; i <= num2; i++); {

            resultado *= num1;
        }

        System.out.println(num1 + " elevado a " + num2 + " = " + resultado);

        sc.close();

    }
}
