package edu.nyu.cs.fb1258.loops;

import java.util.Random;
import java.util.Scanner;

/**
 * Very simple while loop... maybe will get more complicated as we work on it.
 * @author Foo Barstein
 * @version 0.222
 */

public class WhileLoopVerySimple {

	public static void main(String[] args) {
		
		boolean x = true;

		// a loop that iterates 10 times
		int i = 0; // a counter!  also known as an accumulator
		while (i < 10) {
			System.out.println("Iterating within the first while loop for the " + i + "th time");
			i++; // shorthand for i = i + 1 (i.e. the equivalent of i += 1 in Python)
		}
		
		
		// a loop that stops iterating after a random number of iterations
		x = true; // reset x to true so this loop will at least iterate once
		while (x) {
			System.out.println("Iterating within the second while loop");
			// generate a random number
			Random r = new Random();
			x = r.nextBoolean();
		}
		
		// a loop that keeps iterating until the user enters a value we approve of
		Scanner scn = new Scanner(System.in); // open the scanner outside the loop, since we could potentially need to get more than one int of input
		x = true; // reset x to true so this loop will at least iterate once
		while (x) {
			System.out.println("Iterating within the third while loop");

			// get user input
			System.out.print("Please enter an integer between 1 and 10: ");
			int num = scn.nextInt();
			
			// validate the user's input
			if (num >= 1 && num <= 10) {
				x = false;
				System.out.println("Thanks for the good input!... quitting loop");
			}
			
			// if the user's input is invalid, x is still true, so no need to set it to that!
		}
		scn.close(); // close the scanner resource to be nice to the processor
		
		// a loop that breaks at the end of the first iteration
		x = true; // reset x to true so this loop will at least iterate once
		while (x) {
			System.out.println("This is the start of the iteration within the fourth while loop!");
			break;
			//System.out.println("This is the end of the iteration."); //unreachable code!
		}

		// an infinite loop with an example of bad code in the continue statement!
		x = true; // reset x to true so this loop will at least iterate once
		while (x) {
			System.out.println("This is the start of the iteration within the fifth while loop!");
			continue; // this is bad code!  a loop will always continue at the end of each iteration... you don't have to tell it to do this!
			//System.out.println("This is the end of the iteration."); //unreachable code!
		}
		
		System.out.println("Done!");

	}

}