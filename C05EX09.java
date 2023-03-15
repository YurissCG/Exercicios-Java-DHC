import java.util.Scanner;
public class C05EX09 {
    public static void main(String[] args) {
        double nota1, nota2, nota3, peso1, peso2, peso3, media;

        Scanner teclado = new Scanner(System.in);

        System.out.print("digite a primeira nota: ");
        nota1 = teclado.nextDouble();

        System.out.print("digite a segunda nota: ");
        nota2 = teclado.nextDouble();

        System.out.print("digite a terceira nota: ");
        nota3 = teclado.nextDouble();

        peso1 = 2;
        peso2 = 3;
        peso3 = 5;

        double dividendo = ( nota1 * peso1 ) + (nota2 *peso2) + (nota3 * peso3 );
        double divisor = (peso1 + peso2 + peso3);
        media = dividendo/divisor;

        System.out.println("Sua média foi: " +media);
        teclado.close();
    }
}
