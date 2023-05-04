package fr.univavignon.pokedex.api;

/**
 * Trainer POJO.
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
     * @param n Trainer name.
     * @param t Trainer team.
     * @param p Trainer pokedex.
     */
    public PokemonTrainer(final String n,
                          final Team t,
                          final IPokedex p) {
        this.name = n;
        this.team = t;
        this.pokedex = p;
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
