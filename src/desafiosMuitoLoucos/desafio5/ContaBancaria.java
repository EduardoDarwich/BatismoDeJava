package desafiosMuitoLoucos.desafio5;

public abstract class ContaBancaria implements Conta{

    double saldo;

    public ContaBancaria() {
    }

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void depositar(double valor){

    }


}
