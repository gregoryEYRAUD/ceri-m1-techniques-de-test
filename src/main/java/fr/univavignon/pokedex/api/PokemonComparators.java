package fr.univavignon.pokedex.api;

import java.util.Comparator;

/**
 * Enumeration of pokemon comparator.
 * @author fv
 */
public enum PokemonComparators implements Comparator<Pokemon> {

    /** Comparator using Pokemon name. **/
    NAME(Comparator.comparing(Pokemon::getName)),

	/** Comparator using Pokemon index. **/
    INDEX(Comparator.comparing(Pokemon::getIndex)),
	/** Comparator using Pokemon combat point. **/
	CP(Comparator.comparing(Pokemon::getCp));
	/** Delegate comparator instance. **/
	private final Comparator<Pokemon> delegate;
	/**
	 * Default constructor.
	 * @param d Delegate comparator instance.
	 */
	private PokemonComparators(final Comparator<Pokemon> d) {
		this.delegate = d;
	}

	/** {@inheritDoc} **/
	@Override
	public int compare(final Pokemon first, final Pokemon second) {
		return delegate.compare(first, second);
	}
}
