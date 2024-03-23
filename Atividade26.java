import java.util.Scanner;

public class Atividade26 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int quantidade_A = 0;
        int quantidade_B = 0;
        int quantidade_C = 0;
        int voto;

        System.out.println("\n");

        System.out.print("Informe o número de eleitores: ");
        int eleitores = sc.nextInt();

        System.out.println("\n");

        for (int num = 0; num < eleitores; num++) {
            System.out.printf("Escreva o seu %dº voto (A=1 - B=2 - C=3): ", num + 1);
            voto = sc.nextInt();

            if (voto == 1) {
                quantidade_A++;
            } else if (voto == 2) {
                quantidade_B++;
            } else if (voto == 3) {
                quantidade_C++;
            } else {
                System.out.println("Voto inválido!");
                num--; 
            }
        }

        System.out.println("Resultado da eleição:");
        System.out.println("\n");

        System.out.println("Candidato A: " + quantidade_A + " votos");
        System.out.println("\n");

        System.out.println("Candidato B: " + quantidade_B + " votos");
        System.out.println("\n");

        System.out.println("Candidato C: " + quantidade_C + " votos");
        System.out.println("\n");

        sc.close();

    }

}

