
import java.util.Scanner;
import java.util.Random;
public class GuessNo {
	int gno;
	GuessNo(){
		int guess=0;int score=100;
		Random random=new Random();
		gno=random.nextInt(100); //generating random numbers from 0-99
		Scanner scan=new Scanner(System.in);
		System.out.println("-------YOU HAVE 10 ATTEMPTS--------");
		System.out.println("--Your Initial score is 100..The more the number of guesses the less the score--");
		System.out.println("----You have to enter the number between 0-99");
		System.out.println("--------LETS GO-------");
		do {
		System.out.println("Enter number for the Guess..");
		int num=scan.nextInt();
		if(num<gno) {
			System.out.println("Your guess is less than the actual number");
			guess=guess+1;
			System.out.println("You have "+(10-guess)+" Attempts left");
			score=score-10;
			System.out.println("********SCORE= "+score+" **********");
		}
		else if(num>gno) {
			System.out.println("Your guess is greater than the actual number");
			guess=guess+1;
			System.out.println("You have "+(10-guess)+" Attempts left");
			score=score-10;
			System.out.println("********SCORE= "+score+" **********");
		}
		else if(num==gno) {
			guess=guess+1;
			score=score-10;
			System.out.println("Correct Guess!!");
			System.out.println("You took "+(guess)+ " Attempts to guess the correct number");
			System.out.println("-------CONGRATULATIONS!! YOU WON!!----------");
			System.out.println("********SCORE= "+score+" ********");
			break;
		}
		}while(guess<10);
		if(guess>9) {
			System.out.println("Sorry you couldn't guess the right number..TRY AGAIN!!");
			System.out.println("The number was: "+gno+" ");
			System.out.println("--------BETTER LUCK NEXT TIME--------");
		}
	}
	public static void main(String[] args) {
		GuessNo g=new GuessNo();
	}

}
