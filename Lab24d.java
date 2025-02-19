//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Lab24d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner (new File("lab24d.dat"));

		int num = file.nextInt();
		System.out.println(file.nextLine());

		for(int i = 0; i < num; i++)
		{
			TicTacToe board = new TicTacToe(file.nextLine());
			System.out.println("board " + (i+1) + board);
		}

		
		
		//read how many times you should read
			//create an int that will except the numbr of times you should read
			// use next line after you read the int
			//use a traditional for loop

			//file.nextLine() reads all the way to the end of a line as a string
		
		//Tictactoe only wants File.nextLine()

		//make a tictactoe object for each game (row) in the file

		//







	}
}



