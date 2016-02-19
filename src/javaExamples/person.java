package javaExamples;
/*
 * 这是一个用户自定义类的例子，这个例子很简单，只有一个类必须的基本要素：数据域，构建函数，和每个数据域对应的必要函数
 * 还有equals函数，toString函数，此类中包含了一个main函数，用来测试此类，这不是必须的，甚至不是必要的，但个人以为，这是一个好的习惯。
 */
public class person {
	
	private String name;
	private int age;
	private String gender;
	private String address;
	
	//默认构建函数，名字是某人，年龄18， 性别位置，地址是在地球上，好吧，也许这个构建函数没什么实际意义
	public person()
	{
		name = "Someone";
		age = 18;
		gender = "Unknown";
		address = "On the earth";
	}
	
	//也许，这个构建函数就有意义的多了
	public person(String newName, int newAge, String theGender, String newAddress)
	{
		name = newName;
		age = newAge;
		gender = theGender;
		address = newAddress;
	}
	
	//拷贝构造函数，好吧，这里我们姑且认为复制一个人是如此的简单并且合乎道德法律的准则
	public person(person anotherPerson)
	{
		name = anotherPerson.getName();
		age = anotherPerson.getAge();
		gender = anotherPerson.getGender();
		address = anotherPerson.getAddress();
	}
	
	//三个get函数，函数名不一定这么写的，只不过这样写意思比较明显
	public String getName(){return name;}
	public String getGender(){return gender;}
	public String getAddress(){return address;}
	public int getAge(){return age;}
	
	//三个set函数，函数名不一定这么写的，只不过这样写意思比较明显
	public void setName(String newName){name = newName;}
	public void setGender(String newGender){gender = newGender;}
	public void setAddress(String newAddress){address = newAddress;}
	public void setAge(int newAge){age = newAge;}
	
	//toString函数
	public String toString()
	{
		return "Person---Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Address: " + address;
	}
	
	//equals函数，在此我们简单的认为，如果两个人姓名相同年纪相同性别一样，地址也相同，那就是一个人
	public boolean equals(person anotherPerson)
	{
		return name.equals(anotherPerson.name) && age == anotherPerson.age && gender.equals(anotherPerson.gender) && address.equals(anotherPerson.address);
	}
	
	//主函数，用于测试类
	public static void main(String[] args)
	{
		//用三个不同的构建函数创造三个人。
		person p1 = new person();
		person p2 = new person("John", 20, "male", "144 pine street, markham, toronto, ontario");
		person p3 = new person(p1);
		
		//把三个人的信息打印出来, 并比较p1和p3是不是一个人，当然，这并不合事实的逻辑
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println("Are the first person and the third person same one?: " + p1.equals(p3));
		
		//改变p3，打印出来并再次比较,p3是谁呢？玩过寂静岭2的朋友也许知道哦
		p3.setName("marria");
		p3.setAge(0);
		p3.setGender("female");
		p3.setAddress("Silent Hill");
		System.out.println();
		System.out.println(p3);
		System.out.println("Are the first person and the third person same one?: " + p1.equals(p3));
	}

}
