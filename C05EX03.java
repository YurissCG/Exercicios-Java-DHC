import java.util.Scanner;
public class C05EX03 {
    public static void main(String[] args) {
        double salario, impostoRenda, liquido ;
        int nPessoas ;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe seu salario: ");
        salario = teclado.nextDouble();
        System.out.print("Número de Dependentes: ");
        nPessoas = teclado.nextInt();

        liquido = salario - (nPessoas * 60.00) ;
        impostoRenda = 15/100.0 * liquido ;

        System.out.println("IR: " +impostoRenda);

        teclado.close();
    }
}
