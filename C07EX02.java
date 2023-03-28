import java.util.Scanner;
public class C07EX02 {
    public static void main(String[] args) {
    int nota1, nota2, nota3, notafinal ;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a sua nota 1: ");
        nota1 = teclado.nextInt();

        System.out.print("Digite a sua nota 2: ");
        nota2 = teclado.nextInt();

        System.out.print("Digite a sua nota 3: ");
        nota3 = teclado.nextInt();

        notafinal = (nota1 + nota3 + nota2) / 3 ;

        switch (notafinal){
            case 9: case 10:
                System.out.println("A");
                break;

            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 5: case 6:
                System.out.println("D");
                break;
            case  1: case 2: case 3: case 4:
                System.out.println("E");
                break;
            default:
                System.out.println("Não tem nota para esses dados");
        }

        teclado.close();
    }
}
