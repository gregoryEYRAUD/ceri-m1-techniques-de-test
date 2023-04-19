package fr.univavignon.pokedex.api;

import fr.univavignon.pokedex.api.IPokedex;
import fr.univavignon.pokedex.api.PokedexException;
import fr.univavignon.pokedex.api.Pokemon;
import fr.univavignon.pokedex.api.PokemonMetadata;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Pokedex implements IPokedex {

    private ArrayList<Pokemon> pokemons;
    private PokemonMetadataProvider metadataProvider;
    private PokemonFactory pokemonFactory;

    public Pokedex(IPokemonMetadataProvider metadataProvider, IPokemonFactory pokemonFactory) {
        pokemons = new ArrayList<>();
        this.metadataProvider = (PokemonMetadataProvider) metadataProvider;
        this.pokemonFactory = (PokemonFactory) pokemonFactory;

        this.pokemonFactory.setPokedex(this);
        this.metadataProvider.setPokedex(this);
    }

    @Override
    public int size() {
        return pokemons.size();
    }

    @Override
    public int addPokemon(Pokemon pokemon) {
        //pokemons.set(pokemon.getIndex(), pokemon);
        //pokemons.set(pokemon.getIndex(), pokemon);
        pokemons.add(pokemon);
        metadataProvider.setPokedex(this);
        pokemonFactory.setPokedex(this);
        return pokemon.getIndex();
    }

    @Override
    public Pokemon getPokemon(int id) throws PokedexException {
        for (Pokemon pokemon : pokemons){
            if(pokemon.getIndex() == id)
                return pokemon;
        }
        throw new PokedexException("Id invalide");
        //return null;
    }

    @Override
    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    @Override
    public List<Pokemon> getPokemons(Comparator<Pokemon> order) {
        ArrayList<Pokemon> list = pokemons;
        list.sort(order);
        return list;
    }

    @Override
    public Pokemon createPokemon(int index, int cp, int hp, int dust, int candy) throws PokedexException {
        return pokemonFactory.createPokemon(index, cp, hp, dust, candy);
    }

    @Override
    public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
        return metadataProvider.getPokemonMetadata(index);
    }
}
