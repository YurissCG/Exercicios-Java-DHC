import java.util.Scanner;
public class C05EX10 {
    public static void main(String[] args) {
        int numero;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número inteiro de 5 digitos: ");
        numero = teclado.nextInt();

        int unidades = numero % 10;
        int dezenas = numero % 100 / 10;
        int centenas = numero %1000 /100;
        int milhar = numero %10000 / 1000;
        int dezenaMilhar = numero / 10000;

        System.out.println(dezenaMilhar);
        System.out.println(milhar);
        System.out.println(centenas);
        System.out.println(dezenas);
        System.out.println(unidades);

        teclado.close();
    }
}
