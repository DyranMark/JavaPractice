package bk1;

public class Student implements Comparable<Student> {

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
	private String address;
	int age = 20;
	String name ;

	//final String name = "Henry";

	/*
	 * ���췽���� ����������ݽ��г�ʼ��
	 * 
	 * ��ʽ�� A:��������������ͬ B:û�з���ֵ���ͣ���void��û�� C:û�о���ķ���ֵ
	 */
	// ���췽�������ֺ�����һ�£�û�з���ֵ���ͣ�û�о��巵��ֵ
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
		System.out.println("ѧ����ˮ���ۣ��������ˡ�");
	}

	// ���������ͽ���
	static {
		//System.out.println("Student,static code");
	}

	{
		//System.out.println("Student,construction code");
	}
	
	
	
	
	public void clothing(){
		System.out.println("У��");
	}
	public void eat(){
		System.out.println("ѧ��ʳ��");
	}
	public void reside(){
		System.out.println("����");
	}
	public void travel(){
		System.out.println("����");
	}
	
	/*
	�����ǣ�
		�Ҳ�����Ҫ����ֲ���Χ��num����Ҫ��������Ա��Χ��num����ô����?
		�һ���Ҫ��������Ա��Χ��num����ô����?
			�����һ��������this���ƣ����ǿ���ֱ�ӷ��ʸ�������ݾͺ��ˡ�
			��ϲ�㣬����ؼ����Ǵ��ڵģ�super��
			
	this��super������?
		�ֱ���ʲô��?
			this�������Ӧ�����á�
			super������洢�ռ�ı�ʶ(�������Ϊ��������,���Բ�������ĳ�Ա)

		��ô����?
			A:���ó�Ա����
				this.��Ա���� ���ñ���ĳ�Ա����
				super.��Ա���� ���ø���ĳ�Ա����
			B:���ù��췽��
				this(...)	���ñ���Ĺ��췽��
				super(...)	���ø���Ĺ��췽��
			C:���ó�Ա����
				this.��Ա���� ���ñ���ĳ�Ա����
				super.��Ա���� ���ø���ĳ�Ա����
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
