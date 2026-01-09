package NivelIntermediario.classeAbstrataPoliformismo;

public class Main {
    public static void main(String[] args) {
        LadoBranco ladoBranco = new LadoBranco();
        ladoBranco.Nome = "Luke";
        ladoBranco.ladoDaForca="Branco";
        ladoBranco.mestre="yoda";
        ladoBranco.nivelForca = 100;


        LadoNegro ladoNegro = new LadoNegro();
        ladoNegro.motivoCorrupcao = "A vida tava paia kkk";

        System.out.println(ladoNegro.usarForca());
        ladoNegro.usarSabreDeLuz();

        ladoBranco.usarSabreDeLuz();
        System.out.println(ladoBranco.usarForca());
    }
}
