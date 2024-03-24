import java.util.ArrayList;
import java.util.Scanner;
public class Atividade46 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Double> saltos = new ArrayList<>();

        while (true) {
            System.out.print("Nome do atleta (ou enter para encerrar): ");
            String nomeAtleta = scanner.nextLine();
            if (nomeAtleta.isEmpty()) {
                break;
            }

            System.out.println("Informe as distâncias alcançadas nos saltos:");
            for (int i = 1; i <= 5; i++) {
                System.out.print("Salto " + i + ": ");
                double distancia = scanner.nextDouble();
                saltos.add(distancia);
            }
            scanner.nextLine(); 

            double melhorSalto = saltos.get(0);
            double piorSalto = saltos.get(0);
            for (double salto : saltos) {
                if (salto > melhorSalto) {
                    melhorSalto = salto;
                }
                if (salto < piorSalto) {
                    piorSalto = salto;
                }
            }

            double soma = 0;
            for (double salto : saltos) {
                soma += salto;
            }
            double media = (soma - melhorSalto - piorSalto) / 3;

            System.out.println("\nResultado final:");
            System.out.println(nomeAtleta + ": " + String.format("%.1f", media) + " m\n");

            saltos.clear();
        }

        scanner.close();
    }

}
