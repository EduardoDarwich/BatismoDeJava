package desafiosMuitoLoucos.desafio5;

public abstract class ContaBancaria implements Conta{

    double saldo;
    TipoConta tipoConta;



    public ContaBancaria() {
    }

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public ContaBancaria(double saldo, TipoConta tipoConta) {
        this(saldo);
        this.tipoConta = tipoConta;
    }

    @Override
    public void depositar(double valor){

    }


}
