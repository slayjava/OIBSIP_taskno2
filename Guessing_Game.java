import java.util.*;

public class Guessing_Game {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int ch, i = 0, x = 0;
		System.out.println("Do you want to play this game?\nPress 1 for Yes and 0 for No");
		ch = sc.nextInt();
		while (true) {
			if (ch == 0) {
				System.out.println("See you next time");
				break;
			} else if (ch == 1) {
				i++;
				int g;
				System.out.println("Enter a number of your choice between 1 to 100");
				g = sc.nextInt();
				int n = (int) (Math.random() * 100) + 1;
				System.out.println("Your number=" + g + "\n" + "Generated number=" + n);
				if (n == g) {
					x++;
					System.out.println("Congratulations you guessed the correct number!!\nYour Score=" + x);
				} else if (g > n)
					System.out.println("The number you entered is greater than the generated number.\nYour Score=" + x);
				else
					System.out.println("The number you entered is smaller than the generated number.\nYour Score=" + x);
				System.out.println("Number of attempts=" + i);
				System.out.println("Do you want to play this again?");
				ch = sc.nextInt();
				if (ch != 1)
					System.out.println("Alright See you again.\nThanks for playing!!");
				else
					continue;
				sc.close();
			} else {
				System.out.println("Wrong input");
				break;
			}
		}
	}
}
