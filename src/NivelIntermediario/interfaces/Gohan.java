package NivelIntermediario.interfaces;

import NivelIntermediario.heranca.Sayajin;

public class Gohan extends Sayajin implements SayajinHumano {

    //Exemplo de polimorfismo
    @Override
    public void AtivarModoBestial() {
        System.out.println("Voce ativou o modo bestial");
    }

    //Exemplo de polimorfismo
    @Override
    public void habilidadeEspecial(){

        System.out.println("Esse é o meu ataque mais forte!!! AAAAAAAAAAA MASENKO");

    }


}
