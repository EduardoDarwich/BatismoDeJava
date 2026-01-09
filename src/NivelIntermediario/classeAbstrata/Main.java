package NivelIntermediario.classeAbstrata;

public class Main {
    public static void main(String[] args) {
        Sayajin sayajin = new Sayajin();
        Freeza freeza = new Freeza();

        freeza.carregarKi();
        sayajin.esconderKi();
        freeza.esconderKi();
        sayajin.carregarKi();


    }
}
