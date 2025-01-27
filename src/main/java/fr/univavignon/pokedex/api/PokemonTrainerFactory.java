package fr.univavignon.pokedex.api;

/**
 * PokemonTrainerFactory class implementing IPokemonTrainerFactory interface.
 */
public class PokemonTrainerFactory implements IPokemonTrainerFactory {
    /**
     * PokemonTrainerFactory's default constructor.
     */
    public PokemonTrainerFactory() {
    }

    /**
     * PokemonTrainerFactory's default constructor.
     * @param name trainer's name.
     * @param team trainer's team.
     * @param pokedexFactory Factory used to create pokedex instance.
     * @return a new PokemonTrainer
     */
    @Override
    public PokemonTrainer createTrainer(final String name,
                                        final Team team,
                                        final IPokedexFactory pokedexFactory) {
        return new PokemonTrainer(name,
                team,
                pokedexFactory.createPokedex(new PokemonMetadataProvider(),
                        new PokemonFactory()));
    }
}
