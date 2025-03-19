public class VariaveisEPrints {
    public static void main(String[] args) throws Exception {

        // variaveis 

        byte numeroPequeno = 127; // byte -128 à +127
        short numeroShort = 32767;
        int numeroInteiro = 5487451; // identificado por %d e Integer
        long numeroEnorme = 494984954865l; // necessario finalizar com "l" para o java identificar o tipo primitivo long
        float podeNumeroDecimal = 12.33f; //tambem necessario finalizar com "f" para identificação do tipo primitivo. identificado por %f
        double muitoNumeroDepoisDaVirgula = 3.1416321123; // nao necessario finalizar com caracter pois o java ja identifica o double por padrao
        char letra = 'A'; // possivel apenas armazenar uma caracter. identificado por %c   
        boolean trueFalse = false; // apenas true or false (1, 0). identificado por %b
        String nome = "Gustavo"; // não é um tipo primitivo. identificado por %s

        serie(args);
        mensagem(args);
    
    }

    public static void serie(String[] args) {
        
        String nomeSerie = "Dexter";
        int numeroEps = 100;

        System.out.println("a serie " + nomeSerie + " é poggers e tem " + numeroEps + " de episodios!");
        // tambem podendo ser armazenado dentro de uma string
        String todoTexto = "a serie " + nomeSerie + " é poggers e tem " + numeroEps + " de episodios!";
        System.out.println(todoTexto);

        // ou

        System.out.format("a serie %s tem %d episodios.\n", nomeSerie, numeroEps); // com o format no lugar de println nao havera quebra de linha ao final da exibição da String entao se deve usar "\n" antes do encerramento das aspas da String para adicionar a quebra de linha
        // pode tambem ser armazenado numa string
        String todoTexto2 = String.format("a serie %s tem %d episodios.\n", nomeSerie, numeroEps);
        System.out.println(todoTexto2);
    }

    public static void mensagem(String[] args) {
        
    String msg1 = "oi ";
    String msg2 = "oie";

    String msgFinal = msg1 + msg2;
    System.out.println(msgFinal);

    // ou

    String msgFinal2 = String.format("%s%s \n", msg1, msg2); // nao separei os %s por espaço pois ja esta com espaço dentro do valor da variavel msg1
    System.out.println(msgFinal2);

    }
}
