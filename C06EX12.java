import java.util.Scanner;
public class C06EX12 {
    public static void main(String[] args) {
    double producaoBolas, caixaP, mesesCopa, bolasDefeito, alguelMensal, custoTotal;
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite a Produção de Bolas: ");
        producaoBolas = teclado.nextDouble();

        System.out.print("Digite a quantidade de Bolas com Defeito: ");
        bolasDefeito = teclado.nextDouble();

        System.out.print("Digite o valor por Caixa de papelão: ");
        caixaP = teclado.nextDouble();

        System.out.print("Digite o valor do Alguel Mensal: ");
        alguelMensal = teclado.nextDouble();

        System.out.print("Digite a quantidade de meses para a Copa do Mundo: ");
        mesesCopa = teclado.nextDouble();

        double bolasReais = producaoBolas - bolasDefeito;
        double quantidadeCaixas = bolasReais/10 ;
        double galpao = quantidadeCaixas / 850;
        galpao = Math.ceil(galpao);
        quantidadeCaixas = Math.ceil(quantidadeCaixas);

        custoTotal = (quantidadeCaixas * caixaP) + (galpao * alguelMensal * mesesCopa) ;

        System.out.println(custoTotal);

        teclado.close();
    }
}
