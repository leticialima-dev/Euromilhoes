import java.util.Random;

public class SimularSorteio {

    private int[] ApostaSorteada = new int[7];


    public SimularSorteio() {

        this.realizarSorteio();

        this.ordenarSorteio();

    }



    private void realizarSorteio() {
        for (int i = 0; i < 5; i++) {

            this.ApostaSorteada[i] = new Random().nextInt(50) + 1;
        }

        this.ApostaSorteada[5] = new Random().nextInt(11) + 1;
        this.ApostaSorteada[6] = new Random().nextInt(11) + 1;
    }


    private void ordenarSorteio() {


        for(int i = 0; i < this.ApostaSorteada.length - 2; i++){

            for(int j = 0; j < this.ApostaSorteada.length - 3; j++){

                if(this.ApostaSorteada[j] > this.ApostaSorteada[j + 1]){

                    int bubbleAux = this.ApostaSorteada[j];
                    this.ApostaSorteada[j] = this.ApostaSorteada[j+1];
                    this.ApostaSorteada[j+1] = bubbleAux;
                }

            }
        }


        if(this.ApostaSorteada[5] > this.ApostaSorteada[6]){

            int aux = this.ApostaSorteada[6];
            this.ApostaSorteada[6] = this.ApostaSorteada[5];
            this.ApostaSorteada[5] = aux;

        }

    }

    public int[] getApostaSorteada() {
        return ApostaSorteada;
    }


}
