package javaExamples;
/*
 * 这个是一个简单的数组例程，有两个一维数组，一个是整型数组，一个是字符串数组，
 * 本程序只是使用for循环打印出来他们，这里用到了for each循环
 * 数组有很多其他的操作和用法，程序中会经常用到，要多多实践
 */
public class arrayExample {
	public static void main(String[] args)
	{
		int[] numArray = new int[6];
		String[] strArray = new String[6];
		
		//此时整型数组中什么都没有，java会默认都赋值为0
		//此时字符串数组中什么都没有，java会默认为什么呢？
		//如果是其他的数据类型的呢？
		for(int number: numArray)
		{
			System.out.print(number + "\t");
		}
		
		System.out.println();
		for(String str: strArray)
		{
			System.out.print(str + "\t");
		}
		
		//我们现在给数组赋值，再来看看效果
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
		
		//再来看看效果
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
