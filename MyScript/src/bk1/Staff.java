package bk1;

public class Staff {
	/*
	需求：
		定义一个员工类,自己分析出几个成员，
		然后给出成员变量，构造方法，getXxx()/setXxx()方法，
		以及一个显示所有成员信息的方法。并测试。

	分析：
		员工
			成员变量：
				员工编号，姓名，年龄
			构造方法：
				无参构造方法
			成员方法：
				getXxx()/setXxx()
				show();
*/
	private String name;
	private int age;
	private int number;
	
	public Staff(String name,int age,int number){
		this.age = age;
		this.name = name;
		this.number = number;
	}
	public void show(){
		System.out.println(number);
		System.out.println(name);
		System.out.println(age);
	}
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}	
}
