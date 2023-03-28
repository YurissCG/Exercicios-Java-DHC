import java.util.Scanner;
public class C06EX15 {
    public static void main(String[] args) {
    double codigo, dias, servicosExtra, valorFixo, ppp, imposto, conta;
    String cidade;
         Scanner teclado = new Scanner(System.in);
        System.out.print("Qual o codigo do seu pacote: ");
        codigo = teclado.nextDouble();

        System.out.print("Quantos dias você consumiu de pay-per-view: ");
        dias = teclado.nextDouble();

        System.out.print("Qual o valor dos serviços Extra: ");
        servicosExtra = teclado.nextDouble();
        teclado.nextLine();

        System.out.print("Qual sua cidade: ");
        cidade = teclado.nextLine();

        valorFixo = 0;
        ppp = 0;

        if (cidade.equalsIgnoreCase("Belo Horizonte")){
            imposto = 0;
          }else
             if (cidade.equalsIgnoreCase("São Paulo")){
            imposto = 0.01;
            }else
               if(cidade.equalsIgnoreCase("Rio de Janeiro")){
            imposto= 0.015;
              }else{
                   imposto = 0.02;
               }





        if (codigo == 1){
            valorFixo = 65;
            ppp = dias * 1.20;
                if (ppp > 65){
                    ppp = 65;
                    System.out.println("seu ppp passou de 65 reais: NEGADO os outros dias");
                }

        }else
            if (codigo == 2){
                valorFixo = 104;
                ppp = dias * 2.1;
            }else
                if (codigo == 3){
                    valorFixo = 137;
                    ppp = 0;

                }else{
                    System.out.println("Não exite esse pacote");
                }

          double impostofinal = imposto * (valorFixo + ppp + servicosExtra);
          conta = valorFixo + ppp + servicosExtra + impostofinal;

        System.out.printf("Conta = R$%.2f",conta);

         teclado.close();
    }
}
