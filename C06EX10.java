import java.util.Scanner;
public class C06EX10 {
    public static void main(String[] args) {
        Double capital, dias, taxaDiaria, taxareal, valorResgatado, impostoRenda, rendimento;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o Capital Aplicado: ");
        capital = teclado.nextDouble();

        System.out.print("Digite o número de Dias: ");
        dias = teclado.nextDouble();

        System.out.print("Digite a Taxa diaria: ");
        taxaDiaria = teclado.nextDouble();

         taxareal = taxaDiaria * 1/100;

         rendimento = capital * taxareal * dias;
         impostoRenda = rendimento * 0.15;
         valorResgatado = capital + rendimento - impostoRenda - 10.00;

        System.out.println("Valor a ser resgatado: " + valorResgatado);


        teclado.close();
    }
}
