package pokedex.demo.model.Type;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.util.List;

public record Pokemons(@JsonAlias("pokemon") Pokemon pokemon, int slot) {
}
