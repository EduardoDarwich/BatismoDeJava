package NivelIntermediario.records;

public class Main {
    public static void main(String[] args) {

        Ninja ninja = new Ninja(45, "Jiraya", 178);

        NinjaRecord ninjaRecord = new NinjaRecord("Konohamatu", 21, 170);

        System.out.println(ninjaRecord.emailCaixaAlta());



    }
}
