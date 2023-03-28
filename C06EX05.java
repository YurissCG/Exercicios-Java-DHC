import java.util.Scanner;
public class C06EX05 {
    public static void main(String[] args) {
    int numero, resto5, resto7 ;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um número inteiro:");
        numero = teclado.nextInt();

        resto5 = numero % 5;
        resto7 = numero % 7;

         if (resto5 == 0 && resto7 ==0){
             System.out.println(numero+ " é divisível simultaneamente por 5 e 7");
         } else {
             System.out.println(numero+ " não é divisível simultaneamente por 5 e 7");
         }

        teclado.close();
    }
}
