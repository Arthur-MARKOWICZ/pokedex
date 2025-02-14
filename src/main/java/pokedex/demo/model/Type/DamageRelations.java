package pokedex.demo.model.Type;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DamageRelations(@JsonAlias("double_damage_from")List<SuperEffectiveFrom> superEffectiveFrom,
                              @JsonAlias("double_damage_to") List<SuperEffectiveTo>  superEffectiveTo,
                              @JsonAlias("half_damage_from") List<HalfDamgeFrom> halfDamgeFrom,
                              @JsonAlias("half_damage_to") List<HalfDamgeTo> halfDamgeTo,
                              @JsonAlias("no_damage_from") List<NoDamageFrom> noDamageFrom,
                              @JsonAlias("no_damage_to") List<NoDamageTo>  noDamageTo) {

}
