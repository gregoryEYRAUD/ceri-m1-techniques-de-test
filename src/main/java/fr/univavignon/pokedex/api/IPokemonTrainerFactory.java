package fr.univavignon.pokedex.api;

/**
 * Factory interface for class that aims to create PokemonTrainer instance.
 * @author fv
 */
public interface IPokemonTrainerFactory {

    /**
     * Creates and returns a PokemonTrainer instance.
     * @param n Name of the created trainer.
     * @param t Team of the created trainer.
     * @param p Factory used to create pokedex.
     * @return Created trainer instance.
     */
	PokemonTrainer createTrainer(String n,
								 Team t,
								 IPokedexFactory p);
}
