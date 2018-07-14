package bk1;

public class Student {

	/*
	 * 事物： 属性 事物的信息描述 行为 事物的功能
	 * 
	 * 类： 成员变量 事物的属性 成员方法 事物的行为
	 * 
	 * 定义一个类，其实就是定义该类的成员变量和成员方法。
	 * 
	 * 案例：我们来完成一个学生类的定义。
	 * 
	 * 学生事物： 属性：姓名，年龄，地址... 行为：学习，吃饭，睡觉...
	 * 
	 * 把事物要转换为对应的类：
	 * 
	 * 学生类： 成员变量：姓名，年龄，地址... 成员方法：学习，吃饭，睡觉...
	 * 
	 * 成员变量：和以前变量的定义是一样的格式，但是位置不同，在类中方法外。 成员方法：和以前的方法定义是一样的格式，但是今天把static先去掉。
	 * 
	 * 首先我们应该定义一个类，然后完成类的成员。
	 */
	private String name;
	private int age ;
	private String address;
	
	/*
	构造方法：
		给对象的数据进行初始化

	格式：
		A:方法名与类名相同
		B:没有返回值类型，连void都没有
		C:没有具体的返回值
*/
	//构造方法，名字和类名一致，没有返回值类型，没有具体返回值
	public Student(){	
	}
	public Student(String name,int age,String address){
		System.out.println("这是构造方法。");
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void Study(){
		System.out.println("学如逆水行舟，不进则退。");
	}
	public void Eat(){
		System.out.println("我要学习，忘食！");
	}
	public void Sleep(){
		System.out.println("我要学习，废寝！");
	}
	public void Show(){
		System.out.println("姓名："+name);
		System.out.println("年龄："+age);
		System.out.println("地址："+address);
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
	public void setAge(byte age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
