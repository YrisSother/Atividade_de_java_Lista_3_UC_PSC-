import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        int num=0;

        Scanner teclado = new Scanner(System.in);
        
        System.out.println( "Digite um numero de 0 á 10: " );
        num = teclado.nextInt();

        if( num > 0 && num < 10 ){

            System.out.println("Número válido!!");

        }else{

            System.out.println("Valor invalido!!");
            
        }
        
        teclado.close();
    }
}
