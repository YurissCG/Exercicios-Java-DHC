import java.util.Scanner;
public class C08EX04 {
    public static void main(String[] args) {
    int cont1, cont2;
    cont1 = 0;
    cont2 = 0;
        Scanner teclado = new Scanner(System.in);

        for (int aux = 0; aux <= 49; aux++){
            teclado.nextLine();
            System.out.print("Digite seu nome: ");
            String nome = teclado.nextLine();

            System.out.print("Qual a idade do aluno: ");
            int idade = teclado.nextInt();

            System.out.println("Nome = " + nome + " Idade= " +idade);

            if (idade < 18){
              cont1++;
            }else {
                cont2++;
            }

        }

        System.out.println("Até 18 -> " + cont1 + " Acima de 18 -> " + cont2);

        teclado.close();
    }
}
