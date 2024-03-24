import java.text.DecimalFormat;
import java.util.Scanner;
public class Atividade41 {
    public static void main(String[] args) {

           double valorDaDivida = 1000.0; 
        double valorDosJuros;
        int quantidadeDeParcelas;
        double valorDaParcela;
        
        System.out.println("Valor da Dívida   Valor dos Juros   Quantidade de Parcelas   Valor da Parcela");
        
        DecimalFormat df = new DecimalFormat("R$ #,##0.00");

        for (int parcelas : new int[]{1, 3, 6, 9, 12}) {
            if (parcelas == 1) {
                valorDosJuros = 0;
            } else {

                valorDosJuros = valorDaDivida * parcelas * 0.1;

            }
            
            double valorTotal = valorDaDivida + valorDosJuros;
            
            valorDaParcela = valorTotal / parcelas;
            
            System.out.printf("%s   %s   %d   %s%n", df.format(valorTotal), df.format(valorDosJuros), parcelas, df.format(valorDaParcela));
        }
        
    }
}
