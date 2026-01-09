package NivelIntermediario.overLoad;

public class Pugilista extends Lutador {
    int nivelJab;
    int nivelGancho;

    public Pugilista(String nome, int tempoDeLuta, int nivelJab) {
        super(nome, tempoDeLuta);
        this.nivelJab = nivelJab;
    }

    public Pugilista(int nivelJab) {
        this.nivelJab = nivelJab;
    }

    public Pugilista (int derrotas, String nome, int tempoDeLuta, int nivelJab, int nivelGancho){
        super( derrotas,nome, tempoDeLuta);

    }

    public Pugilista(int nivelJab, int nivelGancho) {
        this.nivelJab = nivelJab;
        this.nivelGancho = nivelGancho;
    }
}
