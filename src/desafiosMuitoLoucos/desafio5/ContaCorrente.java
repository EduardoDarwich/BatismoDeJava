package desafiosMuitoLoucos.desafio5;

public class ContaCorrente extends ContaBanco{
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

    public ContaCorrente() {
    }

    public ContaCorrente(int saldo) {
        super(saldo);
    }

    public ContaCorrente(int saldo, TipoConta tipoConta) {
        super(saldo);
        this.tipoConta = tipoConta;
    }

    @Override
    public void mostrarInformacoes(){
        System.out.println("Sua conta " + tipoConta + " tem " + getSaldo() + "R$" + " de saldo");

    }

    @Override
    public String toString() {
        return "Sua conta " + tipoConta + " tem " + getSaldo() + " de saldo";
    }
}
