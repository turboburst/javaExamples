package javaExamples;
/*
 * ����һ���û��Զ���������ӣ�������Ӻܼ򵥣�ֻ��һ�������Ļ���Ҫ�أ������򣬹�����������ÿ���������Ӧ�ı�Ҫ����
 * ����equals������toString�����������а�����һ��main�������������Դ��࣬�ⲻ�Ǳ���ģ��������Ǳ�Ҫ�ģ���������Ϊ������һ���õ�ϰ�ߡ�
 */
public class person {
	
	private String name;
	private int age;
	private String gender;
	private String address;
	
	//Ĭ�Ϲ���������������ĳ�ˣ�����18�� �Ա�λ�ã���ַ���ڵ����ϣ��ðɣ�Ҳ�������������ûʲôʵ������
	public person()
	{
		name = "Someone";
		age = 18;
		gender = "Unknown";
		address = "On the earth";
	}
	
	//Ҳ���������������������Ķ���
	public person(String newName, int newAge, String theGender, String newAddress)
	{
		name = newName;
		age = newAge;
		gender = theGender;
		address = newAddress;
	}
	
	//�������캯�����ðɣ��������ǹ�����Ϊ����һ��������˵ļ򵥲��ҺϺ����·��ɵ�׼��
	public person(person anotherPerson)
	{
		name = anotherPerson.getName();
		age = anotherPerson.getAge();
		gender = anotherPerson.getGender();
		address = anotherPerson.getAddress();
	}
	
	//����get��������������һ����ôд�ģ�ֻ��������д��˼�Ƚ�����
	public String getName(){return name;}
	public String getGender(){return gender;}
	public String getAddress(){return address;}
	public int getAge(){return age;}
	
	//����set��������������һ����ôд�ģ�ֻ��������д��˼�Ƚ�����
	public void setName(String newName){name = newName;}
	public void setGender(String newGender){gender = newGender;}
	public void setAddress(String newAddress){address = newAddress;}
	public void setAge(int newAge){age = newAge;}
	
	//toString����
	public String toString()
	{
		return "Person---Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Address: " + address;
	}
	
	//equals�������ڴ����Ǽ򵥵���Ϊ�����������������ͬ�����ͬ�Ա�һ������ַҲ��ͬ���Ǿ���һ����
	public boolean equals(person anotherPerson)
	{
		return name.equals(anotherPerson.name) && age == anotherPerson.age && gender.equals(anotherPerson.gender) && address.equals(anotherPerson.address);
	}
	
	//�����������ڲ�����
	public static void main(String[] args)
	{
		//��������ͬ�Ĺ����������������ˡ�
		person p1 = new person();
		person p2 = new person("John", 20, "male", "144 pine street, markham, toronto, ontario");
		person p3 = new person(p1);
		
		//�������˵���Ϣ��ӡ����, ���Ƚ�p1��p3�ǲ���һ���ˣ���Ȼ���Ⲣ������ʵ���߼�
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		System.out.println("Are the first person and the third person same one?: " + p1.equals(p3));
		
		//�ı�p3����ӡ�������ٴαȽ�,p3��˭�أ�����ž���2������Ҳ��֪��Ŷ
		p3.setName("marria");
		p3.setAge(0);
		p3.setGender("female");
		p3.setAddress("Silent Hill");
		System.out.println();
		System.out.println(p3);
		System.out.println("Are the first person and the third person same one?: " + p1.equals(p3));
	}

}
