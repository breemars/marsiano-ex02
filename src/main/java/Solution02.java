/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.Scanner;

public class Solution02 {
    /*
    Print out length of string:
    - create scanner
    - ask user for their input string
    - input line as string
    - output the string with string.length() of characters
     */
    public static void main(String[] args){

        //IN - Asks the user for their string
        Scanner input = new Scanner(System.in);
        System.out.print("What is the input string? ");
        String count = input.nextLine();

        //OUT - Prints out the length of the string
        System.out.println(count + " has " + count.length() + " characters.");

    }

}
