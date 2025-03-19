
import javax.swing.JOptionPane;

public class MatematicaJava {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;

        int restoDiv = 10 % 2; // utilizando o % nos temos o resto da divisao como nesse caso 10/2 = 2.0 o resto da divisao é 0
        float restoDiv1 = (float) 11 % 2; // aqui o resto da divisão se apresenta como sendo 5

        int calcSoma = a + b;
        int calcMultiplicacao = a * b;
        float calcDivisao = (float) b / a;
        
        System.out.println(calcSoma);
        System.out.println(calcMultiplicacao);
        System.out.println(calcDivisao);
        System.out.println(restoDiv);
        System.out.println(restoDiv1);

        numero(args);
    }

    public static void numero(String[] args) {
        int contador = 0;
        
        // ++contador
        // contador = contador + 1
        // imprimir o novo valor do contador

        // contador++
        // imprimir o valor antigo
        // contador = contador + 1

        JOptionPane.showMessageDialog(null, contador, "contador", JOptionPane.INFORMATION_MESSAGE);
        contador = contador + 1;
        JOptionPane.showMessageDialog(null, contador, "contador", JOptionPane.INFORMATION_MESSAGE);
        contador++; // mesma coisa que colocar contador = contador + 1
        JOptionPane.showMessageDialog(null, contador, "contador", JOptionPane.INFORMATION_MESSAGE);
        contador += 2; // mesma coisa que colocar contador = contador + 2
        JOptionPane.showMessageDialog(null, contador, "contador", JOptionPane.INFORMATION_MESSAGE);
        contador = contador - 1; 
        JOptionPane.showMessageDialog(null, contador, "contador", JOptionPane.INFORMATION_MESSAGE);
        contador--; // mesma coisa que colocar contador = contador - 1
        JOptionPane.showMessageDialog(null, contador, "contador", JOptionPane.INFORMATION_MESSAGE);
        contador -= 2; // mesma coisa que colocar contador = contador - 2
        JOptionPane.showMessageDialog(null, contador, "contador", JOptionPane.INFORMATION_MESSAGE);
        contador++; 
        JOptionPane.showMessageDialog(null, contador, "contador", JOptionPane.INFORMATION_MESSAGE);
        contador *= 10; // multiplica por 10
        JOptionPane.showMessageDialog(null, contador, "contador", JOptionPane.INFORMATION_MESSAGE);

        int calculo = 2 * 5 + 3 * 4 - 8;
        // 10 + 12 - 8
        // 22 - 8 
        // 14
        JOptionPane.showMessageDialog(null, calculo);

        int numero1 = -6;
        int nuemro2 = 5;
        int calculoNumero = Math.abs(calculo); // como o Math.abs o valor sera impresso de maneira absoluta como no valor 1 apresentado é -6 sera apresentado como 6
        JOptionPane.showMessageDialog(null, numero1);
        
        int calculoNumero1 = (int) Math.pow(10, 2); // com o pow criamos uma potenciacao sendo o primeiro valor como a base e o segundo como expoente. utilizei o (int) pq por padrao o pow executa um numero double
        JOptionPane.showMessageDialog(null, calculoNumero1);
        
        int calculoNumero2 = (int) Math.sqrt(91); // sqrt = raiz quadrada
        JOptionPane.showMessageDialog(null, calculoNumero2);
        
        double calculoNumero3 = Math.ceil(10.54); // ceil = arredonda o numero pra cima. sem cast pois ja inseri diretamente um double
        JOptionPane.showMessageDialog(null, calculoNumero3);
       
        double calculoNumero4 = Math.floor(10.54); // floor = arredonda o numero pra baixo. sem cast pois ja inseri diretamente um double
        JOptionPane.showMessageDialog(null, calculoNumero4);
        
        double calculoNumero5 = Math.min(6, 21); // acha o menor valor entre os dados
        JOptionPane.showMessageDialog(null, calculoNumero5);
        
        double calculoNumero6 = Math.max(6, 21); // acha o maior valor entre os dados
        JOptionPane.showMessageDialog(null, calculoNumero6);

    } 
}
