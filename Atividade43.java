import java.util.Scanner;
public class Atividade43 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double[] precos = { 1.20, 1.30, 1.50, 1.20, 1.30, 1.00 };
        String[] itens = { "Cachorro Quente", "Bauru Simples", "Bauru com ovo", "Hambúrguer", "Cheeseburguer","Refrigerante" };

        double totalPedido = 0;

        System.out.println("Cardápio:");
        System.out.println("Especificação\tCódigo\tPreço");
        for (int i = 0; i < itens.length; i++) {
            System.out.println(itens[i] + "\t" + (100 + i) + "\tR$ " + precos[i]);
        }
        System.out.println();

        while (true) {
            System.out.print("Digite o código do item desejado (ou -1 para encerrar o pedido): ");
            int codigo = scanner.nextInt();
            if (codigo == -1) {
                break;
            }

            if (codigo < 100 || codigo > 105) {
                System.out.println("Código inválido. Tente novamente.");
                continue;
            }

            System.out.print("Digite a quantidade desejada: ");
            int quantidade = scanner.nextInt();

            double valorItem = precos[codigo - 100] * quantidade;
            System.out.printf("Valor a ser pago pelo %s: R$ %.2f%n", itens[codigo - 100], valorItem);

            totalPedido += valorItem;
        }

        System.out.printf("Total do pedido: R$ %.2f%n", totalPedido);

        scanner.close();
    }
}
