package desafiosMuitoLoucos.desafio5;

public class CasaDeCambio {
    public void transferir (ContaCorrente destinatario, ContaPoupanca remetente, int valor){
        destinatario.setSaldo(destinatario.getSaldo() + valor);
        remetente.setSaldo(remetente.getSaldo() - valor);
        System.out.println("sua conta " + destinatario.tipoConta + " recebeu " + valor + " R$");
    }

    public void transferir(ContaPoupanca destinatario, ContaCorrente remetente, int valor){
        destinatario.setSaldo(destinatario.getSaldo() + valor);
        remetente.setSaldo(remetente.getSaldo() - valor);

        System.out.println("sua conta " + destinatario.tipoConta + " recebeu " + valor + " R$");

    }
}
