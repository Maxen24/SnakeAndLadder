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
		int sum=0;
		for(;position<=99;) {
		Random rand=new Random();
		int rolldie=rand.nextInt(6)+1;
		System.out.println("Dice Number"+" "+rolldie);
		sum=sum+rolldie;
				int options =rand.nextInt(3);
		System.out.println("Check Options"+" "+options);
		if (options ==1) {
			System.out.println("ladder");
			position=position+rolldie;
			System.out.println("Current Position is"+" "+position);
			switch(position) {
			case 104:
				position=position-rolldie;
				System.out.println("Previous Position is"+" "+position);
				break;
			case 106:
				position=position-rolldie;
				System.out.println("Previous Position is"+" "+position);
				break;

			case 105:
				position=position-rolldie;
				System.out.println("Previous Position is"+" "+position);
				break;
			case 103:
				position=position-rolldie;
				System.out.println("Previous Position is"+" "+position);
				break;

			case 102:
				position=position-rolldie;
				System.out.println("Previous Position is"+" "+position);
				break;

			case 101:
				position=position-rolldie;
				System.out.println("Previous Position is"+" "+position);
				break;
			case 100:
				System.out.println("Player won the game"+" "+position);
				System.out.println("Sum of Dice"+" "+ sum);
				break;
			}
			
		}else if(options==0) {
			System.out.println("No play");
			System.out.println("Current Position is"+" "+position);
			switch(position) {
			case 104:
				position=position-rolldie;
				System.out.println("Previous Position is"+" "+position);

			case 106:
				position=position-rolldie;
				System.out.println("Previous Position is"+" "+position);
				break;

			case 105:
				position=position-rolldie;
				System.out.println("Previous Position is"+" "+position);
				break;
			case 103:
				position=position-rolldie;
				System.out.println("Previous Position is"+" "+position);
				break;
			case 102:
				position=position-rolldie;
				System.out.println("Previous Position is"+" "+position);
				break;
			case 101:
				position=position-rolldie;
				System.out.println("Previous Position is"+" "+position);
				break;
			case 100:
				System.out.println("Player won the game"+" "+position);
				break;
			}
		}else if (options==2){
			System.out.println("Snake");
			position=position-rolldie;
			System.out.println("Current position"+" "+position);
			if (position<0) {
				position=0;
			System.out.println("New Position is"+" "+position);
			}
		}
	}
}
}
	