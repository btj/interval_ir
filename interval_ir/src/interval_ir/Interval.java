package interval_ir;

/**
 * Elke instantie van deze klasse stelt een interval van gehele getallen voor.
 * 
 * @invar De bovengrens is gelijk aan de ondergrens plus de breedte.
 *     | getBovengrens() == getOndergrens() + getBreedte()
 */
public class Interval {
	
	private int ondergrens;
	/**
	 * @invar De breedte is niet negatief. // Representatie-invariant
	 *     | 0 <= breedte
	 */
	private int breedte;
	
	public int getOndergrens() {
		return ondergrens;
	}
	
	public int getBreedte() {
		return breedte;
	}
	
	public int getBovengrens() {
		return ondergrens + breedte;
	}
	
	/**
	 * Stelt de ondergrens van dit Interval-object in.
	 * 
	 * @post De ondergrens van dit Interval-object is gelijk aan de gegeven ondergrens.
	 *     | getOndergrens() == ondergrens
	 * @post De breedte van dit Interval-object is gelijk aan de oude breedte.
	 *     | getBreedte() == old(getBreedte())
	 */
	public void setOndergrens(int ondergrens) {
		this.ondergrens = ondergrens;
	}
	
	/**
	 * Stelt de breedte van dit Interval-object in.
	 * 
	 * @throws IllegalArgumentException als de breedte kleiner is dan 0
	 *     | breedte < 0
	 * @post De ondergrens van dit Interval-object is gelijk aan de oude ondergrens.
	 *     | getOndergrens() == old(getOndergrens())
	 * @post De breedte van dit Interval-object is gelijk aan de gegeven breedte.
	 *     | getBreedte() == breedte
	 */
	public void setBreedte(int breedte) {
		if (breedte < 0)
			throw new IllegalArgumentException("breedte kleiner dan 0");
		this.breedte = breedte;
	}
	
	/**
	 * Stelt de bovengrens van dit Interval-object in.
	 * 
	 * @throws IllegalArgumentException als de gegeven bovengrens kleiner is dan de ondergrens van dit object
	 *     | bovengrens < getOndergrens()
	 * @post De ondergrens van dit Interval-object is gelijk aan de oude ondergrens.
	 *     | getOndergrens() == old(getOndergrens())
	 * @post De breedte van dit Interval-object is gelijk aan het verschil van de gegeven bovengrens en
	 *       de ondergrens van dit Interval-object.
	 *     | getBreedte() == bovengrens - getOndergrens()
	 */
	public void setBovengrens(int bovengrens) {
		if (bovengrens < ondergrens)
			throw new IllegalArgumentException("De bovengrens is kleiner dan de ondergrens");
		breedte = bovengrens - ondergrens;
	}

}
