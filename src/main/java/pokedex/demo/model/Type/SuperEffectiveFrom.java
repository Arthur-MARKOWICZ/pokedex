package pokedex.demo.model.Type;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public record SuperEffectiveFrom(String name) {
}
