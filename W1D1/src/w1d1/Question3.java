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
public class Question3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");

        String input = in.next();
        int[] numbers = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            numbers[i] = Character.getNumericValue(input.charAt(i));
        }
        
        int odd = 0;
        int even = 0;
        int zero = 0;
        
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 0) {
                zero++;
            } else {
                if (numbers[i] % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }
        
        System.out.println("Odd digits: " + odd);
        System.out.println("Even digits: " + even);
        System.out.println("Zero digits: " + zero);
    }
}

/* Output:
run:
Enter a number: 730524
Odd digits: 3
Even digits: 2
Zero digits: 1
BUILD SUCCESSFUL (total time: 13 seconds)
*/