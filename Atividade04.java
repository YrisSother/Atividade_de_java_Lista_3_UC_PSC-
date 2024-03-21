import java.util.Scanner;

public class Atividade04 {
    public static void main(String[] args) {
        float pais_a = 80000;
        float pais_b = 200000;
        float crescimento_a = 0.003f; 
        float crescimento_b = 0.15f; 
        int anos = 0;

        while (pais_a < pais_b) {
            pais_a += pais_a * crescimento_a; 
            pais_b += pais_b * crescimento_b; 
            anos++; 
        }

        System.out.println("O país A se igualará ou ultrapassará o país B em " + anos + " anos.");
    }
}
