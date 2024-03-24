import java.util.Scanner;

public class Atividade28B {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("\n");

        System.out.println("Digite a quantidade de cd's comprado: ");
        float quantidade = sc.nextFloat();

        System.out.println("\n");

        float valor = 0;

        for (float i = 0; i < quantidade; i++) {
            
            System.out.printf("Informe o %dº número: ", i + 1);
            float valor_cd = sc.nextFloat();

            valor += valor_cd;
        }

        System.out.println("\n");

        float media = (float) valor / quantidade;


        System.out.println("Valor médio investido: " + media);

        System.out.println("\n");

        System.out.println("A soma da compra é: "+valor);

        System.out.println("\n");

        sc.close();
        
    }
}
