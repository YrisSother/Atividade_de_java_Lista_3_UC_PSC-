import java.util.Scanner;
public class Atividade03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade=0;
        float salario;
        char sexo;
        char estado_civil;

        System.out.println("Escreva o seu nome: ");
        nome=sc.next();

        System.out.println("Escreva a sua idade: ");
        do{
            idade =sc.nextInt();
            if (idade > 150) {
                System.out.println("Idade invalida");
            }
        } while (idade > 150);

        System.out.println("Escreva o seu salário: ");
        do{
            salario=sc.nextFloat();
            if (salario <= 0)
            System.out.println("Salario invalido");
        }while (salario <= 0);

        System.out.println("Escreva o seu genero (f/m): ");
        sexo=sc.next().charAt(0);

        while (sexo != 'f' && sexo != 'm') {
            System.out.println("Genero invalido");
            sexo = sc.next().charAt(0);
        }

        System.out.println("Escreva o seus estado cívil (s/c/v/d): ");
        estado_civil=sc.next().charAt(0);

        while (estado_civil != 's' && estado_civil != 'c' && estado_civil != 'v' && estado_civil != 'd') {
            System.out.println("Valor invalido insira novamente");
            estado_civil = sc.next().charAt(0);
        }

        sc.close();
    }
}
