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
public class Question1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String input = null;
        int charCode = 0;
        
        while (true) {
            System.out.print("Enter a character to check, or type quit: ");

            input = in.next();

            if (input.equals("quit")) {
                break;
            } else {
                if (input.length() > 1) {
                    System.out.println("Please enter only one character to check.");
                } else {
                    charCode = (int) input.charAt(0);
                    if (charCode >= 48 && charCode <= 57) {
                        System.out.println("Character is a number.");
                    } else if (charCode >= 65 && charCode <= 90) {
                        System.out.println("Character is uppercase.");
                    } else if (charCode >= 97 && charCode <= 122) {
                        System.out.println("Character is lowercase.");
                    } else {
                        System.out.println("Character is a special character.");
                    }
                }
            }
        }
    }

}

/* Output:
run:
Enter a character to check, or type quit: 4
Character is a number.
Enter a character to check, or type quit: T
Character is uppercase.
Enter a character to check, or type quit: u
Character is lowercase.
Enter a character to check, or type quit: !
Character is a special character.
Enter a character to check, or type quit: quit
BUILD SUCCESSFUL (total time: 26 seconds)
*/
