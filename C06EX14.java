import java.util.Scanner;
public class C06EX14 {
    public static void main(String[] args) {
        int numero, d1, d2, d3, d4;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número inteiro de 4 digitos: ");
        numero = teclado.nextInt();


        if (numero > 1000 && numero < 9999){
            d1 = numero % 10000 / 1000;
            d2 = numero % 1000 /100;
            d3 = numero % 100 / 10;
            d4 = numero % 10;
            System.out.println(d4+ " " +d3+ " "+d2+ " "+d1 );
        }else {
            System.out.println("Numero n possui 4 digitos");
        }



        teclado.close();
    }
}
