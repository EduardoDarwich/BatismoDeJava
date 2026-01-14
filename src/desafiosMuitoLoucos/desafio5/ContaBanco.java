package desafiosMuitoLoucos.desafio5;

public abstract class ContaBanco implements Conta{
    private int saldo;

    public ContaBanco() {
    }

    public ContaBanco(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public void mostrarInformacoes(){

    }






}
