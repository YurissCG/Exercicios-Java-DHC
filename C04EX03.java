import java.util.Scanner;
public class C04EX03 {
    public static void main(String[] args) {
        String multa, multa2, multa3;
        int qPoluente, qPoluente2;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor minimo de multa: ");
        multa = teclado.nextLine();
        System.out.println("Digite o valor da médio de multa: ");
        multa2 = teclado.nextLine();
        System.out.println("Digite o valor de multa por poluente: ");
        multa3 = teclado.nextLine();
        System.out.println("Digite o valor minímo de poluente: ");
        qPoluente = teclado.nextInt();
        System.out.println("Digite o valor limite de poluente: ");
        qPoluente2 = teclado.nextInt();


        System.out.println();
        System.out.println("==========================================================================");
        System.out.println("           Quantidade de Poluente Emitido x Valor da Multa");
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Até "  +qPoluente+   " multa de R$ " +multa);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println("Acima de "   +qPoluente+   " até " +qPoluente2+  " multa de R$" +multa2);
        System.out.println("---------------------------------------------------------------------------");
        System.out.println( "Acima de " +qPoluente2+  " multa de R$ "  +multa3+ " por poluente emitido");
        System.out.println("===========================================================================");
        teclado.close();
    }
}
