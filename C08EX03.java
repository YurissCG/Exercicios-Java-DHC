import java.util.Scanner;
public class C08EX03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double notafinal, faltas;
        int cont1, cont2;

        cont1 = 0;
        cont2 = 0;

        for (int aux = 1; aux <= 3; aux++){
            System.out.print("Digite o valor da sua Nota Final: ");
            notafinal = teclado.nextDouble();

            System.out.print("Digite seu número de faltas: ");
            faltas = teclado.nextDouble();

            if (notafinal < 0)
                break;

            if (notafinal>= 65 && faltas <= 16){
                System.out.println("Aprovado");
                cont1++;
            }else{
                System.out.println("Reprovado");
                cont2++;
            }
        }
        System.out.println("Aprovados : " + cont1 + " Reprovados: " + cont2);


        teclado.close();
    }
}

