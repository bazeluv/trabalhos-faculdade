import java.util.Scanner;

public class EstruturaRepeticao {
    public static void main(String[] args) {
        
    // contador de cambalhotas(cc)
    int cc = 0;

    // Repetição com teste no inicio

    while (cc<4) {                              // enquanto cc for menor que 4
        System.out.println("cambalhota " + cc);     // continue e print "cambalhota"   
        cc++; // cc = cc + 1
    }

    // Mudando o fluxo de um laço

    int cc2 = 0;

    while (cc2<10) {
        cc2++;
        if (cc2 == 5 || cc2 == 7) {         // se o contador for 5 ou 7 o laço é interrompido no continue, sendo assim nao chega ao print e volta o laço desde o inicio
            continue;                       // volta o laço caso cc2 for 5 ou 7
        }
        System.out.println("cambalhota " + cc2);
    }


    int cc3 = 0;

    while (cc3<15) {                            // aqui o while teria que repetir ate que cc3 fosse 15
        cc3++;
        if (cc3 == 2 || cc3 == 3 || cc3 == 4) {
            continue;                           // aqui caso cc3 for 2, 3 ou 4 volte ao inicio do laço
        }

        if (cc3 == 7) {
            break;                              // porem caso cc3 seja 7, encerre o laço      
        }
        System.out.println("cambalhota " + cc3);
    }


    // Repetição com teste no final

    int cc4 = 0;

    do {
        System.out.println("cambalhota " + cc4);
        cc4++;
    } while (cc4<4);


    // Exemplo

    int numero;
    int soma = 0;
    String resp;

    Scanner leitor = new Scanner(System.in);

    do {
        System.out.print("digite um numero: ");
        numero = leitor.nextInt();
        soma += numero; // soma = soma + numero
        System.out.print("quer continuar? [S/N]");
        resp = leitor.next();
    } while (resp.equals("S"));
    System.out.println("a soma de todos os valores é: " + soma);


    // Repetição com variavel de controle

    for (int cc5 = 0; cc5<=3; cc5++) {               // cc5 = 0, enquanto cc5 for menor/igual a 3, cc++
        
        System.out.println("cambalhota cc5 " + cc5);
    }


    // Laços aninhados

    for (int n1 = 1; n1<=3; n1++) {
        for (int n2 = 0; n2<=2; n2+=2) {
            System.out.print(n1+"\n");
            System.out.println(n2+"\n");
        }
    }
   
    }
}
