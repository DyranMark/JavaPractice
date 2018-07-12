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
	String name;
	byte age ;
	String address;
	
	public void Study(){
		System.out.println("学如逆水行舟，不进则退。");
	}
	public void Eat(){
		System.out.println("我要学习，忘食！");
	}
	public void Sleep(){
		System.out.println("我要学习，废寝！");
	}
}
