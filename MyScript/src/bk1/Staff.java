package bk1;

public class Staff {
	/*
	����
		����һ��Ա����,�Լ�������������Ա��
		Ȼ�������Ա���������췽����getXxx()/setXxx()������
		�Լ�һ����ʾ���г�Ա��Ϣ�ķ����������ԡ�

	������
		Ա��
			��Ա������
				Ա����ţ�����������
			���췽����
				�޲ι��췽��
			��Ա������
				getXxx()/setXxx()
				show();
*/
	private String name;
	private int age;
	private int number;
	public Staff() {
	}
	
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
	public void test(People p){
		p.clothing();
	}
	public People test2(){
		return new Student();
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
