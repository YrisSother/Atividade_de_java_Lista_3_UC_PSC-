import java.util.Scanner;
public class Atividade23 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        float notas;
        int quantidade_notas = 0;
        float resultado = 0;

        System.out.println("\n");

            
        System.out.println("Digite a quantidade de notas notas: ");
        quantidade_notas = sc.nextInt();

        while (quantidade_notas <= 0) {

            System.out.println("Valor invalido, por favor insira um valor válido: ");
            quantidade_notas = sc.nextInt();

        }

        System.out.println("\n");

        for (float num = 0; num < quantidade_notas; num++) {

            System.out.printf("Escreva a %,.0fº nota: ", num + 1);
            notas = sc.nextFloat();

            resultado = resultado + notas;

        }

        System.out.println("\n");

        double media = (double) resultado / quantidade_notas;

        System.out.println("Média = " + media);

        System.out.println("\n");

        sc.close();
           
    }

    
}

