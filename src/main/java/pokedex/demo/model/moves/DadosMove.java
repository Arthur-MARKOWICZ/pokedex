package pokedex.demo.model.moves;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosMove(int accuracy,MoveType type ,DamageType damage_class,
                        int power,int pp,int priority,MoveTarget target) {
}
