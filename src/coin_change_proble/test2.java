package coin_change_proble;

import static org.junit.Assert.*;

import org.junit.Test;

public class test2 {

	//checks that if the number of coins returned by the greedyMethod_coinchange 
	//method of Greedy_Algoritnm class is equal to number of coins calculated
	//manually

	@Test
	public void test() {
		int d1[] = {25,10,5,1};
		int n_ = 34, n=n_;
		
		 
		int num_coins=0, coin_turn=0;
		while (n>0 && coin_turn<d1.length)
        {
            if (d1[coin_turn]<=n)
            {
                n -= d1[coin_turn];
                //System.out.println("num "+d1[coin_turn]);
                num_coins++;
            }
            else coin_turn++;
        }
		
		Greedy_Algoritnm ga = new Greedy_Algoritnm();
		
		//System.out.println(ga.greedyMethod_coinchange(34));
		
		assertEquals(num_coins,ga.greedyMethod_coinchange(n_));
		
		
		
	}

}
