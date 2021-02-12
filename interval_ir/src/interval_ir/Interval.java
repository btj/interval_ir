package interval_ir;

public class Interval {
	
	private int ondergrens;
	private int breedte;
	
	int getOndergrens() {
		return ondergrens;
	}
	
	int getBreedte() {
		return breedte;
	}
	
	int getBovengrens() {
		return ondergrens + breedte;
	}
	
	void setOndergrens(int ondergrens) {
		this.ondergrens = ondergrens;
	}
	
	void setBreedte(int breedte) {
		this.breedte = breedte;
	}
	
	void setBovengrens(int bovengrens) {
		breedte = bovengrens - ondergrens;
	}

}
