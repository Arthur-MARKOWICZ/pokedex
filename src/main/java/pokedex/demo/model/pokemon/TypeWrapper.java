package pokedex.demo.model.pokemon;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)

public record TypeWrapper(Type type, int slot) {
}
