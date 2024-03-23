import java.util.Scanner;

public class Atividade27 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite quantas turmas há: ");
        int quantidade_salas = sc.nextInt();

        int totalAlunos = 0;

        for (int i = 0; i < quantidade_salas; i++) {
            
            System.out.println("Digite a quantidade de alunos para a sala " + (i + 1) + ": ");
            int alunos = sc.nextInt();

            while (alunos > 40) {

                System.out.println("Não pode haver mais de 40 alunos em uma sala. Por favor, digite um número válido para a sala "+ (i + 1) + ": ");
                   
                alunos = sc.nextInt();
            }

            totalAlunos += alunos;
        }

        float media = (float) totalAlunos / quantidade_salas;

        System.out.println("A média de alunos por sala é: " + media);

        sc.close();
    }
}
