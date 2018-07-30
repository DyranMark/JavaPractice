package bk1;

abstract class People {
	final int age = 25;
	String sex;
	String name;
	
	People(){
		System.out.println("People,construction method");//construction method
	}
	People(int age,String sex,String name){
		//this.age = age;
		this.sex = sex;
		this.name = name;
	}
	
	static{
		System.out.println("People,static code");
	}
	
	{
		System.out.println("People,construction code");
	}
	public abstract void clothing();
//	abstract void eat();
//	abstract void reside();
//	abstract void travel();
//	
	
//	public int getAge() {
//		return age;
//	}
//	public void setAge(int age) {
//		this.age = age;
//	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
