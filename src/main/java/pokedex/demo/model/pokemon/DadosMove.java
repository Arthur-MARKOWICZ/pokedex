package pokedex.demo.model.pokemon;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Embeddable;

@Embeddable
@JsonIgnoreProperties(ignoreUnknown = true)

public record DadosMove(@JsonAlias("name") String nomeMove) {
}
