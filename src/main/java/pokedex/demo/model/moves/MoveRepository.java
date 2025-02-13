package pokedex.demo.model.moves;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MoveRepository extends JpaRepository<Moves,Long> {
}
