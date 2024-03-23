import java.util.Scanner;
public class Atividade25 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int idade = 0;
        float resultado = 0;
        float notas = 0;

        System.out.println("Digite quantas pessoas há para inserir a idade: ");
        int quantidade_idade = sc.nextInt();

        for (int num = 0; num < quantidade_idade; num++) {

            System.out.printf("Escreva a %dº idade: ", num + 1);
            idade = sc.nextInt();

            resultado = resultado + notas;

        }
    }
}
