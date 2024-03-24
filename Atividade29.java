import java.util.Scanner;
public class Atividade29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n");

        System.out.println("Preço do pão: R$0.18");
        System.out.println("Panificadora Pão de ontem - Tabela de preços");

        System.out.println("\n");
        
        for (double i = 0; i < 50; i++) {

            double multiplicacao = 0.18 * ( i+1 ) ;
                         
            System.out.printf("%.0f - %.2f%n", i + 1, multiplicacao);
         
        }

    }
}
