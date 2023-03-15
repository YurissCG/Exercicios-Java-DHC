import java.util.Scanner;
public class C05EX01 {
    public static void main(String[] args) {
        double valorX, fx;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite o valor de x: ");
        valorX = teclado.nextDouble();

        fx = (Math.pow(valorX,3) )+( 4 * valorX) + 10;
        System.out.println("F(x) = "+fx);


        teclado.close();
    }
}
