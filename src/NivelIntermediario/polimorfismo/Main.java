package NivelIntermediario.polimorfismo;

import NivelIntermediario.heranca.Namekuseijin;

public class Main {
    public static void main(String[] args) {
        Namekuseijin piccolo = new Namekuseijin();
        piccolo.nome = "piccolo";
        piccolo.formaAtual = "base";
        piccolo.vivo = true;
        piccolo.idade = 20;

        //Exemplo de interface
        Gohan gohan = new Gohan();
        gohan.ativarZenkai();
        gohan.AtivarModoBestial();

        //Exemplo de polimorfismo
        piccolo.habilidadeEspecial();
        gohan.habilidadeEspecial();
    }
}
