package pokedex.demo.model.moves;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Embeddable;


@JsonIgnoreProperties(ignoreUnknown = true)
@Embeddable
public record DamageType(@JsonAlias("name") String Danotipo) {
}
