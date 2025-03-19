
import javax.swing.JOptionPane;

public class JanelaDePerguntas {
    
    public static void main(String[] args) {
        String filme = JOptionPane.showInputDialog(null, "qual seu filme favorito?", "title", JOptionPane.QUESTION_MESSAGE);
        System.out.println(filme);
        // caso queira ler/identificar um numero temos que transformar por meio do parse novamente
        String texto = JOptionPane.showInputDialog(null, "digite um numero:");
        int numero = Integer.parseInt(texto);
        System.out.println(texto);

        String nome = JOptionPane.showInputDialog(null, "qual seu nome?", "id", JOptionPane.QUESTION_MESSAGE);
        String idade = JOptionPane.showInputDialog(null, "quantos anos vc tem?");
        int nmrIdade = Integer.parseInt(idade);
        JOptionPane.showMessageDialog(null, "seu nome é: " + nome + " e tem " + idade + " anos"); // para imprimir as respostas na janela utilizei o JOptionPane.showMessaageDialog
    }

}
