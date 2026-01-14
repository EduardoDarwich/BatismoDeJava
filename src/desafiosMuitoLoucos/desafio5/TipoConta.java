package desafiosMuitoLoucos.desafio5;

public enum TipoConta {
    CORRENTE("Conta para grande tráfego de dinheiro"),
    POUPANCA("Conta para guardar o seu dinheiro de forma segura");

    private String descricao;

    private TipoConta(String descricao){
        this.descricao = descricao;
    }

}
