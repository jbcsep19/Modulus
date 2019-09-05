package com.company;

import java.util.Scanner;

// A modulus holds a remainder
public class Main {

    public static void main(String[] args) {
	// write your code here
        int a = 5; // declare and initialize
        int b = 2; // declare and initialize
        int c; // declare only

        // calculate modulus and save it into 'c'
        c = a%b;

        // if a = 5 and b = 2,
        // c = 5%2 = 1
        // because 2 goes in 5 twice, and has a remainder of 1.

        // find whether 'c' is even or odd
        if (c==0){ // no remainder
            System.out.println("The number is even.");
        } else { // any other remainder, which would be 1
            System.out.println("The number is odd.");
        }
    }
}
