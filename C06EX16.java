import java.util.Scanner;
public class C06EX16 {
    public static void main(String[] args) {
    double faltas, prova1, prova2 , prova3, trabalhoFinal, idade, peso1, peso2, notafinal, mediaprovas;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Quantas faltas você tem? ");
        faltas = teclado.nextDouble();

        System.out.print("Nota da Prova 1: ");
        prova1 = teclado.nextDouble();

        System.out.print("Nota da Prova 2: ");
        prova2 = teclado.nextDouble();

        System.out.print("Nota da Prova 3: ");
        prova3 = teclado.nextDouble();

        System.out.print("Nota do Trabalho Final: ");
        trabalhoFinal = teclado.nextDouble();

        System.out.print("Qual sua idade? ");
        idade = teclado.nextDouble();

        mediaprovas = 0;

        if (faltas <= 5 ){
            peso1 = 3;
        }else
            if (faltas < 10 ){
                peso1 = 2;
           }else{
                  peso1 = 1;
              }


        if (idade <= 17){
            peso2 = 1;
        }else
            if (idade <50){
                peso2 = 2;
            }else {
                    peso2 = 3;
                }

        if (prova1 > prova2 && prova3 > prova2){
            mediaprovas = ((prova1 + prova3) / 2)* peso1;
        }else
            if (prova1 > prova3 && prova2 > prova3){
                mediaprovas = ((prova1 + prova2) / 2)* peso1;
            }else
                if (prova2 > prova1 && prova3 > prova1){
                    mediaprovas = ((prova2 + prova3) / 2) * peso1;
                }

        notafinal = mediaprovas + (trabalhoFinal*peso2);

        if (notafinal <= 50){
            System.out.println("REPROVADO");
        }else
            if(notafinal < 70) {
                System.out.println("REGULAR");
            }else
                if(notafinal < 80){
                    System.out.println("BOM");
                }else
                    if(notafinal<90) {
                        System.out.println("MUITO BOM");
                    }else{
                        System.out.println("EXCELENTE");
                    }

        teclado.close();
    }
}
