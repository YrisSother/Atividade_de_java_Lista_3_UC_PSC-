import java.util.Scanner;
public class Atividade38 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o salário inicial do funcionário: R$ ");
        double salarioInicial = scanner.nextDouble();

        double taxaAumento = 1.5; 
        int anoAtual = 2024; 
        int anoContratacao = 1995;

        double salario = salarioInicial + (salarioInicial * taxaAumento / 100);

        for (int ano = 1997; ano <= anoAtual; ano++) {
            taxaAumento *= 2; 
            salario += (salario * taxaAumento / 100); 
        }

        System.out.printf("O salário atual do funcionário em %d é de R$ %.2f\n", anoAtual, salario);

        scanner.close();
        
    }
}
