package bk1;

public class Student {

	/*
	 * ��� ���� �������Ϣ���� ��Ϊ ����Ĺ���
	 * 
	 * �ࣺ ��Ա���� ��������� ��Ա���� �������Ϊ
	 * 
	 * ����һ���࣬��ʵ���Ƕ������ĳ�Ա�����ͳ�Ա������
	 * 
	 * ���������������һ��ѧ����Ķ��塣
	 * 
	 * ѧ����� ���ԣ����������䣬��ַ... ��Ϊ��ѧϰ���Է���˯��...
	 * 
	 * ������Ҫת��Ϊ��Ӧ���ࣺ
	 * 
	 * ѧ���ࣺ ��Ա���������������䣬��ַ... ��Ա������ѧϰ���Է���˯��...
	 * 
	 * ��Ա����������ǰ�����Ķ�����һ���ĸ�ʽ������λ�ò�ͬ�������з����⡣ ��Ա����������ǰ�ķ���������һ���ĸ�ʽ�����ǽ����static��ȥ����
	 * 
	 * ��������Ӧ�ö���һ���࣬Ȼ�������ĳ�Ա��
	 */
	private String name;
	private int age ;
	private String address;
	
	/*
	���췽����
		����������ݽ��г�ʼ��

	��ʽ��
		A:��������������ͬ
		B:û�з���ֵ���ͣ���void��û��
		C:û�о���ķ���ֵ
*/
	//���췽�������ֺ�����һ�£�û�з���ֵ���ͣ�û�о��巵��ֵ
	public Student(){	
	}
	public Student(String name,int age,String address){
		System.out.println("���ǹ��췽����");
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public void Study(){
		System.out.println("ѧ����ˮ���ۣ��������ˡ�");
	}
	public void Eat(){
		System.out.println("��Ҫѧϰ����ʳ��");
	}
	public void Sleep(){
		System.out.println("��Ҫѧϰ�����ޣ�");
	}
	public void Show(){
		System.out.println("������"+name);
		System.out.println("���䣺"+age);
		System.out.println("��ַ��"+address);
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
