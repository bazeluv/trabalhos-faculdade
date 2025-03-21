import java.util.Scanner;

public class EstruturasCondicionais {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        // estrutura condicional simples


        System.out.print("Digite a primeira nota: ");
        float n1 = leitor.nextFloat();
        
        System.out.print("Digite a segunda nota: ");
        float n2 = leitor.nextFloat();
        
        float media = (n1 + n2) / 2;
        System.out.println("Sua média é: " + media);

        if (media >= 9) {
            System.out.println("Parabens");
        }


        // estrutura condicional composta


        System.out.print("Digite o ano de nascimento: ");
        int anoNascimento = leitor.nextInt();
        int idade = 2025 - anoNascimento;

        if (idade >= 18) {
            System.out.println("sua idade é " + idade +" e vc é maior de idade");
        } else if (idade >=  15) {
            System.out.println("sua idade é " + idade + " e vc é adolescente");
        } else {
            System.out.println("sua idade é " + idade +" e vc é criança");
        }
        

        if ((idade >=16 && idade < 18) || (idade > 70)) {
            System.out.println("voto opcional");
        } else if (idade >= 18) {
            System.out.println("voto obrigatorio");
        } else {
            System.out.println("não pode votar");
        }


        // condição de multipla escolha

    System.out.print("quantas pernas vc tem? ");
        int pernas = leitor.nextInt();
        String tipo;
        switch (pernas) {
            case 1:
                tipo = "aleijado";
                break;

            case 2:
                tipo = "bipede";
                break;

            case 4:
                tipo = "quadrupede";
                break;

            case 6, 8:
                tipo = "aranha";
                break;

            default:
                tipo = "Et";
        }
        System.out.println(tipo);
        
    }

}
