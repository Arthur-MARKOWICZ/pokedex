package pokedex.demo.model.moves;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import pokedex.demo.model.pokemon.Pokemon;

import java.util.List;
import java.util.Set;

@Entity(name = "Moves")
@Table(name = "moves")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "of")

public class Moves {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idMove;
    private String nome;
    @ManyToMany
    @JoinTable(
            name = "move_pokemon",
            joinColumns = @JoinColumn(name = "idMove"),
            inverseJoinColumns = @JoinColumn(name = "dexnumber")
    )
    private Set<Pokemon> Pokemon;
    private int accuracy;
    @Embedded
    private MoveType type;
    @Embedded
    private DamageType damageType;
    private int power;
    private int pp;
    private int priority;
    @Embedded
    private MoveTarget moveTarget;

    public Moves(DadosMove dadosMove){
        this.nome = dadosMove.nome();
        this.accuracy = dadosMove.accuracy();
        this.type = dadosMove.type();
        this.damageType = dadosMove.damageType();
        this.power = dadosMove.power();
        this.pp = dadosMove.pp();
        this.priority = dadosMove.priority();
        this.moveTarget = dadosMove.target();
    }

}
