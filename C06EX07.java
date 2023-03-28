import java.util.Scanner;
public class C06EX07 {
    public static void main(String[] args) {
        double salario, plBruto, impostoRenda, plLiquido, valorFixo, percentualSalario;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Qual o salário do Funcionário: ");
        salario = teclado.nextDouble();

         if (salario <= 300){
             percentualSalario = 0.7;
             valorFixo = 500;
         }else
             if (salario <= 1000){
                 percentualSalario = 0.5;
                 valorFixo = 200;
             }else {
                 percentualSalario = 0.3;
                 valorFixo = 0;
             }

        plBruto = valorFixo + ( salario * percentualSalario);
        impostoRenda = 0.25 * plBruto;
        plLiquido = plBruto - impostoRenda;
        System.out.printf( "PL Liquido: %.2f" ,plLiquido);

        teclado.close();
    }
}
