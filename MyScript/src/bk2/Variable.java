package bk2;

class Variable {
	int num ;
	
	private  Variable(){}
	
	public Variable(int num) {
		super();
		this.num = num;
	}

	public void show(){
		int num2 = 20;
		System.out.println(num2);
		System.out.println(num);
	}
}
