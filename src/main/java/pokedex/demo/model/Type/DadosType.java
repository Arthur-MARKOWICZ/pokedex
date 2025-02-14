package pokedex.demo.model.Type;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public record DadosType(@JsonAlias("damage_relations") DamageRelations damageRelations,@JsonAlias("moves") List<Move> move,List<Pokemons> pokemon) {
}
