package desafiosMuitoLoucos.desafio5;

import java.util.Scanner;

public class Main {
    public static void main() {

        ContaPoupanca contaPoupanca = new ContaPoupanca(130, TipoConta.POUPANCA);
        ContaCorrente contaCorrente = new ContaCorrente(140, TipoConta.CORRENTE);
        CasaDeCambio casaDeCambio = new CasaDeCambio();

        contaPoupanca.mostrarInformacoes();
        contaCorrente.mostrarInformacoes();

        casaDeCambio.transferir(contaCorrente, contaPoupanca, 30);
        contaPoupanca.mostrarInformacoes();
        contaCorrente.mostrarInformacoes();

        casaDeCambio.transferir(contaPoupanca, contaCorrente, 70);
        contaPoupanca.mostrarInformacoes();
        contaCorrente.mostrarInformacoes();

        contaCorrente.depositar(70);
        contaCorrente.verSaldo();







    }
}
