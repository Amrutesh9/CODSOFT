package guess_game;

import java.util.Random;
import java.util.Scanner;

public class Guessgame {

	public static void main(String[] args) {
		Random random = new Random();
		int correct_guess = random.nextInt(100);
		int turns = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess a number between 1 to 100, "+"You will have 10 number of guesses");
		int guess;
		int i=0;
		boolean win = false;
		while(win==false) {
			guess = sc.nextInt();
			turns++;
			
			if(guess==correct_guess) {
				win = true;
			}
			else if(i>8) {
				System.out.println("You Lost, The correct guess was "+correct_guess);
				return;
			}
			else if(guess < correct_guess) {
				i++;
				System.out.println("Your guess is lower than right guess ");
			}
			else if(guess > correct_guess) {
				i++;
				System.out.println("Your guess is higher than right guess ");
			}
			
		}
		
		System.out.println("You Win");
		System.out.println("Your score is "+((11-turns)*10)+" out of 100");
		
	}

}
