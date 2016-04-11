package coin_change_proble;

import java.util.Scanner;

public class Greedy_Algoritnm {

    int d[], result[];

    Greedy_Algoritnm(){

        //initializes the denomination array
        d = new int[4];
        d[0] = 25;
        d[1] = 10;
        d[2] = 5;
        d[3] = 1;
        result = new int[100];
    }

    int greedyMethod_coinchange(int n)
    {
        int num_coins=0, coin_turn=0;
        int index=0;

        //starts picking the highest value coin less then the number 'n'. it checks if the sum of amount remaining
        //is greater than the largest value coin in the denomination array. if so it picks the coin, store it in array
        //and increments thte number of coins selected else move to the next coin in the denomination array.it keeps
        // doing this step unless the sum of the coins selected is equal to the number passed to this function.

        while (n>0 && coin_turn<d.length)
        {
            if (d[coin_turn]<=n)
            {
                n -= d[coin_turn];
                num_coins++;
                result[index++] = d[coin_turn];
            }
            else coin_turn++;
        }
        return num_coins;
    }

    public static void main(String args[])
    {
        Greedy_Algoritnm ga = new Greedy_Algoritnm();

        //gets the user input and calls the greedyMethod_coinchange() method that finds out
        // the number of coins needed to make the change and also which coins are selected to
        // make the change.
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());
        int num_coins = ga.greedyMethod_coinchange(input);

        //display the number of coins needed to make the change
        System.out.println("Min number of Coins for "+input+": "+ num_coins);

        //display the coins are selected to make the change.
        for (int i=0; ga.result[i]!=0 ; i++)
        {
            System.out.print("   "+ga.result[i]);
        }
    }
}