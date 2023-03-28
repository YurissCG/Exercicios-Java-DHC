import java.util.Scanner;
public class C06EX13 {
    public static void main(String[] args) {
    double minutoInicial , minutoFinal, horaInicial, horaFinal, horaReal, minutoReal;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual a hora do inicial do jogo: ");
        horaInicial  = teclado.nextDouble();

        System.out.print("Qual o minuto do inicial do jogo: ");
        minutoInicial  = teclado.nextDouble();

        System.out.print("Qual a hora do final do jogo: ");
        horaFinal  = teclado.nextDouble();

        System.out.print("Qual o minuto do final do jogo: ");
        minutoFinal  = teclado.nextDouble();

        horaReal = horaFinal - horaInicial;
        minutoReal = minutoFinal - minutoInicial;

        if (horaReal < 0){
            horaReal = 24 + horaReal;
        }

        if (minutoReal < 0){
            minutoReal = 60 + minutoReal;
            horaReal--;
        }

        System.out.printf("O jogo durou %.0f ",horaReal);
        System.out.printf(" Horas e %.0f " ,minutoReal);
        System.out.printf( " minutos");

        teclado.close();
    }
}
