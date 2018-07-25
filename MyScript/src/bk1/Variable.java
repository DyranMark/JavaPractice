package bk1;

public class Variable {
	int num ;
	
	private  Variable(){}
	
	public void show(){
		int num2 = 20;
		System.out.println(num2);
		System.out.println(num);
	}
	
	public static void StudentTool(Student s){
		s.eat();
		System.out.println(s.age);
	}
	public static void StaffTool(Staff a){
		a.show();
	}
}
