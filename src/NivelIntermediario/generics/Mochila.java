package NivelIntermediario.generics;

import java.util.ArrayList;
import java.util.List;

public class Mochila <T>{

    private List<T> equipamentos = new ArrayList<>();

    public List<T> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos() {
        this.equipamentos = equipamentos;
    }

    public Mochila(List<T> equipamentos) {
        this.equipamentos = equipamentos;
    }

    public Mochila() {
    }

    //Adicionar ferramentas
    public void adicionarFerramenta(T equipamento){

        equipamentos.add(equipamento);

    }

    @Override
    public String toString() {
        return "Essa é a bolsa " + equipamentos;
    }
}
