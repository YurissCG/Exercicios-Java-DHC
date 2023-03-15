import  java.util.Scanner;
public class C05EX02 {
    public static void main(String[] args) {
        double pi, raio, area, volume ;
        Scanner teclado = new Scanner(System.in);
        pi= 3.1416;
        System.out.println("Digite o valor do raio: ");
        raio = teclado.nextDouble();

        area = 4*pi*Math.pow(raio,2);


        volume = 4/3.0*pi*(Math.pow(raio,3));

        System.out.println("Area: "+area+ "\nVolume :" +volume);
         teclado.close();
    }
}
