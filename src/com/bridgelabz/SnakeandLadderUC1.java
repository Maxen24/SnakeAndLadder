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
		Random rand=new Random();
		int rolldie=rand.nextInt(6)+1;
		System.out.println("Dice Number"+" "+rolldie);
				int options =rand.nextInt(3);
				int temp;
		System.out.println("Check Options"+" "+options);
		if (options ==1) {
			System.out.println("ladder");
			position=(position+rolldie);
			System.out.println("Current Position is "+" "+position);
		}else if(options==0) {
			System.out.println("No play");
			System.out.println("Current Position is"+" "+position);
		}else if (options==2){
			System.out.println("Snake");
			temp=(position-rolldie);
			if (temp<0) {
				position=0;
			System.out.println("Current Position is"+" "+position);
			
		}
	}
	}
}