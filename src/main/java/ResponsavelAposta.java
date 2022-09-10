import java.util.ArrayList;

public class ResponsavelAposta {

    private ArrayList<Aposta> aposta = new ArrayList<>();

    public ResponsavelAposta() {
    }
    // métodos

    public  void adicionarAposta(Aposta aposta){
        this.aposta.add(aposta);
    }

    public ArrayList<Aposta> getAposta(){
        return this.aposta;
    }
}
