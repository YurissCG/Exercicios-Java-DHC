import java.util.Scanner;
public class C06EX02 {
    public static void main(String[] args) {
        double fx;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor de Poluentes: ");
        double valorP = teclado.nextDouble();

        fx = 0.0;

        if (valorP <= 1500){
            System.out.println("Isento");;
        } else
        if ( valorP <= 3000){
            System.out.println("R$ 3.000,00 de Multa");
        } else
        if (valorP > 3000){
           fx = 5000 * valorP;
            System.out.println( fx +" de Multa");
        }

        teclado.close();
    }
}