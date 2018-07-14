package bk1;

import java.util.Scanner;

public class Phone {
	private int price;
	private String brand;
	private String color;
	//Java_06_03 面向对象
	//手机类
	/*
	 * 作业：请把手机类写成一个标准类，然后创建对象测试功能。
	 * 
	 * 手机类： 成员变量： 品牌：String brand; 价格：int price; 颜色：String color; 成员方法：
	 * 针对每一个成员变量给出对应的getXxx()/setXxx()方法。 最后定义测试：
	 * 创建一个对象，先通过getXxx()方法输出成员变量的值。这一次的结果是：null---0---null
	 * 然后通过setXxx()方法给成员变量赋值。再次输出结果。这一次的结果是：三星---2999---土豪金
	 */
	@SuppressWarnings("unused")
	private void Call(){
		System.out.println("18075649594");
	}
	public void Message(){
		System.out.println("您的手机已欠费，请及时缴费。");
	}
	public void Game(Student s){
		System.out.println(" ε=ε=ε=(~￣▽￣)~ (ง •_•)ง");
	}
	/*
	定义一个类MyMath,提供基本的加减乘除功能，然后进行测试。
	 */
	public void Math(){
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入需要计算的数：");
		int a = sc.nextInt();
		System.out.println("请输入第二个数：");
		int b = sc.nextInt();
		System.out.println("请输入需要进行的运算（加减乘除-1234）：");
	    int c = sc.nextInt();
	    int d = 0;
	    switch(c){
	    case 1:
	    	d = a+b;
		    System.out.println(a+"+"+b+"="+d);
		    break;
	    case 2:
	    	d = a-b;
	    	System.out.println(a+"-"+b+"="+d);
	    	break;
	    case 3:
	    	d = a*b;
	    	System.out.println(a+"*"+b+"="+d);
	    	break;
	    case 4:
	    	d = a/b;
	    	System.out.println(a+"/"+b+"="+d);
	    	break;
	    }
	    return;
	}
	
	/*
	我们曾经曰：起名字要做到见名知意。
	
	this:是当前类的对象引用。简单的记，它就代表当前类的一个对象。
	
		注意：谁调用这个方法，在该方法内部的this就代表谁。
		
	this的场景：
		解决局部变量隐藏成员变量
*/
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
