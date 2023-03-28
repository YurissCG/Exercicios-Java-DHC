import java.util.Scanner;
public class C06EX17 {
    public static void main(String[] args) {
    String p1, p2, p3, p4, p5, p6, p7, p8, p9;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Responda com V ou F");
        System.out.print("Você tem curso técnico de programação? ");
        p1 = teclado.nextLine();
        System.out.print("Você tem curso superior de programação? ");
        p2 = teclado.nextLine();
        System.out.print("Você tem menos de 3 anos de experiência em programação? ");
        p3 = teclado.nextLine();
        System.out.print("Você se considera uma pessoa criativa? ");
        p4 = teclado.nextLine();
        System.out.print("Você prefere liderar a ser liderado? ");
        p5 = teclado.nextLine();
        System.out.print("Você prefere trabalhar sozinho a trabalhar em equipe? ");
        p6 = teclado.nextLine();
        System.out.print("Você é autodidata (aprende sozinho)? ");
        p7 = teclado.nextLine();
        System.out.print("Você aceitaria uma remuneração inicial de R$1500? ");
        p8 = teclado.nextLine();
        System.out.print("Você só aceitaria trabalhar em escritórios da empresa dentro da grande BH? ");
        p9 = teclado.nextLine();


        if (p4.equalsIgnoreCase("F") ){
            System.out.println("Aguarde eu retornar para você");
        }else

        if (p6.equalsIgnoreCase("V")){
            System.out.println("Aguarde eu retornar para você");
        }else

        if (p7.equalsIgnoreCase("F")){
            System.out.println("Aguarde eu retornar para você");
        }else

        if (p9.equalsIgnoreCase("V")){
            System.out.println("Aguarde eu retornar para você");
        }else

        if (p5.equalsIgnoreCase("V") && p8.equalsIgnoreCase("V")){
            System.out.println("Aguarde eu retornar para você");
        }else

        if (p1.equalsIgnoreCase("V") && p3.equalsIgnoreCase("F")){
            System.out.println("Aguarde eu retornar para você");
        }else

        if (p2.equalsIgnoreCase("V") && p3.equalsIgnoreCase("F")){
            System.out.println("Aguarde eu retornar para você");
        }else

            System.out.print("Aprovado");
            teclado.close();
    }
}
