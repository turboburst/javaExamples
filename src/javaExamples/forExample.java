package javaExamples;
/*
 * Ƕ��forѭ������ӡ��һ��nxn�ľ���Ϊ�˷�����ʾ���˴�nΪ1��10��������
 * ��i�е�j�е���ֵ����ixj
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
