package NivelIntermediario.generics;

import java.util.ArrayList;
import java.util.List;

public class Mochila {

    private List<Equipamento> equipamentos = new ArrayList<>();

    public List<Equipamento> getEquipamentos() {
        return equipamentos;
    }

    public void setEquipamentos() {
        this.equipamentos = equipamentos;
    }

    public Mochila(List<Equipamento> equipamentos) {
        this.equipamentos = equipamentos;
    }

    public void adicionarFerramenta(Equipamento equipamento){

        equipamentos.add(equipamento);

    }

    @Override
    public String toString() {
        return "Essa é a bolsa " + equipamentos;
    }
}
