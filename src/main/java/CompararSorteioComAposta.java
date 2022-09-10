import java.util.ArrayList;

public class CompararSorteioComAposta {

    private int qEstrela;
    private int qChave;

    public void  calcularAcertos(ArrayList<Aposta> apostaArrayList, int[] numSorteado) {

        for (Aposta aposta : apostaArrayList){

            this.qChave = 0;
            this.qEstrela = 0;

            System.out.println("====================================================");
            System.out.println("SUA APOSTA: ");

            for (int i = 0; i < 7 ; i++) {

                if (i < 5) {


                    System.out.println("Chave: " + aposta.getChave_Estrela()[i] +" | ");
                }
                if (i >= 5) {
                    System.out.print("Estrelas: " + aposta.getChave_Estrela()[i] +" | " );

                }
            }
            System.out.println();
            System.out.println("NÚMEROS SORTEADOS: ");
            System.out.println("====================================================");


            for (int i = 0; i < 7 ; i++) {
                if (i < 5) {
                    System.out.println("Chave: "  + numSorteado[i] + " | ");

                }
                if (i >= 5) {
                    System.out.println("Estrela: " + (i == 5 ? 1 : 2) + " : " + numSorteado[i] + " | ");
                }
            }

            for (int i = 0; i < 7; i++) {
                if (aposta.getChave_Estrela()[i] == numSorteado[i]){

                    if( i < 5){
                        qChave++;
                    }
                    if (i >= 5){
                        qEstrela++;
                    }
                }

            }

            System.out.println();
            System.out.println(this.toString());


        }
    }


    @Override
    public String toString() {
        return

                "Total de Acertos = " +
                        " Chaves = " + qChave + "|" +
                              " Estrelas =  " + qEstrela ;


    }
}
