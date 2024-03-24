import java.util.Scanner;
public class Atividade44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] votosCandidatos = new int[4];
        int votosNulos = 0;
        int votosEmBranco = 0;
        int totalVotos = 0;

        System.out.println("Códigos dos candidatos:");
        System.out.println("1 - Candidato 1");
        System.out.println("2 - Candidato 2");
        System.out.println("3 - Candidato 3");
        System.out.println("4 - Candidato 4");
        System.out.println("5 - Voto Nulo");
        System.out.println("6 - Voto em Branco");
        System.out.println("Digite o código do candidato (ou 0 para encerrar):");

        while (true) {
            int voto = scanner.nextInt();
            if (voto == 0) {
                break;
            }

            switch (voto) {
                case 1:
                case 2:
                case 3:
                case 4:
                    votosCandidatos[voto - 1]++;
                    break;
                case 5:
                    votosNulos++;
                    break;
                case 6:
                    votosEmBranco++;
                    break;
                default:
                    System.out.println("Código inválido. Tente novamente.");
                    break;
            }

            totalVotos++;
        }

        System.out.println("Resultado da Eleição:");
        for (int i = 0; i < 4; i++) {
            System.out.printf("Candidato %d: %d votos%n", i + 1, votosCandidatos[i]);
        }
        System.out.println("Votos Nulos: " + votosNulos);
        System.out.println("Votos em Branco: " + votosEmBranco);
        System.out.printf("Percentagem de Votos Nulos: %.2f%%\n", (double) votosNulos / totalVotos * 100);
        System.out.printf("Percentagem de Votos em Branco: %.2f%%\n", (double) votosEmBranco / totalVotos * 100);

        scanner.close();
    }
}
