package pokedex.demo.principal;

import pokedex.demo.model.Type.DadosType;
import pokedex.demo.model.ability.DadosAbility;
import pokedex.demo.model.moves.DadosMove;
import pokedex.demo.model.pokemon.DadosPokemon;

import pokedex.demo.service.ConsumoApi;
import pokedex.demo.service.ConverteDados;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class principal {
    private ConsumoApi consumoApi = new ConsumoApi();
    private Scanner leitura = new Scanner(System.in);
    private String endereco ="https://pokeapi.co/api/v2/";
    private ConverteDados conversor = new ConverteDados();


    public void exibeMenu() throws UnsupportedEncodingException {
        var opcao =-1;
        while (opcao != 0){
            var menu = """
                    1- buscar pokemon
                    2- buscar move
                    3- buscar ability
                    4- buscar tipo
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
                case 4:
                    buscarTipo();
                    break;
            }
        }
    }




    private void buscarPokemon() {
        System.out.println("digite o nome do pokemon");
        var nomePokemon = leitura.nextLine().toLowerCase();
        var json = consumoApi.obterDados(endereco +"/pokemon/" + nomePokemon);
        DadosPokemon dadosPokemon = conversor.obterDados(json, DadosPokemon.class);
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
    private void buscarTipo() {
        System.out.println("digite o nome do tipo? (em ingles)");
        var nomeTipo = leitura.nextLine();
        nomeTipo = URLEncoder.encode(nomeTipo, StandardCharsets.UTF_8).replace("+","-").toLowerCase();
        var json = consumoApi.obterDados(endereco +"/type/" + nomeTipo);
        DadosType dadosType = conversor.obterDados(json,DadosType.class);
        System.out.println(json);
        System.out.println(dadosType);
    }
}
