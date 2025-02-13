package pokedex.demo.model.moves;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosMove(@JsonAlias("name") String nome, int accuracy, MoveType type , @JsonAlias("damage_class") DamageType damageType,
                        int power, int pp, int priority, MoveTarget target) {
}
