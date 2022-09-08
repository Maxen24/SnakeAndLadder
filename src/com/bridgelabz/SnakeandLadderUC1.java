/**
 * 
 */
package com.bridgelabz;

/**
 * @author mshub
 *
 */
import java.util.Random;
public class SnakeandLadderUC1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int position =0;
		System.out.println("Player one position is"+" "+ position);
		Random rand=new Random();
		int rolldie=rand.nextInt(6)+1;
		System.out.println("Dice Number"+" "+rolldie);
	}

}
