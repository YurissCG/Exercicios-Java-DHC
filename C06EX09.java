import java.util.Scanner;
public class C06EX09 {
    public static void main(String[] args) {
        double altura,pesoIdeal;
        String sexo;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite sua altura em metros: ");
        altura = teclado.nextDouble();
        teclado.nextLine();
        System.out.println("Digite seu sexo M para masculino ou F para feminino ");
        sexo = teclado.nextLine();


        if (sexo.equalsIgnoreCase("M") ){
            pesoIdeal = (72.7 * altura) - 58;
        }else {
            pesoIdeal = (62.1*altura) - 44.7;
        }

        System.out.printf("Peso: %.3f", pesoIdeal);

        teclado.close();
    }
}
