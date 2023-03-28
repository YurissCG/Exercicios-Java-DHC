import java.util.Scanner;
public class C06EX03 {
    public static void main(String[] args) {
        double fx;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor das vendas: ");
        double valorP = teclado.nextDouble();

        fx = 240;

        if (valorP <= 1000){
            System.out.println("Salário: " +fx);;
        } else
        if ( valorP <= 10000){
            double sl = (valorP * 0.1) + fx ;
            System.out.println("Salário" +sl);
        } else
        if (valorP > 10000){
            fx = 1000 + fx;
            System.out.println( "Salário: "+fx);
        }

        teclado.close();
    }
}