package javaExamples;

import java.math.*;
import java.util.Scanner;
/*
 * java 生成一个10以内的整数，然后用户猜，用while循环控制猜的次数，最多5次，
 * 5次之内猜对了打印出信息，没猜出来也给出信息。
 */
public class whileExample {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int num = (int)((Math.random() * 100) % 10);
		int userguess = 0, time = 0, totalTime = 5;
		System.out.println("The computer is generating an integer between 0 and 10......");
		System.out.print("Please guess the number generated by computer:");
		userguess = input.nextInt();
		time++;
		
		while(userguess != num && time < totalTime)
		{
		
			System.out.print("No, that's not the number, please guess again:");
			userguess = input.nextInt();
			time++;
		}
		
		if(userguess != num)
		{
			System.out.println("You did not guess the number in the limited times, what a pity!");
			System.out.println("Actually, the number is: " + num);
		}
		else
		{
			System.out.println("congratulation, it took you " + time + " times to get it.");
		}
	}
	

}
