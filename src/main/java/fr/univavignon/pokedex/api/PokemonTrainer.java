package fr.univavignon.pokedex.api;

import org.mockito.Mock;

/**
 * Trainer POJO.
 * 
 * @author fv
 */
public class PokemonTrainer {

	/** Trainer name. **/
	private final String name;

	/** Trainer team. **/
	private final Team team;
	
	/** Trainer pokedex. **/
	private final IPokedex pokedex;
	
	/**
	 * Default constructor.
	 * 
	 * @param name Trainer name.
	 * @param team Trainer team.
	 * @param pokedex Trainer pokedex.
	 */
	public PokemonTrainer(final String name, final Team team, final IPokedex pokedex) {
		this.name = name;
		this.team = team;
		this.pokedex = pokedex;
	}
	
	/** Name getter.
	 * @return the Trainer's name
	 * **/
	public String getName() {
		return name;
	}

	/** Team getter.
	 * @return the Trainer's team
	 * **/
	public Team getTeam() {
		return team;
	}
	
	/** Pokedex getter.
	 * @return the Trainer's Pokedex
	 * **/
	public IPokedex getPokedex() {
		return pokedex;
	}
	
}
