package coin_change_proble;

import static org.junit.Assert.*;

import org.junit.Test;

public class test_dynamic_algo {

	@Test
	public void test() {
		//checks that if the number of coins returned by the compute_change 
		//method of Coin_Change class is equal to number of coins calculated
		//manually
		Coin_Change cc = new Coin_Change();
		int result[] = cc.compute_change(4);
		assertEquals(4,result[4]);
	}

}
