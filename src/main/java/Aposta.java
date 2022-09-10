public class Aposta {

    private int []  chave_Estrela = new int[7];

    public Aposta(int[]aposta) {
        this.chave_Estrela = aposta;
        this.ordenarSorteio();
    }

    private void ordenarSorteio(){

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 4 ; j++) {
                if(this.chave_Estrela[j] > this.chave_Estrela[j + 1]){

                    int bubbleAux =  this.chave_Estrela[j];
                    this.chave_Estrela[j] = this.chave_Estrela[j+1];
                    this.chave_Estrela[j+1] = bubbleAux;
                }
            }
        }

        if(this.chave_Estrela[5] > this.chave_Estrela[6]){
            int aux = this.chave_Estrela[6];
            this.chave_Estrela[6] = this.chave_Estrela[5];
            this.chave_Estrela[5] = aux;
        }
    }
    public int[] getChave_Estrela(){
        return chave_Estrela;
    }
}
