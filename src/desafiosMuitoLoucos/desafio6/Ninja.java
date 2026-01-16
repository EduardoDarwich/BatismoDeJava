package desafiosMuitoLoucos.desafio6;

public class Ninja {
    private String nome;
    private int idade;
    private Vilas vila;

    public Ninja(){

    }

    public Ninja(Vilas vila, int idade, String nome) {
        this.vila = vila;
        this.idade = idade;
        this.nome = nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome (){
        return nome;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public Vilas getVila() {
        return vila;
    }

    public void setVila(Vilas vila) {
        this.vila = vila;
    }

    @Override
    public String toString() {
        return nome + " tem " + idade + " anos e mora em " + vila;
    }
}
