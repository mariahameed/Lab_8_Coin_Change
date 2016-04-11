package coin_change_proble;

import static org.junit.Assert.*;

import org.junit.Test;

public class test_exception {

	@Test
	public void test() {
		//this test case tests tests if the exception handling is done correctly
		//if an exception is thrown, it fails. else pass
	  try {
		  Coin_Change s = new Coin_Change();
		  Greedy_Algoritnm ga = new Greedy_Algoritnm();
		} catch (Exception ex) {
			fail( "My method didn't throw when I expected it to" );
		}
	}
}
