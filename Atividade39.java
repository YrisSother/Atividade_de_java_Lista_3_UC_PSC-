import java.util.Scanner;
public class Atividade39 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numeroDoAlunoMaisAlto = 0, numeroDoAlunoMaisBaixo = 0;
        int alturaDoAlunoMaisAlto = 0, alturaDoAlunoMaisBaixo = Integer.MAX_VALUE;
        int numeroDoAluno, alturaDoAluno;

        for (int i = 1; i <= 10; i++) {
            System.out.printf("Digite o número do aluno %d: ", i);
            numeroDoAluno = scanner.nextInt();

            System.out.printf("Digite a altura do aluno %d (em cm): ", i);
            alturaDoAluno = scanner.nextInt();

            if (alturaDoAluno > alturaDoAlunoMaisAlto) {
                alturaDoAlunoMaisAlto = alturaDoAluno;
                numeroDoAlunoMaisAlto = numeroDoAluno;
            }

            if (alturaDoAluno < alturaDoAlunoMaisBaixo) {
                alturaDoAlunoMaisBaixo = alturaDoAluno;
                numeroDoAlunoMaisBaixo = numeroDoAluno;
            }
        }

        System.out.println(
                "O aluno mais alto é o número " + numeroDoAlunoMaisAlto + " com " + alturaDoAlunoMaisAlto + " cm.");
        System.out.println(
                "O aluno mais baixo é o número " + numeroDoAlunoMaisBaixo + " com " + alturaDoAlunoMaisBaixo + " cm.");

        scanner.close();
        
    }
}
