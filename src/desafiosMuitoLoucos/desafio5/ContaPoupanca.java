package desafiosMuitoLoucos.desafio5;

public class ContaPoupanca extends ContaBanco{
    TipoConta tipoConta;

    @Override
    public void depositar(int valor) {
        setSaldo(getSaldo() + valor);
        System.out.println("Você depositou " + valor + " R$");

    }

    @Override
    public void verSaldo() {
        System.out.println("Seu saldo da sua conta " + tipoConta + " é " + getSaldo());

    }



    public ContaPoupanca(int saldo) {
        super(saldo);
    }

    public ContaPoupanca() {
    }

    public ContaPoupanca(int saldo, TipoConta tipoConta){
        super(saldo);
        this.tipoConta = tipoConta;
    }

    @Override
    public void mostrarInformacoes(){
        System.out.println("Sua conta " + tipoConta + " tem " + getSaldo() + "R$" + " de saldo");

    }


}
