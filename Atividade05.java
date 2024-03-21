import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.out);
        float pais_a;
        float pais_b;
        float crescimento_a = 0.003f;
        float crescimento_b = 0.15f;
        int anos = 0;

        System.out.println("Escreva a quantidade da população do país A :");
        pais_a = sc.nextFloat();

        System.out.println("Escreva a quantidade da população do país B :");
        pais_b = sc.nextFloat();

        while (pais_a < pais_b) {
            pais_a += pais_a * crescimento_a;
            pais_b += pais_b * crescimento_b;
            anos++;
        }

        System.out.println("O país A se igualará ou ultrapassará o país B em " + anos + " years.");
        
        sc.close();
    }
}
