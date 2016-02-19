package javaExamples;
/*
 * 嵌套for循环，打印出一个nxn的矩阵，为了方便显示，此处n为1到10的整数，
 * 第i行第j列的数值等于ixj
 */
import java.util.Scanner;
public class forExample {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		int n = 1;
		System.out.print("Please enter an integer between 1 and 10: ");
		n = input.nextInt();
		
		for(int i = 1; i <= n; i ++)
		{
			for(int j = 1; j <= n; j ++)
			{
				System.out.print(i * j + "\t");
			}
			System.out.println();
		}
	}

}
