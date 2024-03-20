import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome,senha;

        System.out.println("Digite o nome do seu usuario: ");
        nome = sc.next();

        System.out.println("Digite a sua senha: ");
        senha = sc.next();

        while (nome != senha) {
            
            System.out.println("Digite outra senha: ");
            senha = sc.next();

            System.out.println("Digite outro usuario: ");
            nome = sc.next();
        }
        System.out.println("senha e usuario válidos");
        sc.close();
    }
}
