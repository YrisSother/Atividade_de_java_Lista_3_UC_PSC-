import java.util.Scanner;
public class Atividade25C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidade_idade = 0;
        int resultado = 0;
        int idade = 0;
        float media = 0;

        System.out.println("\n");

        System.out.println("Digite quantas pessoas há para inserir a idade: ");
        quantidade_idade = sc.nextInt();

        System.out.println("\n");

        for (int num = 0; num < quantidade_idade; num++) {

            System.out.printf("Escreva a %dª idade: ", num + 1);
            idade = sc.nextInt();

            resultado = resultado + idade;

        }

        System.out.println("\n");

        media = resultado / quantidade_idade;

        System.out.println("A média das idades é: " + media);

        if (media >= 0 && media <= 25) {
            
            System.out.println("A sua turma é jovem.");

        } else if (media >= 60 && media <= 60) {
            
            System.out.println("A sua turma é adulta.");

        } else if (media > 60) {
            
            System.out.println("A sua turma é idosa.");

        }

        System.out.println("\n");

        sc.close();
    }
}
