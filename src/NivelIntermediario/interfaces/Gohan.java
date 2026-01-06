package NivelIntermediario.interfaces;

import NivelIntermediario.heranca.Sayajin;

public class Gohan extends Sayajin implements SayajinHumano {

    @Override
    public void AtivarModoBestial() {
        System.out.println("Voce ativou o modo bestial");
    }


    @Override
    public void habilidadeEspecial(){

        System.out.println("Esse é o meu ataque mais forte!!! AAAAAAAAAAA MASENKO");

    }


}
