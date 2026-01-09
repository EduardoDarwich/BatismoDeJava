package NivelIntermediario.classeAbstrataPoliformismo;

public class LadoNegro extends Jedi{
    String motivoCorrupcao;

    @Override
    public void usarSabreDeLuz(){
        System.out.println("éssa é uma arma de assassinos de verdade");
    }

    @Override
    public String usarForca(){

        return "Morra esmagado pela minha força";

    }

}
