package NivelIntermediario.classeAbstrataPoliformismo;

public class LadoBranco extends Jedi {
    String mestre;

    @Override
    public void usarSabreDeLuz(){

        System.out.println("Não empunhe seu sabre se não for pra matar");

    }

    @Override
    public String usarForca(){


        return "So irei utilizar meus poderes  se for nescesssario";

    }
}
