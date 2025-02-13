package pokedex.demo.model.ability;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Embeddable;
import pokedex.demo.Language;

@JsonIgnoreProperties(ignoreUnknown = true)
@Embeddable
public record EffectAbility(String effect, @JsonProperty("language") Language language) {

}
