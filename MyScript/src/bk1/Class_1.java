package bk1;
import java.util.Scanner;
import java.util.StringTokenizer;
public class Class_1 {

	@SuppressWarnings("resource")
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
		
//		int x = 4;
//		int y = (x--)+(--x)+(x*10); //把 x 后的 --，全部给到第二个x的运算，第一个x不变，第二个x之后的x 都是2
//		//4+6+60
//		//x=5,6
//		System.out.println("y:"+y);
//		
//		int a = 4;
//		int b = (a++)+(a++)+(--a)+(a*10);//         4  6    50
//		System.out.println(b);
		
		//获取两个整数中的最大值      （三目运算符）
//		int x = 100;
//		int y = 300;
//		int z = 250;
//		//int min = (x>y?y:x);
//		int min = (z>y)?((z>x)?z:x):((y>x)?y:x); //套用  x>y?x:y 模式， (x>y)？ 输出boolean值，ture输出x,false 输出y。
//		System.out.println(min);
		
		// |、&&、! 或、与、非        ||、&&、^  或、与、异或	逻辑运算符 
//		int x = 3;
//		int y = 4;
//		
//		//boolean b1 = ((x++ == 3) & (y++ == 4));// 4 5 true
//		//boolean b1 = ((x++ == 3) || (y++ == 4));// 4 4 true
//		boolean b1 = ((++x == 3) | (y++ == 4));// 4 5 true
//		//boolean b1 = ((++x == 3) && (y++ == 4));// 4 4 false
//		//boolean b1 = ((x-- == 3) || (y++ == 4)); // 2 4 true 
//		System.out.println("x:"+x);
//		System.out.println("y:"+y);
//		System.out.println(b1);
		
		//位运算符			以二进制进行运算， &: 有0则0；|：有1则1；^：相同则0，不同则1； ~：01互换
//		int a = 3;
//		int b = 4;
//		String c = Integer.toBinaryString(-4);
//		System.out.println(3 & 4);
//		System.out.println(3 | 4);
//		System.out.println(3 ^ 4);
//		System.out.println(~3);
//		System.out.println(c);
		
		//异或，不使用第三个变量，交换ab的值  +-/*  ^
		//
//		int a = 10;//01010
//		int b = 20;//10100
//		String c = Integer.toBinaryString(6);
//		System.out.println(c);
//		String d = Integer.toBinaryString(-24>>>2);
//		System.out.println(-24>>2);
//		a = a^b; //11110 
//		b = b^a; //01010 
//		a = a^b; //10101 
//		System.out.println(a+" "+b);

		
		//位运算符
		//	<<:左移	左边最高位丢弃，右边补齐0
		//>>:右移	最高位是0，左边补齐0；最高为是1，左边补齐1
		//>>>:无符号右移 无论最高位是0还是1，左边补齐0
		
		 /*
		键盘录入练习：
			键盘录入两个数据，并对这两个数据求和，输出其结果
		 */
//		Scanner sc1 = new Scanner(System.in);
//		int x = sc1.nextInt();
//		Scanner sc2 = new Scanner(System.in);
//		int y = sc2.nextInt();
//		x +=y;
//		System.out.println(x);
		
		/*
		练习：
			键盘录入三个数据，获取这三个数据中的最大值
			键盘录入两个数据，比较这两个数据是否相等
		 */
//		Scanner sc = new Scanner(System.in);
//		int a = sc.nextInt();

//		int b = sc.nextInt();

//		int c = sc.nextInt();
		
//		int max = (a>b)?(a>c?a:c):(b>c?b:c);
//		int min = (a<b)?(a<c?a:c):(b<c?b:c);
//		System.out.println("Max:"+max+"\n"+"Min:"+min);
		
//		int a = sc.nextInt();
//		int b = sc.nextInt();
//		boolean temp = (a==b);
//		System.out.println(temp);	
		
		/*
		if语句的注意事项：
			A:比较表达式无论简单还是复杂，结果必须是boolean类型
			B:if语句控制的语句体如果是一条语句，大括号可以省略；
			  如果是多条语句，就不能省略。建议永远不要省略。
			C:一般来说：有左大括号就没有分号，有分号就没有左大括号
	*/
//		int x =9;
//		
//		if(x==10){
//			System.out.println("x=10");
//		}
//		if(x==10|x>5){
//			System.out.println("x>5&x=10?");
//		}
		
//		int a = 100;
//		if(a != 100) {
//			System.out.println("a的值是100");
//			System.out.println("over");
//		}
//		System.out.println("-------------------");
//		
//		int b = 100;
//		if(b != 100);  
//		//这里其实是有语句体的，只不过是空语句体。
//		//代码块
//		{
//			System.out.println("b的值是100");
//			System.out.println("over");
//		}
		
		//if else 练习
//		int a = 10;
//		int b = 20;
//		
//		if(a==b){
//			System.out.println("yes");
//		}else{
//			System.out.println("no");
//		}
		/*
		由于if语句的第二种格式刚才也完成了三元运算符可以完成的效果。
		所以，我们就认为他们可以完成一样的操作。
		但是，他们就一点区别没有吗?肯定不是。
		
		区别：
			三元运算符实现的，都可以采用if语句实现。反之不成立。
			
			什么时候if语句实现不能用三元改进呢?
				当if语句控制的操作是一个输出语句的时候就不能。
				为什么呢?因为三元运算符是一个运算符，运算符操作完毕就应该有一个结果，而不是一个输出。
		 */
//		int x = 101;
//		//String s = (x%2 == 0)?System.out.println("100是一个偶数"):System.out.println("100是一个奇数");//三元运算符不能输出，只能产生结果
//		
//		if(x%2==0){
//			System.out.println("偶数");
//		}else{
//			System.out.println("奇数");
//		}
		
		//需求：键盘录入一个成绩，判断并输出成绩的等级。
		/*
			90-100 优秀
			80-90  好
			70-80  良
			60-70  及格
			0-60   不及格
		*/
//		Scanner sc = new Scanner(System.in);
//		System.out.println("成绩:");
//		int grade = sc.nextInt();
//		if(grade>90&&grade<100){
//			System.out.println("优秀");
//		}
//		if(grade>80&&grade<90){
//			System.out.println("良好");
//		}
//		if(grade>70&&grade<80){
//			System.out.println("一般");
//		}
//		if(grade>60&&grade<70){
//			System.out.println("及格");
//		}
//		if(grade>0&&grade<60){
//			System.out.println("不及格");
//		}else{
//			System.out.println("输入错误！");
//		}
		
		/*
		获取三个数据中的最大值
		
		由此案例主要是为了讲解if语句是可以嵌套使用的。而且是可以任意的嵌套。
		 */
//		int a = 10;
//		int b = 20;
//		int c = 30;
//		int max;
//		if(a>b){
//			if(a>c){
//				//System.out.println(a);
//				max = a;
//			}else{
//				//System.out.println(c);
//				max = c;
//			}
//		}else{
//			if(b>c){
//				//System.out.println(b);
//				max = b;
//			}else{
//				//System.out.println(c);
//				max = c;
//			}
//		}
//		System.out.println(max);
		byte by = (byte)300;
		System.out.println(by);
		
		String a = Integer.toBinaryString(130);
		System.out.println(a);
		
		String b = Integer.valueOf("101100",2).toString();
		System.out.println(b);
	}
}
