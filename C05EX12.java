import java.util.Scanner;
public class C05EX12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o tempo de duração do programa em segundos: ");
        int segundos = teclado.nextInt();

        int hora = segundos / 3600;
        int minutos = (segundos % 3600) / 60;
        int resto = segundos % 60;

        System.out.println("Hora: "+hora+ ", Min: " +minutos+ ", Segundos: "+resto );

        teclado.close();
    }
}
