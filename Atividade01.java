import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        int num=0;

        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um numero de 0 á 10: ");
        num=teclado.nextInt();

        while(num>10){
            System.out.println("Valor inválido");
            System.out.println("Digite um numero de 0 á 10: ");
            num = teclado.nextInt();
        }
        System.out.println("Valor válido");
    }
}