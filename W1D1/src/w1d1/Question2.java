/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package w1d1;

import java.util.Scanner;

/**
 *
 * @author Tosha
 */
public class Question2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter an amount, for example, 11.56: ");

        String input = in.next();
        String[] amount = input.split("\\.");

        int cents = Integer.parseInt(amount[1]);
        int quarters = getCoins(cents, 25);
        cents = cents - (quarters * 25);
        int dimes = getCoins(cents, 10);
        cents = cents - (dimes * 10);
        int nickels = getCoins(cents, 5);
        cents = cents - (nickels * 5);
        int pennies = getCoins(cents, 1);
        cents = cents - (pennies * 1);
        
        System.out.println("Your amount " + input + " consists of");
        System.out.println(amount[0] + " dollars");
        System.out.println(quarters + " quarters");
        System.out.println(dimes + " dimes");
        System.out.println(nickels + " nickels");
        System.out.println(pennies + " pennies");

    }
    
    static int getCoins(int cents, int coinAmount) {
        int temp = 0;
        int coinCount = 0;
        while (true) {
            temp = cents - (coinAmount * coinCount);
            if (temp >= coinAmount) {
                coinCount++;
            } else {
                break;
            }
        }
        return coinCount;
    }
}

/* Output:
run:
Enter an amount, for example, 11.56: 15.72
Your amount 15.72 consists of
15 dollars
2 quarters
2 dimes
0 nickels
2 pennies
BUILD SUCCESSFUL (total time: 9 seconds)
*/