package javaExamples;
/*
 * �����һ���򵥵��������̣�������һά���飬һ�����������飬һ�����ַ������飬
 * ������ֻ��ʹ��forѭ����ӡ�������ǣ������õ���for eachѭ��
 * �����кܶ������Ĳ������÷��������лᾭ���õ���Ҫ���ʵ��
 */
public class arrayExample {
	public static void main(String[] args)
	{
		int[] numArray = new int[6];
		String[] strArray = new String[6];
		
		//��ʱ����������ʲô��û�У�java��Ĭ�϶���ֵΪ0
		//��ʱ�ַ���������ʲô��û�У�java��Ĭ��Ϊʲô�أ�
		//������������������͵��أ�
		for(int number: numArray)
		{
			System.out.print(number + "\t");
		}
		
		System.out.println();
		for(String str: strArray)
		{
			System.out.print(str + "\t");
		}
		
		//�������ڸ����鸳ֵ����������Ч��
		numArray[0] = 9;
		numArray[1] = 4;
		numArray[2] = 8;
		numArray[3] = 5;
		numArray[4] = 12;
		numArray[5] = 15;		

		strArray[0] = "I";
		strArray[1] = "was";
		strArray[2] = "an";
		strArray[3] = "international";
		strArray[4] = "student";
		strArray[5] = "before";
		
		//��������Ч��
		System.out.println();
		for(int number: numArray)
		{
			System.out.print(number + "\t");
		}
		
		System.out.println();
		for(String str: strArray)
		{
			System.out.print(str + "\t");
		}
	}

}
