package NivelIntermediario.heranca;

public class Namekuseijin extends Guerreiro {

    public void regenerar(){
        System.out.println(nome + " se regenerou");
    }

    @Override
    public void habilidadeEspecial(){
        System.out.println("EU IREI CRIAR AS ESFERAS DO DRAGÃO AGORA");
    }

}
