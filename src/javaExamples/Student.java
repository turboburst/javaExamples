package javaExamples;

/*
 * 继承自person类的一个student类，拥有一个类应有的基本方法，同样有一个测试用的main函数
 * 像person类一样，也有多个构造函数，这是一种函数重载。而这里的toString方法和equals方法，是一种复写
 * 注意，只有person类和Student类这两个类的文件处于同一个文件夹下或者Student类要import它的父类person类，
 * Student类才可以正常使用，
 */
public class Student extends person{
	private String major;
	private double score;
	
	public Student()
	{
		super();
		major = "some major";
		score = 0.0;
	}
	
	public Student(String name, int age, String gender, String address, String major, double score)
	{
		super(name, age, gender, address);
		this.major = major;
		this.score = score;
	}
	
	public Student(Student anotherStudent)
	{
		super(anotherStudent.getName(), anotherStudent.getAge(), anotherStudent.getGender(), anotherStudent.getAddress());
		major = anotherStudent.getMajor();
		score = anotherStudent.getScore();
	}
	
	public double getScore(){return score;}
	public String getMajor(){return major;}
	
	public void setScore(double newScore){score = newScore;}
	public void setMajor(String newMajor){major = newMajor;}
	
	public String toString()
	{
		return "Student:[" + super.toString() + ", major: " + this.getMajor() + ", score: " + this.getScore() + "]"; 
	}
	
	public boolean equals(Student anotherStudent)
	{
		return (new person(this.getName(), this.getAge(), this.getGender(), this.getAddress()).equals(
				new person(anotherStudent.getName(), anotherStudent.getAge(), anotherStudent.getGender(), 
				anotherStudent.getAddress())) && major.equals(anotherStudent.getMajor()) && score 
				== anotherStudent.getScore());
	}
	
	public static void main(String[] args)
	{
		Student s1 = new Student();
		Student s2 = new Student("John", 20, "male", "144 pine street, markham, toronto, ontario", "Computer Science", 98);
		Student s3 = new Student(s1);
		
		//把三个人的信息打印出来, 并比较s1和s3是不是一个学生，当然，这并不合事实的逻辑
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("Are the first student and the third person same one?: " + s1.equals(s3));
		
		//改变s3，打印出来并再次比较,s3是谁呢？玩过寂静岭2的朋友也许知道哦
		s3.setMajor("mathematics");
		s3.setScore(100);
		System.out.println();
		System.out.println(s3);
		System.out.println("Are the first student and the third person same one?: " + s1.equals(s3));
		
		//最后，我们这样来创建一个实例,可以看到，虽然我们创建了一个person类的实例，可是其实java知道，实际上这是一个student类的实例，所以打印的时候仍然使用了student的toString方法
		//但是反过来就不对了，Student s = new person(); 这就是错的
		person p = new Student("marry", 21, "female", "256 regent street, scarborough, toronto, ontario", "Computer Science", 89);
		System.out.println("\n" + p);
	}

}
