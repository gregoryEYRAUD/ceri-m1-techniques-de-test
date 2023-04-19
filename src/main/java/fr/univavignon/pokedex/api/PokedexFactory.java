package fr.univavignon.pokedex.api;

/**
 * PokedexFactory class implementing IPokedexFactory interface.
 *
 * @author EYRAUD Grégory
 */
public class PokedexFactory implements IPokedexFactory {
    /**
     * PokedexFactory's default constructor.
     */
    public PokedexFactory() {
    }
    /**
     * PokedexFactory's default constructor.
     * @param m Metadata provider the created pokedex will use.
     * @param p Pokemon factory the created pokedex will use.
     * @return a new Pokedex
     */
    @Override
    public IPokedex createPokedex(final IPokemonMetadataProvider m,
                                  final IPokemonFactory p) {
        return new Pokedex(m, p);
    }

}
