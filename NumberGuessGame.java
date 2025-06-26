package games;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		int numberToGuess = rand.nextInt(100)+1;
		int guess =0;
		int attempts =0;
		System.out.println("Guess a number between 1 and 100");
		while(guess!= numberToGuess) {
			System.out.println("Enter your guess:");
			guess = sc.nextInt();
			attempts++;
			if (guess<numberToGuess) {
				System.out.println("Too Low!");
			}else if(guess>numberToGuess) {
				System.out.println("Correct! You guessed it in" + attempts + "attempts.");
			}
		}
		sc.close();

	}

}
