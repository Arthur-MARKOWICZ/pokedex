package pokedex.demo.model.pokemon;

import org.springframework.data.jpa.repository.JpaRepository;
import pokedex.demo.Language;

public interface PokemonRepository extends JpaRepository<Pokemon, Long> {
}
