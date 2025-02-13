package pokedex.demo.model.pokemon;

import java.util.List;

public class Type {
    private DadosType type1;
    private DadosType type2;
    private int slot1;
    private int slot2;
    public Type(List<TypeWrapper> type){
        this.type1 = type.getFirst().type();
        this.type2 = type.getLast().type();
        this.slot1 = type.getFirst().slot();
        this.slot2 = type.getLast().slot();
    }
}
