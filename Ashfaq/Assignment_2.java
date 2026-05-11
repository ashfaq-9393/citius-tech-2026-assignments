/*Java program to toggle each character in a string 
Problem Statement: 
Write a program that toggles the case of each character in the given string. Specifically: 
•	Convert all uppercase letters in the string to lowercase. 
•	Convert all lowercase letters in the string to uppercase. 
*/

package com.citiustech;

import java.util.Scanner;

public class Assignment_2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the string to toggle : ");

        String s = scan.nextLine();

        String res = "";

        for (int i = 0; i < s.length(); i++) {

            char a = s.charAt(i);

            if (Character.isLowerCase(a)) {

                char aa = Character.toUpperCase(a);

                res += aa;

            } else {

                res += Character.toLowerCase(a);

            }
        }

        System.out.println("Result: " + res);
    }
}