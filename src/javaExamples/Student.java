package javaExamples;

/*
 * �̳���person���һ��student�࣬ӵ��һ����Ӧ�еĻ���������ͬ����һ�������õ�main����
 * ��person��һ����Ҳ�ж�����캯��������һ�ֺ������ء��������toString������equals��������һ�ָ�д
 * ע�⣬ֻ��person���Student������������ļ�����ͬһ���ļ����»���Student��Ҫimport���ĸ���person�࣬
 * Student��ſ�������ʹ�ã�
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
		
		//�������˵���Ϣ��ӡ����, ���Ƚ�s1��s3�ǲ���һ��ѧ������Ȼ���Ⲣ������ʵ���߼�
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println("Are the first student and the third person same one?: " + s1.equals(s3));
		
		//�ı�s3����ӡ�������ٴαȽ�,s3��˭�أ�����ž���2������Ҳ��֪��Ŷ
		s3.setMajor("mathematics");
		s3.setScore(100);
		System.out.println();
		System.out.println(s3);
		System.out.println("Are the first student and the third person same one?: " + s1.equals(s3));
		
		//�����������������һ��ʵ��,���Կ�������Ȼ���Ǵ�����һ��person���ʵ����������ʵjava֪����ʵ��������һ��student���ʵ�������Դ�ӡ��ʱ����Ȼʹ����student��toString����
		//���Ƿ������Ͳ����ˣ�Student s = new person(); ����Ǵ��
		person p = new Student("marry", 21, "female", "256 regent street, scarborough, toronto, ontario", "Computer Science", 89);
		System.out.println("\n" + p);
	}

}
