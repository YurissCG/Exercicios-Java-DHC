import java.util.Scanner;
public class C06EX04 {
    public static void main(String[] args) {
        double imc;

        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();

        System.out.print("Escreva sua altura em metros: ");
        double altura = teclado.nextDouble();

        System.out.print("Escreva seu peso em KG: ");
        double peso = teclado.nextDouble();

        imc = peso / Math.pow (altura,2.0);

        if (imc < 18 ){
            System.out.println("Você está desnutrido");
        }else
            if (imc < 20) {
            System.out.println("Você está abaixo do peso ideal");
         }else
             if (imc >= 20 && imc <= 25) {
            System.out.println("Você está no peso ideial");
          }else
              if (imc > 25 && imc <= 27){
                  System.out.println("Você esta acima do peso");
              }else
                  if (imc > 27 ){
                      System.out.println("Você está obesa");
                  }


        teclado.close();
    }
}
