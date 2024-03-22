import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos termos da série de Fibonacci você quer gerar? ");
        int n = sc.nextInt();

        System.out.println("\n");
        
        int primeiroTermo = 0;
        int segundoTermo = 1;
        
        System.out.println("Série de Fibonacci até o " + n + "º termo:");

        System.out.println("\n");
        
        for(int i = 1; i <= n; i++) {
            System.out.print(primeiroTermo + " ");
            
            int proximoTermo = primeiroTermo + segundoTermo;
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }
        
        System.out.println("\n");

        sc.close();
    }
}
