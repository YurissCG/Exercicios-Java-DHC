import java.util.Scanner;
public class C06EX01 {
    public static void main(String[] args) {
        double fx;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor de X: ");
        double valorX = teclado.nextDouble();

        fx = 0.0;

        if (valorX < 4){
            fx = ( (5 * valorX) + 3) / Math.sqrt( 16 - Math.pow( valorX , 2));
        } else
            if ( valorX == 4){
                fx = 0.0;
            } else
                if (valorX > 4){
                    fx = ( (5.0 * valorX) + 3.0) / Math.sqrt(Math.pow( valorX , 2.0) - 16.0);
                }

        System.out.print(fx);

        teclado.close();
    }
}
