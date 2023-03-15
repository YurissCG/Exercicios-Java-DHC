import java.util.Scanner;
public class C05EX06 {
    public static void main(String[] args) {
        double valora, valorb, valorc, valory, valorx, distancia;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        valora = teclado.nextDouble();

        System.out.print("Digite o valor de B: ");
        valorb = teclado.nextDouble();

        System.out.print("Digite o valor de C: ");
        valorc = teclado.nextDouble();

        System.out.print("Digite o valor de X: ");
        valorx = teclado.nextDouble();

        System.out.print("Digite o valor de Y: ");
        valory = teclado.nextDouble();


        distancia = ((valora * valorx) + (valorb * valory) + valorc) / Math.sqrt(Math.pow(valora, 2.0) + Math.pow(valorb, 2.0)) ;

        System.out.println("Distancia: "+distancia);


        teclado.close();
    }
}
