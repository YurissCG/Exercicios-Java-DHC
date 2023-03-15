import java.util.Scanner;
public class C05EX11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite aqui o Codigo de Barras: ");
        int codigoBarras = teclado.nextInt();

        int banco = codigoBarras / 1000000 ;
        int agencia = codigoBarras % 1000000 / 1000 ;
        int sequencial = codigoBarras % 1000 ;

        System.out.println("Banco: "+banco );
        System.out.println("Agencia: "+agencia);
        System.out.println("Sequencial: "+sequencial);

        teclado.close();
    }
}
