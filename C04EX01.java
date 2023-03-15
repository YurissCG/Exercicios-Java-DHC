import java.util.Scanner;
public class C04EX01 {
    public static void main(String[] args) {
        String primeiroNome, nomeMeio, sobrenome;
        int idade;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Qual seu primeiro nome: ");
        primeiroNome = teclado.nextLine();
        System.out.println("Qual seu nome do meio: ");
        nomeMeio = teclado.nextLine();
        System.out.println("Qual seu sobrenome: ");
        sobrenome = teclado.nextLine();
        System.out.println("Qual sua idade: ");
        idade = teclado.nextInt();

        System.out.println(sobrenome +',' +primeiroNome+ ' ' +nomeMeio);
        System.out.println("idade: "+idade);
        teclado.close();
    }
}
