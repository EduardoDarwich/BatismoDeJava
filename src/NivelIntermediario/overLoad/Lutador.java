package NivelIntermediario.overLoad;

public class Lutador {

    int tempoDeLuta;
    String nome;
    int derrotas;

    public Lutador(String nome, int tempoDeLuta) {
        this.nome = nome;
        this.tempoDeLuta = tempoDeLuta;
    }

    //Exemplo de sobrecarga de construtor
    public Lutador() {
    }

    //Exemplo de sobrecarga de construtor
    public Lutador(int derrotas, String nome, int tempoDeLuta){
        this(nome,tempoDeLuta);
        this.derrotas=derrotas;
    }

    //Exemplo de sobrecarga de metodo
    public void estrategia(){
        System.out.println("Essa é a minha estrategia");
    }

    //Exemplo de sobrecarga de metodo
    public void estrategia(String descricao){
        System.out.println(descricao);

    }


}
