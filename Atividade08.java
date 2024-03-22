import java.util.Scanner;
public class Atividade08 {
    public static void main(String[] args) {

        System.out.println("\n");
        Scanner sc = new Scanner(System.in);
        int tam = 5;
        int resultado = 0;
        int vet[] = new int[ tam ];
        

        for( int i = 0 ; i < vet.length ; i++ ){

            System.out.printf("Informe o %dº número: ", i + 1 );
            vet[ i ] = sc.nextInt();

            resultado = resultado + vet[i];
        }

        System.out.println("A soma é = "+resultado);

        double media = (double) resultado / vet.length;

        System.out.println("Média = " + media);

        sc.close();
    }
}

