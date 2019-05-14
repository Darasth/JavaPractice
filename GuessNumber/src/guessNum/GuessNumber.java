package guessNum;

import java.awt.Graphics;

public class GuessNumber {

	public static void main(String[] args) {
		 //corregir nombres de las clases
		//public void paint(Graphics g) {
			
			
		//}
		
		int i = 0, cant = 4, range = 9, a = 0; //Define the variables
		int array[] = new int [cant]; //the length of the array will be our cant
		
		
		while (array[0] == 0) {    //the first number can't be 0
			array[0] = (int)(Math.random()*range);	
		
		for (i=1; i<cant; i++) { //Assign each valor of i to the array and check that the numbers aren't equals
			array[i] = (int)(Math.random()*range);
			for(int j=0; j<i; j++) {
				if (array[i] == array[j]) {
					i--;
				}
		
		}
			}		
	}
		for (a=0; a<cant; a++) {
			System.out.print(array[a]); //print not println
		}
		
		
		
	}
	
}