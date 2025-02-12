package pokedex.demo.model.moves;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public record MoveType(String name) {
}
