import java.util.Scanner;
public class C06EX06 {
    public static void main(String[] args) {
    double valora, valorb, valorc;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o valor de A:" );
        valora = teclado.nextDouble();

        System.out.print("Digite o valor de B:" );
        valorb = teclado.nextDouble();

        System.out.print("Digite o valor de C:" );
        valorc = teclado.nextDouble();

        double delta = Math.pow(valorb,2) - 4 * valora * valorc;
        double raizes01 = (-valorb - Math.sqrt(delta)) / (2 * valora);
        double raizes02 = (-valorb + Math.sqrt(delta)) / (2 * valora);

        if (delta > 0){
            System.out.println(raizes02+ ", " +raizes01);
        }else
            if (delta == 0){
                System.out.println("Teremos uma raiz: "+raizes02);
            }else {
                    System.out.println("Não tem raiz");
                }


        teclado.close();
    }
}
