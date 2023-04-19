package fr.univavignon.pokedex.api;

/**
 * Pokemon POJO.
 * 
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
	 * 
	 * @param index Pokemon index.
	 * @param name Pokemon name.
	 * @param attack Attack level.
	 * @param defense Defense level.
	 * @param stamina Stamina level.
	 * @param cp Pokemon cp.
	 * @param hp Pokemon hp.
	 * @param dust Required dust for upgrading this pokemon.
	 * @param candy Required candy for upgrading this pokemon.
	 * @param iv IV perfection percentage.
	 */
	public Pokemon(
			final int index,
			final String name,
			final int attack,
			final int defense,
			final int stamina,
			final int cp,
			final int hp,
			final int dust,
			final int candy,
			final double iv) {
		super(index, name, attack, defense, stamina);
		this.cp = cp;
		this.hp = hp;
		this.dust = dust;
		this.candy = candy;
		this.iv = iv;
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
