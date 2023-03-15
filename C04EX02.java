import java.util.Scanner;
public class C04EX02 {
    public static void main(String[] args) {
        String nome, nomeEmpresa, cpf, identidade, tituloEleitor, carteiraMotorista, salario;


        Scanner teclado = new Scanner(System.in);

        System.out.print("Qual seu nome: ");
        nome = teclado.nextLine();
        System.out.print("Qual seu CPF: ");
        cpf = teclado.nextLine();
        System.out.print("Qual sua identidade: ");
        identidade = teclado.nextLine();
        System.out.print("Qual seu Titulo de Eleitor: ");
        tituloEleitor = teclado.nextLine();
        System.out.print("Qual sua carteira de motorista: ");
        carteiraMotorista = teclado.nextLine();
        System.out.print("Qual seu salário: ");
        salario = teclado.nextLine();
        System.out.print("Nome da empresa: ");
        nomeEmpresa = teclado.nextLine();
        teclado.nextLine();

        for (int repete = 3; repete <= 0; repete--){
            System.out.println();
        }
        System.out.println("FICHA FUNCIONAL DE: " +nome);
        System.out.println("Documentos:............ ");
        System.out.println("CPF.................... " +cpf);
        System.out.println("C.I.................... " +identidade);
        System.out.println("Titulo de Eleitor...... "+tituloEleitor);
        System.out.println("Carteira de Motorista.. "+carteiraMotorista);

        System.out.println("Empresa: " +nomeEmpresa);
        System.out.println("Salário: R$ " +salario);





        teclado.close();
    }
}
