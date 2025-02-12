package pokedex.demo.model.ability;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record AbilityPokemon(String name) {
}
