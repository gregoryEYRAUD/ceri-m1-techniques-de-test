package fr.univavignon.pokedex.api;

/**
 * PokemonMetadataProvider class implementing IPokemonMetadataProvider interface.
 */
public class PokemonMetadataProvider implements IPokemonMetadataProvider {
    /**
     * A pokedex.
     */
    private Pokedex pokedex;

    /**
     * PokemonMetadataProvider's default constructor.
     */
    public PokemonMetadataProvider() {
    }
    /**
     * PokemonMetadataProvider's default constructor.
     * @param index Index of the pokemon.
     * @return Pokemon's PokemonMetadata.
     * @throws PokedexException If the given <strong>index</strong> is not valid.
     */
    @Override
    public PokemonMetadata getPokemonMetadata(int index) throws PokedexException {
        Pokemon pokemon = pokedex.getPokemon(index);
        return new PokemonMetadata(index,
                pokemon.getName(),
                pokemon.getAttack(),
                pokemon.getDefense(),
                pokemon.getStamina());
    }
    /**
     * setter for the pokedex.
     * @param p the updated pokedex
     */
    public void setPokedex(Pokedex p) {
        this.pokedex = p;
    }
}
