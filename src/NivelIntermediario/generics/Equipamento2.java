package NivelIntermediario.generics;

public class Equipamento2 {

    private String nome;

    public Equipamento2(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome;
    }
}
