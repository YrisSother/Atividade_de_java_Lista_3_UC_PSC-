import java.util.Scanner;
public class Atividade07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1,num2,num3,num4,num5;

        System.out.println("Digite o primeiro número:");
        num1=sc.nextInt();

        System.out.println("Digite o segundo número:");
        num2=sc.nextInt();

        System.out.println("digite o terceiro número:");
        num3=sc.nextInt();

        System.out.println("Digite o quarto número:");
        num4=sc.nextInt();

        System.out.println("Digite o quinto número:");
        num5=sc.nextInt();

        if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5) {

            System.out.printf("O primeiro número: %d é o maior",num1);

        }else if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5) {

            System.out.printf("O segundo número: %d é o maior", num2);

        }else if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5) {

            System.out.printf("O terceiro número: %d é o maior", num3);

        }else if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5) {

            System.out.printf("O quarto número: %d é o maior", num4);

        }else if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4) {

            System.out.printf("O quinto número: %d é o maior", num5);
        }
    }
}
