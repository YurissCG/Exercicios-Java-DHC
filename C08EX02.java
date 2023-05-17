import java.util.Scanner;
public class C08EX02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double notafinal, faltas;

        for (int aux = 1; aux <= 50; aux++){
            System.out.print("Digite o valor da sua Nota Final: ");
            notafinal = teclado.nextDouble();

            System.out.print("Digite seu número de faltas: ");
            faltas = teclado.nextDouble();

            if (notafinal < 0)
                break;

            if (notafinal>= 65 && faltas <= 16){
                System.out.println("Aprovado");
            }else{
                System.out.println("Reprovado");
            }

        }



        teclado.close();
    }
}

