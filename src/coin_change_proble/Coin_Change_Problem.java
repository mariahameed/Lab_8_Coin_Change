package coin_change_proble;

import java.util.Scanner;

public class Coin_Change_Problem {

    int C[][], d[] ;

    Coin_Change_Problem(){
        C = new int[10000][100];
        d = new int[4];
        d[0] = 25;
        d[1] = 10;
        d[2] = 5;
        d[3] = 1;
    }

    public static void main(String args[])
    {
        Coin_Change_Problem cc = new Coin_Change_Problem();

        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        int input = Integer.parseInt(scanner.nextLine());

        int result[][] = cc.compute_change(input);

        System.out.println("Max number of Coins for "+input+": "+ result[input][0]);
        System.out.println("Coins selected are: ");
        for (int j = 1; j <= result[input][0]; j++) {
            if(result[input][j] == 0)
                break;
            System.out.print(result[input][j] + "  ");
        }
    }



    int[][] compute_change(int n) {
        C[0][0] = 0;
        int temp = 0, index=0;
        for (int j = 1; j <= n; j++) {
            C[j][0] = 1000000;

            int new_index=0, temp_index=0;
            for (int i = 0; i < d.length; i++) {
                temp = j - d[i];
                if (j >= d[i] && C[temp][0] < C[j][0]) {
                    C[j][0] = 1 + C[temp][0];

                    //System.out.println("here"+d[i]);
                    C[j][++index] = d[i];

                    ++temp_index;

                    while (C[temp][++new_index]!=0) {
                        C[j][++index] = C[temp][new_index];
                        //System.out.println("**"+C[temp][new_index]);
                    }
                }
            }
            index = 0;
        }
        return C;
    }
}
