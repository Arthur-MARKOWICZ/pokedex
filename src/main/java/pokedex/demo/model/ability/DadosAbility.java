package pokedex.demo.model.ability;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosAbility(@JsonAlias("effect_entries") List<EffectAbility> efeitos ,List<AbilityPokemonWrapper> pokemon) {


}
