package desafiosMuitoLoucos.desafio5;

public class ContaPoupanca extends ContaBancaria{

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void consultarSaldo() {

        System.out.println("Seu saldo da sua conta poupanca é " + saldo);

    }

    @Override
    public void depositar(double valor) {
        saldo = saldo  + (valor - valor * 0.01);

        System.out.println("Voce depositou " + valor + " reais na sua conta poupanca");

    }
}
