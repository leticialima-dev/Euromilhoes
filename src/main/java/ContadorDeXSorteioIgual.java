import java.util.Arrays;

public class ContadorDeXSorteioIgual {



    public static void gerarValorAleatorio() throws InterruptedException {

        int[] novoSorteioFinal = new SimularSorteio().getApostaSorteada();

        int contador = 0;

        while (true) {



            int[] apostaSorteada = new SimularSorteio().getApostaSorteada();

            if (contador > 30) {
                apostaSorteada = novoSorteioFinal;
            }


            if (Arrays.equals(novoSorteioFinal, apostaSorteada)) {
                break;
            }


            System.out.print("sorteio final:    ");
            for (int i = 0; i < 7; i++) {

                System.out.print(novoSorteioFinal[i] + " ");

            }

            System.out.println(" ");
            System.out.print("Sorteio de atual:     ");
            for (int i = 0; i < 7; i++) {

                System.out.print(apostaSorteada[i] + " ");

            }

            System.out.println(" ");

            contador++;

            System.out.println("Foram realizadas " + contador + " apostas");

            Thread.sleep(0);
            System.out.println();
            System.out.println();


        }


        System.out.println("VC PRECISOU DE " + contador + " para ganhar a Euromilhões");


    }
}
