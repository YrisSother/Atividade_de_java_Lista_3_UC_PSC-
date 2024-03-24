import java.util.Scanner;

import javax.swing.plaf.synth.SynthScrollBarUI;
public class Atividade31 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double soma = 0;
        double preco = 0;
        double Pagamento;
        double troco;
        

        System.out.println("\n");
        
        System.out.println("Insira aquantidade de produtos: ");
        int produtos = sc.nextInt();

        System.out.println("\n");

        for (int i = 0; i < produtos; i++) {

            System.out.printf("Informe o preço do %dº produto : ", i + 1);
            preco = sc.nextDouble();

            soma =+ preco;

        }

        System.out.println("\n");

        System.out.println("Pagamento: ");
        Pagamento = sc.nextDouble();

        troco = Pagamento - soma;

        System.out.print("\r\n");

        System.out.println("Lojas Tabajara");

        System.out.println("Total: R$ "+soma);

        System.out.println("Dinheiro: R$ "+Pagamento);

        System.out.println("Troco: R$ "+troco);

        System.out.print("\r\n");



    }
}
