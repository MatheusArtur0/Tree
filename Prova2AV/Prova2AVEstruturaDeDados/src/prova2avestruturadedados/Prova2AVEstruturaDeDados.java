package prova2avestruturadedados;
import java.util.Scanner;

public class Prova2AVEstruturaDeDados {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int opc = 0;
        while (opc != 4){
            System.out.println("");
            System.out.println("## �RVORE BIN�RIA ##");
            System.out.println("1 - Inserir");
            System.out.println("2 - Remover");
            System.out.println("3 - Listar");
            System.out.println("4 - Sair");
            System.out.println("");
            System.out.print("Informe a op��o desejada: ");
            opc = leia.nextInt();
            switch (opc) {
                case 1:
                    //Inserir
                    //Os elementos a esquerda s�o menores do que 10 e os elementos a direita s�o maiores.
                     Arvore<Integer> arvore = new Arvore<Integer>();
                     arvore.adicionar(leia.nextInt());
                    break;
                case 2:
                    //Remover
                    break;
                case 3:
                    //Listar

                    break;
                case 4:
                    System.out.println("Sair");
                    break;
                default:
                    System.out.println("Op��o invalida!");
                    break;
            } 
        }
    }

}
