import java.util.Scanner;

public class C06EX11 {
    public static void main(String[] args) {
        double sets01, sets02, pontos01, pontos02;
        String equipe01, equipe02;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite o nome da equipe 1: ");
        equipe01 = teclado.nextLine();

        System.out.print("Digite o nome da equipe 2: ");
        equipe02 = teclado.nextLine();

        System.out.print("Digite a quantidade de sets ganhos da equipe 1: ");
        sets01 = teclado.nextDouble();

        System.out.print("Digite a quantidade de sets ganhos da equipe 2: ");
        sets02 = teclado.nextDouble();

        pontos01 = 0;
        pontos02 = 0;
        if (sets01 == 2 && sets02 == 3) {
            pontos01 = 1;
            pontos02 = 2;
        } else
            if (sets01 == 3 && sets02 == 2) {
            pontos01 = 2;
            pontos02 = 1;
            } else
                if (sets01 == 0 && sets02 == 3) {
                     pontos01 = 0;
                     pontos02 = 3;
               } else
                   if (sets01 == 3 && sets02 == 0) {
                       pontos01 = 3;
                       pontos02 = 0;
                   } else
                       if (sets01 == 3 && sets02 == 1) {
                           pontos01 = 3;
                           pontos02 = 0;
                      } else
                          if (sets01 == 0 && sets02 == 3) {
                              pontos01 = 0;
                              pontos02 = 3;
                         } else {
                                 System.out.println("ERRO: Número de Sets inválidos");
                                }

        System.out.println("\nEquipe 1 =" + equipe01 + "\n" +
                "Sets equipe 1= " + sets01 + "\n" +
                "--> Pontos " + equipe01 + " = " + pontos01);

        System.out.println();

        System.out.println("Equipe 1 =" + equipe02 + "\n" +
                "Sets equipe 1= " + sets02 + "\n" +
                "--> Pontos " + equipe02 + " = " + pontos02);


        teclado.close();
    }
}
