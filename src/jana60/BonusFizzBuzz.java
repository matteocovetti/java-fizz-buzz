package jana60;

import java.util.Scanner;

public class BonusFizzBuzz {

	public static void main(String[] args) {
		/* chiediamo all'utente un numero da 1 a 200
		 * per i multipli di 3 stampa Fizz
		 * per i multipli di 5 stampa Buzz
		 * per i multipli sia di 3 che di 5 stampa FizzBuzz*/
		
		Scanner scan = new Scanner(System.in);
		
		int numero = 0;
		
		System.out.println("Giochiamo a FizzBuzz:");
		for (int i = 1; i < 101; i++) {
			// add FizzBuzz
			if ((i % 3) == 0 && (i % 5) == 0) {
				System.out.println("FizzBuzz");
			} // add Fizz
			else if ((i % 3) == 0) {
				System.out.println("Fizz");
			} // add Buzz
			else if ((i % 5) == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}

	}

}
