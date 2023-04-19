package fr.univavignon.pokedex.api;

import fr.univavignon.pokedex.api.IPokedex;
import fr.univavignon.pokedex.api.PokedexException;
import fr.univavignon.pokedex.api.Pokemon;
import fr.univavignon.pokedex.api.PokemonMetadata;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 *
 * Pokedex class implementing IPokedex interface.
 *
 * @author EYRAUD Grégory
 *
 */
public class Pokedex implements IPokedex {

    private ArrayList<Pokemon> pokemons;
    private PokemonMetadataProvider metadataProvider;
    private PokemonFactory pokemonFactory;

    /**
     * Pokedex constructor
     * @param metadataProvider A PokemonMetadataProvider to use in getPokemonMetadata
     * @param pokemonFactory A PokemonFactory to use in createPokemon()
     */
    public Pokedex(IPokemonMetadataProvider metadataProvider, IPokemonFactory pokemonFactory) {
        pokemons = new ArrayList<>();
        this.metadataProvider = (PokemonMetadataProvider) metadataProvider;
        this.pokemonFactory = (PokemonFactory) pokemonFactory;

        this.pokemonFactory.setPokedex(this);
        this.metadataProvider.setPokedex(this);
    }

    /**
     * Returns the number of pokemon this pokedex contains.
     *
     * @return Number of pokemon in this pokedex.
     */
    @Override
    public int size() {
        return pokemons.size();
    }

    /**
     * Adds the given <strong>pokemon</strong> to this pokedex and returns
     * it unique index.
     *
     * @param pokemon Pokemon to add to this pokedex.
     * @return Index of this pokemon relative to this pokedex.
     */
    @Override
    public int addPokemon(Pokemon pokemon) {
        pokemons.add(pokemon);
        metadataProvider.setPokedex(this);
        pokemonFactory.setPokedex(this);
        return pokemon.getIndex();
    }

    /**
     * Locates the pokemon identified by the given <strong>id</strong>.
     *
     * @param id Unique pokedex relative identifier.
     * @return Pokemon denoted by the given identifier.
     * @throws PokedexException If the given <strong>index</strong> is not valid.
     */
    @Override
    public Pokemon getPokemon(int id) throws PokedexException {
        for (Pokemon pokemon : pokemons){
            if(pokemon.getIndex() == id)
                return pokemon;
        }
        throw new PokedexException("Id invalide");
        //return null;
    }

    /**
     * Returns an unmodifiable list of all pokemons this pokedex contains.
     *
     * @return Unmodifiable list of all pokemons.
     */
    @Override
    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    /**
     * Returns an unmodifiable list of all pokemons this pokedex contains.
     * The list view will be sorted using the given <strong>order</strong>.
     *
     * @param order Comparator instance used for sorting the created view.
     * @return Sorted unmodifiable list of all pokemons.
     */
    @Override
    public List<Pokemon> getPokemons(Comparator<Pokemon> order) {
        ArrayList<Pokemon> list = pokemons;
        list.sort(order);
        return list;
    }

    /**
     * Return a new Pokemon by using createPokemon() with pokemonFactory
     *
     * @param index Pokemon index.
     * @param cp Pokemon CP.
     * @param hp Pokemon HP.
     * @param dust Required dust for upgrading pokemon.
     * @param candy Required candy for upgrading pokemon.
     * @return a new Pokemon
     * @throws PokedexException If the given <strong>index</strong> is not valid.
     */
    @Override
    public Pokemon createPokemon(int index, int cp, int hp, int dust, int candy) throws PokedexException {
        return pokemonFactory.createPokemon(index, cp, hp, dust, candy);
    }

    /**
     *
     * @param index Index of the pokemon to retrieve metadata for.
     * @return the PokemonMetadata for a Pokemon for the given <strong>id</strong>
     * @throws PokedexException If the given <strong>index</strong> is not valid.
     */
    @Override
    public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
        return metadataProvider.getPokemonMetadata(index);
    }
}
