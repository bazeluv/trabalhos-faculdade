
import java.util.Random;
import javax.swing.JOptionPane;

public class NumerosAleatorios {
    public static void main(String[] args) {
        int dado6Faces = 1 + (int) (Math.random() * 6); // o +1 diz que o valor minimo do math.random é 1. ja o * 6 referece ao intervalo dos numeros que serao impressos neste caso: 1-6.
        // os () envolta do Math.random() * 6 sao necessarios para que seja o primeiro calculo da operação e em seguida seja transformado em int
        JOptionPane.showMessageDialog(null, dado6Faces);
        
        // math.random tem um desempenho menor do que o Random

        Random gerador = new Random();
        int numero = gerador.nextInt(6) + 1; // no bound dentro do gerador.nextInt() representa o valor maximo ja o + 1 o valor minimo
        JOptionPane.showMessageDialog(null, numero);

        int facesDado = Integer.parseInt(JOptionPane.showInputDialog(null, "quantas faces tem o dado?")); // usei o Integer.parseInt para que o joption receba um int e nao uma String
        int resultado = gerador.nextInt(facesDado) + 1;
        JOptionPane.showMessageDialog(null, resultado);
    }
} 
 