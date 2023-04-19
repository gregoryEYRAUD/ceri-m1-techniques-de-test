package fr.univavignon.pokedex.api;

/**
 * PokemonFactory class implementing IPokemonFactory.
 * @author EYRAUD Grégory
 */
public class PokemonFactory implements IPokemonFactory {
    /**
     * The pokedex.
     */
    private Pokedex pokedex;

    /**
     * PokemonFactory's default constructor.
     */
    public PokemonFactory() {
    }

    /**
     * PokemonFactory's default constructor.
     * @param index Pokemon index.
     * @param cp Pokemon CP.
     * @param hp Pokemon HP.
     * @param dust Required dust.
     * @param candy Required candy.
     * @return a new Pokemon
     * @throws PokedexException If index is not valid.
     */
    @Override
    public Pokemon createPokemon(final int index,
                                 final int cp,
                                 final int hp,
                                 final int dust,
                                 final int candy) throws PokedexException {
        PokemonMetadata metadata;
        metadata = pokedex.getPokemonMetadata(index);
        return new Pokemon(index,
                metadata.getName(),
                metadata.getAttack(),
                metadata.getDefense(),
                metadata.getStamina(),
                cp,
                hp,
                dust,
                candy,
                56);
    }

    /**
     * setter for the pokedex.
     * @param p the updated pokedex
     */
    public void setPokedex(final Pokedex p) {
        this.pokedex = p;
    }
}
