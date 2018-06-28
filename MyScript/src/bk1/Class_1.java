package bk1;

public class Class_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.print("Hello !");
		// byte b1=3,b2=4,b;
		// b=b1+b2;
		// b=3+4;
		// System.out.print(b);

		// byte b1 = (byte) 130;
		// byte b2 = (byte) 300;
		//
		// System.out.println(b1);
		// System.out.println(b2);
		// int a=0,b=0,c=0;
		//
		// c = a++;
		// System.out.println(a);
		// System.out.println(b);
		// b = ++a;
		// System.out.println(a);
		// System.out.println(c);
		
		//default语句表示所有情况都不匹配的时候，就执行该处的内容，和if语句的else相似。
//		System.out.println("输入月份：");
//		@SuppressWarnings("resource")
//		Scanner sc = new Scanner(System.in);
//		int month = sc.nextInt();
//		switch (month) {
//		case 1:
//			System.out.println("当前是春季");
//			break;
//		case 2:
//			System.out.println("当前是春季");
//			break;
//		case 3:
//			System.out.println("当前是春季");
//			break;
//		case 4:
//			System.out.println("当前是夏季");
//			break;
//		case 5:
//			System.out.println("当前是夏季");
//			break;
//		case 6:
//			System.out.println("当前是夏季");
//			break;
//		case 7:
//			System.out.println("当前是秋季");
//			break;
//		case 8:
//			System.out.println("当前是秋季");
//			break;
//		case 9:
//			System.out.println("当前是秋季");
//			break;
//		case 10:
//			System.out.println("当前是冬季");
//			break;
//		case 11:
//			System.out.println("当前是冬季");
//			break;
//		case 12:
//			System.out.println("当前是冬季");
//			break;
//		default:
//			System.out.println("输入月份错误");
//		}
//		System.out.println("选择正确答案 1+1=？");
//		System.out.println("A.1" + "     " + "B.2");
//		System.out.println("C.3" + "     " + "D.4");
//		@SuppressWarnings("resource")
//		Scanner sc = new Scanner(System.in);
//		String answer = sc.next();
//		switch (answer) {
//		case "A":
//			System.out.println("错误");
//			break;
//		case "B":
//			System.out.println("错误");
//			break;
//		case "c":
//			System.out.println("正确");
//			break;
//		case "D":
//			System.out.println("错误");
//			break;
//		}
//		for(int i=1;i<11;i++){
//			System.out.println(i);
//		}
//		//输出10以内数字的和
//		int K=0;
//		for(int i=10;i>0;i--){
//			K += i;
//			System.out.println(K);
//		}
		//输出100以内的偶数、奇数之和
//		int k=0;
//		int j=0;
//		for(int i=0;i<=100;i++){
//			if(i%2==0)
//			    k += i;
//			if(i%2!=0)
//				j += i;
//		}
//		System.out.println("偶数和"+k);
//		System.out.println("奇数和"+j);
		//输出三角形、菱形、九九乘法表
//		for(int i=0;i<8;i++){			//控制行数
//			System.out.println();		
//			for(int j=7;j>i;j--)		//控制左侧空格
//				System.out.print(" ");	
//			for(int j=0;j<=i;j++)		//因为空格，所以输出靠右的直角三角形
//				System.out.print("*");
//			for(int j=0;j<i;j++)		//输出右边
//				System.out.print("*");
//		}
		//输出九九乘法表
//		for(int i=1;i<=9;i++){
//			System.out.println();
//			for(int j=1;j<=i;j++)
//				System.out.print(j+"*"+i+"="+(i*j)+"\t");
//		}
		/*小芳的妈妈每天给她2.5元钱，她都会存起来，但是，每当这一天是存钱的第5天或者5的倍数的话，她都会花去6元钱，请问，经过多少天，小芳才可以存到100元钱。*/
//		int money = 0;
//		int day = 1;		    
//         while(true){
//        	 money += 2.5;
//        	 if(money>=100){
//        		 System.out.println("需要存"+day+"天");
//        		 break;
//        	 }
//        	 if(day%5==0){
//        		money -= 6;
//        	 }
//        	 day++;
//         }
		//获取两个整数中的最大值
//		int x = 123;
//		int y = 345;
//		int max = (x<y?x:y);// : 的作用？
//		System.out.println(max);
		
		//面试题：请问下面的代码哪个有问题?
//		short a = 1;
//		a = a+1;		//类型不匹配:不能从int转换为short
//		short s = 1;
//		s += s;
		//++,--的练习题		
		//第一题：
//		int a = 10;
//		int b = 10;
//		int c = 10;
//		//提示  a=a++ 先赋值再运算 ; a=++a 先运算再赋值
//		a = b++;// a=10,b=11,c=10
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		c = --a;// a=9,b=11,c=9
//		System.out.println("===========");
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		b = ++a;// a=10,b=10,c=9   
//		System.out.println("===========");
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		a = c--;// a=10,b=10,c=8
//		System.out.println("===========");
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
		
		int x = 4;
		int y = (x--)+(--x)+(x*10); //把 x 后的 --，全部给到第二个x的运算，第一个x不变，第二个x之后的x 都是2
		//4+6+60
		//x=5,6
		System.out.println("y:"+y);
		
		int a = 4;
		int b = (a++)+(a++)+(--a)+(a*10);//         4  6    50
		System.out.println(b);
	}
}
