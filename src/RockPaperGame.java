import java.util.Random;
import java.util.Scanner;

public class RockPaperGame {

	public static void main(String[] args) {

		System.out.println("Welcome to Rock&Paper Game");
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Choose your no: \n1.Rock \n2.Paper \n3.Scissors");

			int choice = sc.nextInt();
			if (choice < 1 || choice > 3) {
				System.out.println("Invalid. Please choose a number between 1 and 3.");
				continue;

			}

			if (choice == 1) {
			System.out.println("You Choose : Rock");

			} else if (choice == 2) {
			System.out.println("You Choose : Paper");

			} else if (choice == 3) {
			System.out.println("You Choose : Scissors");
		}

		// Random_Function
		int min = 1;
		int max = 3;

		Random rand = new Random();
		int guess = rand.nextInt(max - min + 1) + min;

		if (guess == 1) {
			System.out.println("CPU Choice : Rock");
		} else if (guess == 2) {
			System.out.println("CPU Choice : Paper");
		} else if (guess == 3) {
			System.out.println("CPU Choice : Scissors");
		}
		System.out.println("Debugging: choice = " + choice + ", guess = " + guess);

		determineWinner(choice, guess);

		System.out.println("Do you want to play again ? yes/no: ");
		String playAgain = sc.next().toLowerCase();

		if (!playAgain.equals("yes")) {
			System.out.println("Thanks for playing, Goodbye !!");

			break;
		}

	}
	sc.close();


	}


	private static void determineWinner(int choice, int guess) {

		if (choice == guess) {
			System.out.println("It's a Tie");
		} else if ((choice == 1 && guess == 3) || (choice == 2 && guess == 1) || (choice == 3 && guess == 2)) {
			System.out.println("You win !!");
		} else {
			System.out.println("CPU Wins !!");

		}
	}
}