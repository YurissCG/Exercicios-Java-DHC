import java.util.Scanner;
public class C07EX03 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int imposto, dias;
        double multa;
        multa = 0;
        System.out.print("Digite o valor do imposto: ");
        imposto = teclado.nextInt();

        System.out.print("Dias de atraso: ");
        dias = teclado.nextInt();

        switch (dias){
            case  1: case 2: case 3: case 4: case 5:
                multa = imposto * 0;
                break;
            case 6: case  7: case 8:
                multa = imposto * (0.02);
                break;
            case 9:  case 10:
                multa = imposto * (0.1 + (0.5/100 * dias));
                break;
            default:
                multa = (imposto * 150/100) + dias;

        }


        System.out.println(multa);
        teclado.close();

    }
}
