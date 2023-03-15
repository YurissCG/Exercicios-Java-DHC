import javax.swing.JOptionPane;
public class C04EX04 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog(null,
                "Qual seu nome?",
                "C04EX04",
                JOptionPane.QUESTION_MESSAGE);
        String nomeMeio = JOptionPane.showInputDialog(null,
                "Qual seu nome do meio?",
                "C04EX04",
                JOptionPane.QUESTION_MESSAGE);
        String sobrenome = JOptionPane.showInputDialog(null,
                "Qual seu Sobrenome?",
                "C04EX04",
                JOptionPane.QUESTION_MESSAGE);
        String idadeStr = JOptionPane.showInputDialog(null,
                "Qual sua idade?",
                "C04EX04",
                JOptionPane.QUESTION_MESSAGE);
        int idade = Integer.valueOf(idadeStr);

        JOptionPane.showMessageDialog(null,
                sobrenome+ ", "  +nome+ " " +nomeMeio+
                        "\n Idade: " +idade+ " anos." );

    }
}
