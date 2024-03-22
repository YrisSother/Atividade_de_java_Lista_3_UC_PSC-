public class Atividade09 {
    public static void main(String[] args) {
        int num = 0;
        int tam = 50;
        int result = 0;
        String numerosImpares = "";

        while (result < tam) {
            result = 2 * num + 1;
            numerosImpares += result + " "; 
            num++;
        }

        System.out.println("Os números ímpares até o 50 são: " + numerosImpares);
    }
}
