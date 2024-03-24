import java.util.Scanner;
public class Atividade29 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        for (double i = 0; i < 50; i++) {

            double multiplicacao = 1.99 * ( i+1 ) ;
                        
            System.out.printf("%.0f - %.2f%n", i + 1, multiplicacao);
         
        }

    }
}
