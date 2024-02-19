import java.util.Random;
import java.util.Scanner;

public class GuessTheWord {
	
	//making objects for scanner and random 
	//random will be used for the computer to choose a random word in a string
	static Scanner scan = new Scanner(System.in);
	static Random rand = new Random();
	//The main string (where the magic happens)
	public static void main(String[]args) {
		//introducing the program
		System.out.println("Would you like to play Guess The Word?");
		String answer = scan.next();
		String pc = "";
		//Making an array bank for the random words that the pc can choose from 
		String []WordBank = {"hello", "good", "morning", "welcome", "monitor", "you", "program", "game", "system",
				"goomba", "samples", "phone", "glasses", "mask", "nails", "ringtone", "word", "kirby", 
				"chair", "paper", "cup", "mouse"};
		
		//now making the choices for what the user chooses
		if(answer.equalsIgnoreCase("yes")) {
			
			//letting the user pick how many words
			System.out.println("Choose how many words you'd like ");
			int usernumber = scan.nextInt();
			
			System.out.println("Here are the words : ");
			
			//to shuffle through the words
			for(int j = 0; j<100; j++) {
				int wordShuffle = Math.abs(rand.nextInt()) % WordBank.length;
				int wordShuffle2 = Math.abs(rand.nextInt()) % WordBank.length;
				String temp = WordBank[wordShuffle];
				//to shuffle the words in the bank
				 WordBank[wordShuffle] = WordBank[wordShuffle2];
				 WordBank[wordShuffle2] = temp;
			}
			
			//forloop for the numbers
			for(int i = 0; i< usernumber ;i++) {
				System.out.println(WordBank[i]);	
			}
			
			//PC choosing a word from the WordBank length the user chose
			int number = (Math.abs(rand.nextInt())) % usernumber;//user number is the max number
			pc = WordBank[number];
			//System.out.println(pc); this is to test it works
			
			System.out.println("Pick a word");
			//the user picks a word from the ones the computer lists
			answer = scan.next();
			
			if (answer.equalsIgnoreCase(pc)) {
				System.out.println("You got the word correct :) ");
			}else {
				System.out.println("You got the answer wrong. Better Luck Next Time :( ");
				System.out.println("The Computer chose : " + pc);
			}
			
		}else{
			System.out.println("please play :)");
		}
		
		
		
	}
}
