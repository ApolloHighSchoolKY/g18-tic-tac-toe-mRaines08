//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class TicTacToe
{
	private char[][] mat;

	public TicTacToe()
	{
		mat = new char[3][3];
	}

	public TicTacToe(String game)
	{
		//row major order will happen here
		//use charAt()
		mat = new char[3][3];

		int pos = 0;

		for(int r = 0; r < mat.length; r++)
			for(int c = 0; c < mat[r].length; c++)
			{
				mat[r][c] = game.charAt(pos);
				pos++;
			}
	}

	public String getWinner()
	{

		// if the first letter is the same as the second letter and the second letter is the same as the thrid letter then that letter wins
		// do same for vertical and diagonal
		// else tie
		if(mat[0][0] == mat[0][1] && mat[0][1] == mat[0][2])
			return "" + mat[0][0] + " wins horizontally!";
		else if(mat[1][0] == mat[1][1] && mat[1][1] == mat[1][2])
			return "" + mat[1][0] + " wins horizontally!";
		else if(mat[2][0] == mat[2][1] && mat[2][1] == mat[2][2])
			return "" + mat[2][0] + " wins horizontally!";
		else if(mat[0][0] == mat[1][0] && mat[1][0] == mat[2][0])
			return "" + mat[0][0] + " wins vertically!";
		else if(mat[0][1] == mat[1][1] && mat[1][1] == mat[2][1])
			return "" + mat[0][1] + " wins vertically!";
		else if(mat[0][2] == mat[1][2] && mat[1][2] == mat[2][2])
			return "" + mat[0][2] + " wins vertically!";
		else if(mat[0][0] == mat[1][1] && mat[1][1] == mat[2][2])
			return "" + mat[0][0] + " wins diagonally!";
		else if(mat[0][2] == mat[1][1] && mat[1][1] == mat[2][0])
			return "" + mat[0][2] + " wins diagonally!";
		else
			return "cat's game - no winner!";
	}

	public String toString()
	{
		String output="";

		//prints board use row major order
		for(char[] row : mat)
		{
			output += "\n";
			for(char c : row)
				output += " " + c;
		}

		return output + "\n" + getWinner() + "\n\n";
	}
}