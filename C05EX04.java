import java.util.Scanner;
public class C05EX04 {
    public static void main(String[] args) {
        double valorx1, valory1, valorx2, valory2, distancia, pontox, pontoy;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor de X do Ponto 1: ");
        valorx1 = teclado.nextDouble();

        System.out.print("Digite o valor de Y do Ponto 1: ");
        valory1 = teclado.nextDouble();

        System.out.print("Digite o valor de X do Ponto 2: ");
        valorx2 = teclado.nextDouble();

        System.out.print("Digite o valor de Y do Ponto 2: ");
        valory2 = teclado.nextDouble();


        pontox = valorx1 - valorx2;
        pontoy = valory1 - valory2;

        distancia =  Math.sqrt ( (Math.pow(pontox,2.0)) + (Math.pow(pontoy,2.0)));

        System.out.println("Distancia " +distancia);
        teclado.close();
    }
}
