package NivelIntermediario;

import NivelIntermediario.heranca.Humano;
import NivelIntermediario.interfaces.Gohan;
import NivelIntermediario.heranca.Namekuseijin;
import NivelIntermediario.heranca.Sayajin;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        Sayajin goku = new Sayajin();
        goku.nome = "goku";
        goku.idade = 35;
        goku.vivo = true;
        goku.formaAtual = "base";
        goku.possuiRabo = false;


        Humano kuririn = new Humano();
        kuririn.nome = "kuririn";
        kuririn.formaAtual = "base";
        kuririn.vivo = true;
        kuririn.idade = 38;

        Namekuseijin piccolo = new Namekuseijin();
        piccolo.nome = "piccolo";
        piccolo.formaAtual = "base";
        piccolo.vivo = true;
        piccolo.idade = 20;


        goku.ativarZenkai();
        kuririn.fazerCoisasDeHumano();
        piccolo.regenerar();

        LinkedList<Sayajin> sayajins = new LinkedList<>();

        sayajins.add(goku);

        System.out.println(sayajins);

        Gohan gohan = new Gohan();
        gohan.ativarZenkai();
        gohan.AtivarModoBestial();

        piccolo.habilidadeEspecial();
        gohan.habilidadeEspecial();






    }
}
