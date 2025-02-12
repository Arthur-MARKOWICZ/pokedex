package pokedex.demo.model.ability;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record AbilityPokemonWrapper(AbilityPokemon pokemon, @JsonAlias("is_hidden") String hidden,int slot) {
}
