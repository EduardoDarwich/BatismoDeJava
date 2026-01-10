package desafiosMuitoLoucos.desafio5;

public class ContaCorrente extends ContaBancaria{
    TipoConta tipoConta;
    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void consultarSaldo() {

        System.out.println("Seu saldo da sua conta corrente é " + saldo );

    }

    @Override
    public void depositar(double valor) {
        saldo = saldo  + (valor - valor * 0.01);

        System.out.println("Você depositou " + valor + " reais");

    }

    @Override
    public String toString() {
        return "Essse é o objeto da connta corrente";
    }
}
