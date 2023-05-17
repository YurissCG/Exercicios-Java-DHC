import java.util.Scanner;
public class C08EX01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double pi, raio, area;
        pi = 3.1416;
        for (int aux = 1; aux <= 10; aux++){
            System.out.print("Digite o valor do raio: ");
            raio = teclado.nextDouble();

            area = pi * Math.pow(raio, 2);

            System.out.println("Raio = " + raio + " -> Área: " + area);
        }



        teclado.close();
    }
}
