import java.util.Scanner;
public class Atividade40 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        int codigoDaCidade, numeroDeVeiculos, numeroDeAcidentes;
        int cidadeComMaiorIndice = 0, cidadeComMenorIndice = 0;
        double maiorIndiceDeAcidentes = Double.MIN_VALUE, menorIndiceDeAcidentes = Double.MAX_VALUE;
        int totalDeVeiculos = 0, totalDeAcidentesEmCidadesComMenosDe2000Veiculos = 0, cidadesComMenosDe2000Veiculos = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.println("Cidade " + i);

            System.out.print("Código da cidade: ");

            codigoDaCidade = scanner.nextInt();

            System.out.print("Número de veículos de passeio (em 1999): ");

            numeroDeVeiculos = scanner.nextInt();

            System.out.print("Número de acidentes de trânsito com vítimas (em 1999): ");

            numeroDeAcidentes = scanner.nextInt();

            double indiceDeAcidentes = (double) numeroDeAcidentes / numeroDeVeiculos;

            if (indiceDeAcidentes > maiorIndiceDeAcidentes) {

                maiorIndiceDeAcidentes = indiceDeAcidentes;
                cidadeComMaiorIndice = codigoDaCidade;

            }
            if (indiceDeAcidentes < menorIndiceDeAcidentes) {

                menorIndiceDeAcidentes = indiceDeAcidentes;
                cidadeComMenorIndice = codigoDaCidade;

            }

            totalDeVeiculos += numeroDeVeiculos;

            if (numeroDeVeiculos < 2000) {

                totalDeAcidentesEmCidadesComMenosDe2000Veiculos += numeroDeAcidentes;cidadesComMenosDe2000Veiculos++;
                
            }
        }

        double mediaDeVeiculos = (double) totalDeVeiculos / 5;double mediaDeAcidentesEmCidadesComMenosDe2000Veiculos = cidadesComMenosDe2000Veiculos > 0? (double) totalDeAcidentesEmCidadesComMenosDe2000Veiculos / cidadesComMenosDe2000Veiculos: 0;

        System.out.println("Cidade com maior índice de acidentes: " + cidadeComMaiorIndice + " (" + maiorIndiceDeAcidentes + ")");
              
        System.out.println("Cidade com menor índice de acidentes: " + cidadeComMenorIndice + " (" + menorIndiceDeAcidentes + ")");

        System.out.println("Média de veículos nas cinco cidades: " + mediaDeVeiculos);

        System.out.println("Média de acidentes de trânsito nas cidades com menos de 2.000 veículos de passeio: "+ mediaDeAcidentesEmCidadesComMenosDe2000Veiculos);

        scanner.close();
    }
    
}
