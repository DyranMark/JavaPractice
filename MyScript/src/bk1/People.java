package bk1;

public class People {
	int age = 25;
	String sex;
	String name;
	
	People(){
		System.out.println("People,construction method");//construction method
	}
	People(int age,String sex,String name){
		this.age = age;
		this.sex = sex;
		this.name = name;
	}
	
	static{
		System.out.println("People,static code");
	}
	
	{
		System.out.println("People,construction code");
	}
	public void clothing(){
		System.out.println("衣");
	}
	public  void  eat(){
		System.out.println("自己做饭");
	}
	public void reside(){
		System.out.println("住");
	}
	public void travel(){
		System.out.println("行");
	}
	public void show(){
		System.out.println(age+sex+name);
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
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
