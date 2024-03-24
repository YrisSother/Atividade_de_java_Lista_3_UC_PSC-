import java.util.Scanner;
public class Atividade37 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigo;
        double altura, peso;
        int codigoMaisAlto = 0, codigoMaisBaixo = 0, codigoMaisGordo = 0, codigoMaisMagro = 0;
        double maisAlto = Double.MIN_VALUE, maisBaixo = Double.MAX_VALUE, maisGordo = Double.MIN_VALUE, maisMagro = Double.MAX_VALUE;
        double somaAlturas = 0, somaPesos = 0;
        int totalClientes = 0;

        while (true) {

            System.out.println("\n");

            System.out.print("Digite o código do cliente (0 para sair): ");
            codigo = scanner.nextInt();
            if (codigo == 0) break;

            System.out.println("\n");

            System.out.print("Digite a altura do cliente (em metros): ");
            altura = scanner.nextDouble();

            System.out.println("\n");

            System.out.print("Digite o peso do cliente (em kg): ");
            peso = scanner.nextDouble();

            System.out.println("\n");

            if (altura > maisAlto) {
                maisAlto = altura;
                codigoMaisAlto = codigo;
            }
            if (altura < maisBaixo) {
                maisBaixo = altura;
                codigoMaisBaixo = codigo;
            }
            if (peso > maisGordo) {
                maisGordo = peso;
                codigoMaisGordo = codigo;
            }
            if (peso < maisMagro) {
                maisMagro = peso;
                codigoMaisMagro = codigo;
            }

            somaAlturas += altura;
            somaPesos += peso;
            totalClientes++;
        }

        if (totalClientes > 0) {
            double mediaAlturas = somaAlturas / totalClientes;
            double mediaPesos = somaPesos / totalClientes;

            System.out.println("\n");

            System.out.println("\nCliente mais alto: Código " + codigoMaisAlto + " com " + maisAlto + "m");
            System.out.println("\n");

            System.out.println("Cliente mais baixo: Código " + codigoMaisBaixo + " com " + maisBaixo + "m");
            System.out.println("\n");

            System.out.println("Cliente mais gordo: Código " + codigoMaisGordo + " com " + maisGordo + "kg");
            System.out.println("\n");

            System.out.println("Cliente mais magro: Código " + codigoMaisMagro + " com " + maisMagro + "kg");
            System.out.println("\n");

            System.out.println("Média das alturas: " + mediaAlturas + "m");
            System.out.println("\n");

            System.out.println("Média dos pesos: " + mediaPesos + "kg");
            System.out.println("\n");

        } else {

            System.out.println("Nenhum dado foi inserido.");

        }

        scanner.close();
    }

}
