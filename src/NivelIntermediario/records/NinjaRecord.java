package NivelIntermediario.records;

public record NinjaRecord(String nome, int idade, int altura) {

    public String emailCaixaAlta(){
        return nome.toUpperCase();
    }
}
