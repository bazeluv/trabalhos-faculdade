
public class OperadoresTernarios {
    public static void main(String[] args) {
        int n1 = 4;
        int n2 = 8;
        int resultado = (n1 > n2)?0:1; // o ? age quase como um if, nesse caso SE n1 for maior que n2, mostre 0 caso nao, mostre 1
        System.out.println(resultado);

        String nome1 = "Bazan";
        String nome2 = "Bazan";
        String nome3 = new String("Bazan");
        String res;
        String res2;
        String res3;
        
        res = (nome1==nome2)?"igual":"diferente"; // como nome1 e nome2 sao iguais, o resultado sera igual
        res2 = (nome1==nome3)?"igual":"diferente"; // resulta diferente pois nome3 foi instanciado com new String
        res3 = (nome1.equals(nome3))?"igual":"diferente"; // para comparar strings objeto usamos o metodo equals
        System.out.println(res);
        System.out.println(res2);
    }

}
