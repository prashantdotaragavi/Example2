package newtestone;

import java.util.Scanner;

public class Multidimentional {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[][] arr = new int[2][3];
	System.out.println(arr.length);
	for (int row = 0; row<(arr.length);row++)
	{
	for(int column = 0;column<arr[row].length;column++) {
		
		arr[row][column]=sc.nextInt();
		
		
		
	}
				
		}

	}

}
