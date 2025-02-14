package pokedex.demo.model.Type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record HalfDamgeTo(String name) {
}
