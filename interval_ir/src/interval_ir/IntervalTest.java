package interval_ir;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class IntervalTest {
	
	@Test
	void test() {
		Interval interval = new Interval();
		interval.setOndergrens(4);
		interval.setBovengrens(7);
		int breedte = interval.getBreedte();
		assertEquals(3, breedte);
	}

}
