package coin_change_proble;

import java.util.Scanner;

public class Coin_Change {
	 int C[], d[];

	    Coin_Change(){
	        C = new int[10000];
	        d = new int[4];
	        d[0] = 25;
	        d[1] = 10;
	        d[2] = 5;
	        d[3] = 1;
	    }

	    int[] compute_change(int n) {
	        //since the number of coins needed to make the change for 0 sum is 0. therefore, C[0] is set to zero
	        C[0] = 0;
	        int temp = 0;
	        for (int j = 1; j <= n; j++) {
	            C[j] = 1000000;                                     //initializes the value to infinity

	            //for each coin in denomination array it checks if picking this coin we are left with value for
	            //which number of coins is already calulated and picking this coin lead to number of coins less
	            //then the number of coins already calculated for this 'n'.
	            //          i.e.:  1 +C[j−di] < C[j]
	            //if yes thenn it picks this coin.
	            for (int i = 0; i < d.length; i++) {
	                temp = j - d[i];
	                if (j >= d[i] && C[temp] < C[j])
	                    C[j] = 1 + C[temp];
	            }
	        }
	        return C;
	    }

	    public static void main(String args[])
	    {
	        Coin_Change cc = new Coin_Change();

	        System.out.println("Enter number");
	        Scanner scanner = new Scanner(System.in);
	        int input = Integer.parseInt(scanner.nextLine());
	        int result[] = cc.compute_change(input);

	        System.out.println("Min number of Coins for "+input+": "+ result[input]);
	    }

	}

