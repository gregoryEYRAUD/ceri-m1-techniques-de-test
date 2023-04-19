package fr.univavignon.pokedex.api;

/**
 * PokemonFactory class implementing IPokemonFactory
 *
 * @author EYRAUD Grégory
 */
public class PokemonFactory implements IPokemonFactory{

    private Pokedex pokedex;

    /**
     * PokemonFactory's default constructor
     */
    public PokemonFactory() {
    }

    /**
     * PokemonFactory's default constructor
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
        PokemonMetadata metadata;
        metadata = pokedex.getPokemonMetadata(index);
        return new Pokemon(index, metadata.getName(), metadata.getAttack(), metadata.getDefense(), metadata.getStamina(), cp, hp, dust, candy, 56);
    }

    /**
     * getter for the pokedex
     * @param pokedex the updated pokedex
     */
    public void setPokedex(Pokedex pokedex) {
        this.pokedex = pokedex;
    }
}
