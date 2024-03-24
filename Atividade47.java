import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Atividade47 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> notas = new ArrayList<>();

        System.out.print("Nome do ginasta: ");
        String nomeGinasta = scanner.nextLine();

        for (int i = 0; i < 7; i++) {
            System.out.print("Nota do jurado " + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            notas.add(nota);
        }

        Collections.sort(notas);

        notas.remove(0);
        notas.remove(notas.size() - 1);

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.size();

        System.out.println("\nResultado final:");
        System.out.println("Atleta: " + nomeGinasta);
        System.out.println("Melhor nota: " + Collections.max(notas));
        System.out.println("Pior nota: " + Collections.min(notas));
        System.out.printf("Média: %.2f%n", media);

        scanner.close();

}
