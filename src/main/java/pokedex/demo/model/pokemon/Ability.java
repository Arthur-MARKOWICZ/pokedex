package pokedex.demo.model.pokemon;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;
@Embeddable
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "of")
public class Ability {

    private DadosAbility dadosAbility1;
    private DadosAbility dadosAbility2;
    private DadosAbility dadosAbility3;
    private boolean hidden1;
    private boolean hidden2;
    private boolean hidden3;
    public Ability(List<AbilityWrapper> abilities) {
        this.dadosAbility1 = abilities.getFirst().ability();
        this.dadosAbility2 = abilities.get(1).ability();
        this.dadosAbility3 = abilities.getLast().ability();
        this.hidden1 = abilities.getFirst().hidden();
        this.hidden2 = abilities.get(1).hidden();
        this.hidden3 = abilities.getLast().hidden();
    }
}
