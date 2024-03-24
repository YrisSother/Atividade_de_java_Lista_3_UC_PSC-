import java.util.Scanner;
public class Atividade45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String[] gabarito = { "A", "B", "C", "D", "E", "E", "D", "C", "B", "A" };

        int maiorAcerto = 0, menorAcerto = 10, totalAlunos = 0, totalAcertosTurma = 0;

        boolean outroAluno = true;
        while (outroAluno) {

            int acertos = 0;

            for (int i = 0; i < 10; i++) {
                System.out.printf("Resposta da questão %02d: ", i + 1);
                String resposta = scanner.next();
                if (resposta.equalsIgnoreCase(gabarito[i])) {
                    acertos++;
                }
            }

            if (acertos > maiorAcerto) {
                maiorAcerto = acertos;
            }
            if (acertos < menorAcerto) {
                menorAcerto = acertos;
            }
            totalAlunos++;
            totalAcertosTurma += acertos;

            System.out.print("Outro aluno vai utilizar o sistema? (s/n): ");
            String resposta = scanner.next();
            outroAluno = resposta.equalsIgnoreCase("s") ? true : false;
        }

        double mediaNotasTurma = (double) totalAcertosTurma / totalAlunos;

        System.out.println("Resultados:");
        System.out.println("Maior acerto: " + maiorAcerto);
        System.out.println("Menor acerto: " + menorAcerto);
        System.out.println("Total de alunos: " + totalAlunos);
        System.out.println("Média das notas da turma: " + mediaNotasTurma);

        scanner.close();
    }
}
