package NivelIntermediario.superConstrutor;

public class ClasseFilha extends ClasseMae{

    String teste2;

    //Exemplo de construtor de superclasse em uma subclasse
    public ClasseFilha(String teste, String teste2) {
        super(teste);
        this.teste2 = teste2;
    }
}
