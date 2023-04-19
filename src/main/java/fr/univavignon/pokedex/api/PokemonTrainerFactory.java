package fr.univavignon.pokedex.api;

/**
 * PokemonTrainerFactory class implementing IPokemonTrainerFactory interface
 */
public class PokemonTrainerFactory implements IPokemonTrainerFactory{
    /**
     * PokemonTrainerFactory's default constructor
     */
    public PokemonTrainerFactory() {
    }

    /**
     * PokemonTrainerFactory's default constructor
     * @param name Name of the created trainer.
     * @param team Team of the created trainer.
     * @param pokedexFactory Factory to use for creating associated pokedex instance.
     * @return a new PokemonTrainer
     */
    @Override
    public PokemonTrainer createTrainer(String name, Team team, IPokedexFactory pokedexFactory) {
        return new PokemonTrainer(name, team, pokedexFactory.createPokedex(new PokemonMetadataProvider(), new PokemonFactory()));
    }
}
