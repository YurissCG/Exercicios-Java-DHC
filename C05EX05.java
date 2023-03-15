import java.util.Scanner;
public class C05EX05 {
    public static void main(String[] args) {
        double celsius, kelvil, fahrenheit;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a temperatura em Celsius: ");
        celsius = teclado.nextDouble();

        kelvil = 273 + celsius;

        fahrenheit = 1.8f*celsius + 32  ;

        System.out.println("Kelvin: " +kelvil+ "\nFahrenheit: " +fahrenheit );

        teclado.close();
    }
}
