package pokedex.demo.model.pokemon;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Embeddable;

@JsonIgnoreProperties(ignoreUnknown = true)

@Embeddable
public record DadosAbility(@JsonAlias("name") String nomeAbilidade) {}
