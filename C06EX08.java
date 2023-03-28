import java.util.Scanner;
public class C06EX08 {
    public static void main(String[] args) {
        double altura;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();
        System.out.print("Digite sua altura: ");
        altura = teclado.nextDouble();

        double ideal = Math.pow(altura, 2) * 20;
        double ideal2 = Math.pow(altura, 2) * 25;

        System.out.printf( "Para que você esteja dentro do peso ideal você precisa de no minimo: %.2f", ideal);
        System.out.printf("Kg e máximo: %.2f " , ideal2, "Kg");

        teclado.close();

    }
}
