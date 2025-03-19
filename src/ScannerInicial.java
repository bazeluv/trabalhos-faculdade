import java.util.Scanner;

public class ScannerInicial {
    public static void main(String[] args) {
        int numero;
        // Scanner = classe
        Scanner leitor = new Scanner(System.in); // o System.in identifica que o valor da variavel sera entregue pelo teclado do usuario.
        leitor.useDelimiter("[\r\n]+"); //dessa maneira o scanner nao finaliza a leitura de strings caso de depare com espaços ou quebras de linha
        System.out.println("digite um numero");
        numero = leitor.nextInt();
        leitor.nextLine();

        System.out.println(numero);

        float numeroFloat;
        System.out.println("digite um numero");
        numeroFloat = leitor.nextFloat();

        System.out.println(numeroFloat);

        String nome;
        System.out.println("qual seu nome completo?");
        nome = leitor.next();

        System.out.println(nome);

        lol(leitor);

        leitor.close();

    }

    public static void lol(Scanner leitor) {
        
        String elo;
        int tier;
        String valorTier;
        String boneco;

        System.out.println("Qual seu elo?");
        elo = leitor.next();

        System.out.println(elo);
        
        System.out.println("Qual seu tier?");
        valorTier = leitor.nextLine();
        tier = Integer.parseInt(valorTier); // aqui utilizei do parseInt para que a variavel valorTier que é uma String seja lido como um inteiro(int, Integer)

        System.out.println(tier);

        System.out.println("Qual seu boneco?");
        boneco = leitor.nextLine();

        System.out.println(boneco);

    }
}
