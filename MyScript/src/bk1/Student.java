package bk1;

public class Student implements Comparable<Student> {

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
	private String address;
	int age = 20;
	String name ;

	//final String name = "Henry";

	/*
	 * 构造方法： 给对象的数据进行初始化
	 * 
	 * 格式： A:方法名与类名相同 B:没有返回值类型，连void都没有 C:没有具体的返回值
	 */
	// 构造方法，名字和类名一致，没有返回值类型，没有具体返回值
	 Student() {
		//System.out.println("Student,construction method");
		 super();
	}
	
	 Student(String name,int age){
		 super();
		 this.name = name;
		 this.age = age;
	}

	public void Study() {
		System.out.println("学如逆水行舟，不进则退。");
	}

	// 代码块概述和讲解
	static {
		//System.out.println("Student,static code");
	}

	{
		//System.out.println("Student,construction code");
	}
	
	
	
	
	public void clothing(){
		System.out.println("校服");
	}
	public void eat(){
		System.out.println("学生食堂");
	}
	public void reside(){
		System.out.println("寝室");
	}
	public void travel(){
		System.out.println("公交");
	}
	
	/*
	问题是：
		我不仅仅要输出局部范围的num，还要输出本类成员范围的num。怎么办呢?
		我还想要输出父类成员范围的num。怎么办呢?
			如果有一个东西和this相似，但是可以直接访问父类的数据就好了。
			恭喜你，这个关键字是存在的：super。
			
	this和super的区别?
		分别是什么呢?
			this代表本类对应的引用。
			super代表父类存储空间的标识(可以理解为父类引用,可以操作父类的成员)

		怎么用呢?
			A:调用成员变量
				this.成员变量 调用本类的成员变量
				super.成员变量 调用父类的成员变量
			B:调用构造方法
				this(...)	调用本类的构造方法
				super(...)	调用父类的构造方法
			C:调用成员方法
				this.成员方法 调用本类的成员方法
				super.成员方法 调用父类的成员方法
*/
	public void showmessage(){
		System.out.println(age);
		System.out.println(this.age);
		//System.out.println(super.age);
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public final void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		int num  = this.name.length() - o.name.length();
		int num2 = num==0?this.name.compareTo(o.name):num;
		int num3 = num2==0?this.age-o.age:num2;
		return num3;
	}
}
