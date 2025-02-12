package pokedex.demo.model.pokemon;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)

public record Moves (Move move){
}
