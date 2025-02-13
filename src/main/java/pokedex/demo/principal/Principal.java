package pokedex.demo.principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import pokedex.demo.model.ability.DadosAbility;
import pokedex.demo.model.moves.DadosMove;
import pokedex.demo.model.pokemon.DadosPokemon;

import pokedex.demo.model.pokemon.Pokemon;
import pokedex.demo.model.pokemon.PokemonRepository;
import pokedex.demo.service.ConsumoApi;
import pokedex.demo.service.ConverteDados;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

@Component
public class Principal {
    private ConsumoApi consumoApi = new ConsumoApi();
    private Scanner leitura = new Scanner(System.in);
    private String endereco ="https://pokeapi.co/api/v2/";
    private ConverteDados conversor = new ConverteDados();
    private PokemonRepository repository;
    @Autowired
    public void Principal(PokemonRepository repository, ConsumoApi consumoApi, ConverteDados conversor) {
        this.repository = repository;
        this.consumoApi = consumoApi;
        this.conversor = conversor;
    }
    public void exibeMenu() {
        System.out.println("Sistema iniciado!");

        var opcao =-1;
        while (opcao != 0){
            var menu = """
                    1- buscar pokemon
                    2- buscar move
                    3- buscar ability
                    0- sair
              
                    """;
            System.out.println(menu);
            opcao = leitura.nextInt();
            leitura.nextLine();
            switch (opcao){
                case 0:
                    break;
                case 1:
                    buscarPokemon();
                    break;
                case 2:
                    buscarMove();
                    break;
                case 3:
                    buscarAbility();
                    break;
            }
        }
    }

    @Transactional
    private void buscarPokemon() {
        System.out.println("digite o nome do pokemon");
        var nomePokemon = leitura.nextLine().toLowerCase();
        var json = consumoApi.obterDados(endereco +"/pokemon/" + nomePokemon);
        DadosPokemon dadosPokemon = conversor.obterDados(json, DadosPokemon.class);
        repository.save(new Pokemon(dadosPokemon));
        System.out.println(dadosPokemon);

    }
    private void buscarMove()  {
        System.out.println("digite o nome do Move");
        var nomeMove = leitura.nextLine();
        nomeMove = URLEncoder.encode(nomeMove, StandardCharsets.UTF_8).replace("+","-").toLowerCase();
        System.out.println(nomeMove);
        var json = consumoApi.obterDados(endereco +"/move/" + nomeMove);
        DadosMove dadosMove = conversor.obterDados(json, DadosMove.class);
        System.out.println(dadosMove);
    }

    private void buscarAbility() {
        System.out.println("digite o nome da ability");
        var nomeAbility = leitura.nextLine();
        nomeAbility = URLEncoder.encode(nomeAbility, StandardCharsets.UTF_8).replace("+","-").toLowerCase();
        var json = consumoApi.obterDados(endereco + "/ability/" + nomeAbility);
        DadosAbility dadosAbility = conversor.obterDados(json , DadosAbility.class);
        System.out.println(dadosAbility);
    }

}
