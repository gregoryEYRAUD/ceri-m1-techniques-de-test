package fr.univavignon.pokedex.api;

/**
 * Pokemon POJO.
 * @author fv
 */
public final class Pokemon extends PokemonMetadata {

    /** Combat Point of the pokemon. **/
    private final int cp;

    /** HP of the pokemon. **/
    private final int hp;

    /** Required dust for upgrading this pokemon. **/
    private final int dust;

    /** Required candy for upgrading this pokemon. **/
    private final int candy;

    /** IV perfection percentage. **/
    private final double iv;
    /**
     * Default constructor.
     * @param index Pokemon index.
     * @param name Pokemon name.
     * @param attack Attack level.
     * @param defense Defense level.
     * @param stamina Stamina level.
     * @param cp1 Pokemon cp.
     * @param hp1 Pokemon hp.
     * @param dust1 Required dust for upgrading this pokemon.
     * @param candy1 Required candy for upgrading this pokemon.
     * @param iv1 IV perfection percentage.
     */
    public Pokemon(
            final int index,
			final String name,
            final int attack,
            final int defense,
            final int stamina,
            final int cp1,
            final int hp1,
            final int dust1,
            final int candy1,
            final double iv1) {
        super(index, name, attack, defense, stamina);
        this.cp = cp1;
        this.hp = hp1;
        this.dust = dust1;
        this.candy = candy1;
        this.iv = iv1;
	}

	/** Combat Point getter getter.
	 * @return Pokemon's CP
	 * **/
	public int getCp() {
		return cp;
	}
	/** HP getter.
	 * @return Pokemon's HP
	 * **/
	public int getHp() {
		return hp;
	}
	/** Dust getter.
	 * @return Pokemon's Dust needed
	 * **/
	public int getDust() {
		return dust;
	}
	/** Candy getter.
	 * @return Pokemon's candy needed
	 * **/
	public int getCandy() {
		return candy;
	}
	/** IV getter.
	 * @return Pokemon's IV
	 * **/
	public double getIv() {
		return iv;
	}
}
