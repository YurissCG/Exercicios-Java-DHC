import java.util.Scanner;
public class C05EX08 {
    public static void main(String[] args) {
        double areaCircular, angulo, raio, pi;
        pi = 3.1416;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o valor da Área de um setor circular: ");
        areaCircular = teclado.nextDouble();

        System.out.print("Digite o valor do Ângulo: ");
        angulo= teclado.nextDouble();



        raio = Math.sqrt((areaCircular*360.0) / (angulo * pi)) ;

        System.out.println("Raio: " +raio);


        teclado.close();
    }
}
