package pokedex.demo.model.pokemon;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)

public record AbilityWrapper(Ability ability, boolean is_hidden) {



}
