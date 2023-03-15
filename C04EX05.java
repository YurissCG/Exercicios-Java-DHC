import javax.swing.JOptionPane;
import java.util.Scanner;
public class C04EX05 {
    public static void main(String[] args) {

        Scanner arquivo = new Scanner(
                C04EX05.class.getResourceAsStream("Ficha.txt")
        );

//
//         = JOptionPane.showInputDialog(null,
//                "Qual seu nome?",
//                "C04EX05",
//                JOptionPane.QUESTION_MESSAGE);
//

        String nome;
        nome = arquivo.nextLine();
        System.out.println(nome);

//        String cpf = JOptionPane.showInputDialog(null,
//                "Qual seu CPF?",
//                "C04EX05",
//                JOptionPane.QUESTION_MESSAGE);
        String cpf;
        cpf = arquivo.nextLine();
        System.out.println(cpf);


//        String identidade = JOptionPane.showInputDialog(null,
//                "Qual sua Identidade?",
//                "C04EX05",
//                JOptionPane.QUESTION_MESSAGE);

        String identidade;
        identidade = arquivo.nextLine();
        System.out.println(identidade);


//        String tituloEleitor = JOptionPane.showInputDialog(null,
//                "Qual seu Título De eleitor?",
//                "C04EX05",
//                JOptionPane.QUESTION_MESSAGE);
        String tituloEleitor;
        tituloEleitor = arquivo.nextLine();
        System.out.println(tituloEleitor);

//        String carteiraMotorista = JOptionPane.showInputDialog(null,
//                "Qual sua Carteira de Motorista?",
//                "C04EX05",
//                JOptionPane.QUESTION_MESSAGE);
        String carteiraMotorista;
        carteiraMotorista = arquivo.nextLine();
        System.out.println(carteiraMotorista);

//        String salarioStr = JOptionPane.showInputDialog(null,
//                "Qual seu Salário?",
//                "C04EX05",
//                JOptionPane.QUESTION_MESSAGE);
        String salarioStr;
        salarioStr = arquivo.nextLine();
        System.out.println(salarioStr);

//        String nomeEmpresa = JOptionPane.showInputDialog(null,
//                "Qual o Nome da Empresa?",
//                "C04EX05",
//                JOptionPane.QUESTION_MESSAGE);
        String nomeEmpresa;
        nomeEmpresa = arquivo.nextLine();
        System.out.println(nomeEmpresa);



        int salario = Integer.valueOf(salarioStr);


        JOptionPane.showMessageDialog(null,
                "FICHA FUNCIONAL DE: " +nome+
                        "\n"+ "\n"+
                        "Documentos: "+
                        "\n" +
                        "CPF................... " +cpf+ "\n"+
                        "C.I................... " +identidade+ "\n"+
                        "Titulo de eleitor..... " +tituloEleitor+ "\n"+
                        "Carteira de motorista. " +carteiraMotorista+ "\n"+
                        "\n" +
                        "Empresa:" +nomeEmpresa+ "\n"+
                        "Salário:" +salario
        );
 arquivo.close();
    }
}
