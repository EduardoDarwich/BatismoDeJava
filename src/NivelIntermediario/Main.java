package NivelIntermediario;

import NivelIntermediario.construtores.Hokages;
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

        //Exemplo de herança
        goku.ativarZenkai();
        kuririn.fazerCoisasDeHumano();
        piccolo.regenerar();


        //Exemplo de interface
        Gohan gohan = new Gohan();
        gohan.ativarZenkai();
        gohan.AtivarModoBestial();

        //Exemplo de polimorfismo
        piccolo.habilidadeEspecial();
        gohan.habilidadeEspecial();

        Hokages hokages = new Hokages();
        Hokages hokages2 = new Hokages("Mikael");
        System.out.println(hokages2.nome);






    }
}
