package bk1;
import java.util.Scanner;

public class Class_1 {
	public static void main(String[] args) {


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

		// default语句表示所有情况都不匹配的时候，就执行该处的内容，和if语句的else相似。
		// System.out.println("输入月份：");
		// @SuppressWarnings("resource")
		// Scanner sc = new Scanner(System.in);
		// int month = sc.nextInt();
		// switch (month) {
		// case 1:
		// System.out.println("当前是春季");
		// break;
		// case 2:
		// System.out.println("当前是春季");
		// break;
		// case 3:
		// System.out.println("当前是春季");
		// break;
		// case 4:
		// System.out.println("当前是夏季");
		// break;
		// case 5:
		// System.out.println("当前是夏季");
		// break;
		// case 6:
		// System.out.println("当前是夏季");
		// break;
		// case 7:
		// System.out.println("当前是秋季");
		// break;
		// case 8:
		// System.out.println("当前是秋季");
		// break;
		// case 9:
		// System.out.println("当前是秋季");
		// break;
		// case 10:
		// System.out.println("当前是冬季");
		// break;
		// case 11:
		// System.out.println("当前是冬季");
		// break;
		// case 12:
		// System.out.println("当前是冬季");
		// break;
		// default:
		// System.out.println("输入月份错误");
		// }
		// System.out.println("选择正确答案 1+1=？");
		// System.out.println("A.1" + " " + "B.2");
		// System.out.println("C.3" + " " + "D.4");
		// @SuppressWarnings("resource")
		// Scanner sc = new Scanner(System.in);
		// String answer = sc.next();
		// switch (answer) {
		// case "A":
		// System.out.println("错误");
		// break;
		// case "B":
		// System.out.println("错误");
		// break;
		// case "c":
		// System.out.println("正确");
		// break;
		// case "D":
		// System.out.println("错误");
		// break;
		// }
		// for(int i=1;i<11;i++){
		// System.out.println(i);
		// }
		// //输出10以内数字的和
		// int K=0;
		// for(int i=10;i>0;i--){
		// K += i;
		// System.out.println(K);
		// }
		// 输出100以内的偶数、奇数之和
		// int k=0;
		// int j=0;
		// for(int i=0;i<=100;i++){
		// if(i%2==0)
		// k += i;
		// if(i%2!=0)
		// j += i;
		// }
		// System.out.println("偶数和"+k);
		// System.out.println("奇数和"+j);
		// 输出三角形、菱形、九九乘法表
		// for(int i=0;i<8;i++){ //控制行数
		// System.out.println();
		// for(int j=7;j>i;j--) //控制左侧空格
		// System.out.print(" ");
		// for(int j=0;j<=i;j++) //因为空格，所以输出靠右的直角三角形
		// System.out.print("*");
		// for(int j=0;j<i;j++) //输出右边
		// System.out.print("*");
		// }
		// 输出九九乘法表
		// for(int i=1;i<=9;i++){
		// System.out.println();
		// for(int j=1;j<=i;j++)
		// System.out.print(j+"*"+i+"="+(i*j)+"\t");
		// }
		/*
		 * 小芳的妈妈每天给她2.5元钱，她都会存起来，但是，每当这一天是存钱的第5天或者5的倍数的话，她都会花去6元钱，请问，经过多少天，
		 * 小芳才可以存到100元钱。
		 */
		// int money = 0;
		// int day = 1;
		// while(true){
		// money += 2.5;
		// if(money>=100){
		// System.out.println("需要存"+day+"天");
		// System.out.println(money);
		// break;
		// }
		// if(day%5==0){
		// money -= 6;
		// }
		// day++;
		// }
		// 获取两个整数中的最大值
		// int x = 123;
		// int y = 345;
		// int max = (x<y?x:y);// : 的作用？
		// System.out.println(max);

		// 面试题：请问下面的代码哪个有问题?
		// short a = 1;
		// a = a+1; //类型不匹配:不能从int转换为short
		// short s = 1;
		// s += s;
		// ++,--的练习题
		// 第一题：
		// int a = 10;
		// int b = 10;
		// int c = 10;
		// //提示 a=a++ 先赋值再运算 ; a=++a 先运算再赋值
		// a = b++;// a=10,b=11,c=10
		// System.out.println(a);
		// System.out.println(b);
		// System.out.println(c);
		// c = --a;// a=9,b=11,c=9
		// System.out.println("===========");
		// System.out.println(a);
		// System.out.println(b);
		// System.out.println(c);
		// b = ++a;// a=10,b=10,c=9
		// System.out.println("===========");
		// System.out.println(a);
		// System.out.println(b);
		// System.out.println(c);
		// a = c--;// a=10,b=10,c=8
		// System.out.println("===========");
		// System.out.println(a);
		// System.out.println(b);
		// System.out.println(c);

		// int x = 4;
		// int y = (x--)+(--x)+(x*10); //把 x 后的 --，全部给到第二个x的运算，第一个x不变，第二个x之后的x
		// 都是2
		// //4+6+60
		// //x=5,6
		// System.out.println("y:"+y);
		//
		// int a = 4;
		// int b = (a++)+(a++)+(--a)+(a*10);// 4 6 50
		// System.out.println(b);

		// 获取两个整数中的最大值 （三目运算符）
		// int x = 100;
		// int y = 300;
		// int z = 250;
		// //int min = (x>y?y:x);
		// int min = (z>y)?((z>x)?z:x):((y>x)?y:x); //套用 x>y?x:y 模式， (x>y)？
		// 输出boolean值，ture输出x,false 输出y。
		// System.out.println(min);

		// |、&&、! 或、与、非 ||、&&、^ 或、与、异或 逻辑运算符
		// int x = 3;
		// int y = 4;
		//
		// //boolean b1 = ((x++ == 3) & (y++ == 4));// 4 5 true
		// //boolean b1 = ((x++ == 3) || (y++ == 4));// 4 4 true
		// boolean b1 = ((++x == 3) | (y++ == 4));// 4 5 true
		// //boolean b1 = ((++x == 3) && (y++ == 4));// 4 4 false
		// //boolean b1 = ((x-- == 3) || (y++ == 4)); // 2 4 true
		// System.out.println("x:"+x);
		// System.out.println("y:"+y);
		// System.out.println(b1);

		// 位运算符 以二进制进行运算， &: 有0则0；|：有1则1；^：相同则0，不同则1； ~：01互换
		// int a = 3;
		// int b = 4;
		// String c = Integer.toBinaryString(-4);
		// System.out.println(3 & 4);
		// System.out.println(3 | 4);
		// System.out.println(3 ^ 4);
		// System.out.println(~3);
		// System.out.println(c);

		// 异或，不使用第三个变量，交换ab的值 +-/* ^
		//
		// int a = 10;//01010
		// int b = 20;//10100
		// String c = Integer.toBinaryString(6);
		// System.out.println(c);
		// String d = Integer.toBinaryString(-24>>>2);
		// System.out.println(-24>>2);
		// a = a^b; //11110
		// b = a^b; //01010
		// a = a^b; //10101
		// System.out.println(a+" "+b);

		// 位运算符
		// <<:左移 左边最高位丢弃，右边补齐0
		// >>:右移 最高位是0，左边补齐0；最高为是1，左边补齐1
		// >>>:无符号右移 无论最高位是0还是1，左边补齐0

		/*
		 * 键盘录入练习： 键盘录入两个数据，并对这两个数据求和，输出其结果
		 */
		// Scanner sc1 = new Scanner(System.in);
		// int x = sc1.nextInt();
		// Scanner sc2 = new Scanner(System.in);
		// int y = sc2.nextInt();
		// x +=y;
		// System.out.println(x);

		/*
		 * 练习： 键盘录入三个数据，获取这三个数据中的最大值 键盘录入两个数据，比较这两个数据是否相等
		 */
		// Scanner sc = new Scanner(System.in);
		// int a = sc.nextInt();

		// int b = sc.nextInt();

		// int c = sc.nextInt();

		// int max = (a>b)?(a>c?a:c):(b>c?b:c);
		// int min = (a<b)?(a<c?a:c):(b<c?b:c);
		// System.out.println("Max:"+max+"\n"+"Min:"+min);

		// int a = sc.nextInt();
		// int b = sc.nextInt();
		// boolean temp = (a==b);
		// System.out.println(temp);

		/*
		 * if语句的注意事项： A:比较表达式无论简单还是复杂，结果必须是boolean类型
		 * B:if语句控制的语句体如果是一条语句，大括号可以省略； 如果是多条语句，就不能省略。建议永远不要省略。
		 * C:一般来说：有左大括号就没有分号，有分号就没有左大括号
		 */
		// int x =9;
		//
		// if(x==10){
		// System.out.println("x=10");
		// }
		// if(x==10|x>5){
		// System.out.println("x>5&x=10?");
		// }

		// int a = 100;
		// if(a != 100) {
		// System.out.println("a的值是100");
		// System.out.println("over");
		// }
		// System.out.println("-------------------");
		//
		// int b = 100;
		// if(b != 100);
		// //这里其实是有语句体的，只不过是空语句体。
		// //代码块
		// {
		// System.out.println("b的值是100");
		// System.out.println("over");
		// }

		// if else 练习
		// int a = 10;
		// int b = 20;
		//
		// if(a==b){
		// System.out.println("yes");
		// }else{
		// System.out.println("no");
		// }
		/*
		 * 由于if语句的第二种格式刚才也完成了三元运算符可以完成的效果。 所以，我们就认为他们可以完成一样的操作。
		 * 但是，他们就一点区别没有吗?肯定不是。
		 * 
		 * 区别： 三元运算符实现的，都可以采用if语句实现。反之不成立。
		 * 
		 * 什么时候if语句实现不能用三元改进呢? 当if语句控制的操作是一个输出语句的时候就不能。
		 * 为什么呢?因为三元运算符是一个运算符，运算符操作完毕就应该有一个结果，而不是一个输出。
		 */
		// int x = 101;
		// //String s = (x%2 ==
		// 0)?System.out.println("100是一个偶数"):System.out.println("100是一个奇数");//三元运算符不能输出，只能产生结果
		//
		// if(x%2==0){
		// System.out.println("偶数");
		// }else{
		// System.out.println("奇数");
		// }

		// 需求：键盘录入一个成绩，判断并输出成绩的等级。
		/*
		 * 90-100 优秀 80-90 好 70-80 良 60-70 及格 0-60 不及格
		 */
		// Scanner sc = new Scanner(System.in);
		// System.out.println("成绩:");
		// int grade = sc.nextInt();
		// if(grade>90&&grade<100){
		// System.out.println("优秀");
		// }
		// if(grade>80&&grade<90){
		// System.out.println("良好");
		// }
		// if(grade>70&&grade<80){
		// System.out.println("一般");
		// }
		// if(grade>60&&grade<70){
		// System.out.println("及格");
		// }
		// if(grade>0&&grade<60){
		// System.out.println("不及格");
		// }else{
		// System.out.println("输入错误！");
		// }

		/*
		 * 获取三个数据中的最大值
		 * 
		 * 由此案例主要是为了讲解if语句是可以嵌套使用的。而且是可以任意的嵌套。
		 */
		// int a = 10;
		// int b = 20;
		// int c = 30;
		// int max;
		// if(a>b){
		// if(a>c){
		// //System.out.println(a);
		// max = a;
		// }else{
		// //System.out.println(c);
		// max = c;
		// }
		// }else{
		// if(b>c){
		// //System.out.println(b);
		// max = b;
		// }else{
		// //System.out.println(c);
		// max = c;
		// }
		// }
		// System.out.println(max);
		// byte by = (byte)300;
		// System.out.println(by);
		//
		// String a = Integer.toBinaryString(~6);
		// System.out.println(a);
		//
		// String b = Integer.valueOf("111",2).toString();
		// System.out.println(b);
		//
		// int c = 4,d=4;
		// System.out.println(c==d?true:false);

		// boolean b = true;
		//
		// if(b==false)
		// System.out.println("a");
		// else if(b)
		// System.out.println("b");
		// else if(!b)
		// System.out.println("c");
		// else
		// System.out.println("d");
		// //b
		/*
		 * 13:编写代码实现如下内容：if语句实现 考试成绩分等级。 90~100 A等。 80-89 B等。 70-79 C等。 60-69
		 * D等。 60以下 E等。 请根据给定成绩，输出对应的等级。
		 */
		// Scanner sc = new Scanner(System.in);
		// int grade = sc.nextInt();
		// if(grade>100|grade<0){
		// System.out.println("输入错误！");
		// }else if(grade>=90){
		// System.out.println("A");
		// }else if(grade>=80&grade<90){
		// System.out.println("B");
		// }else if(grade>=70&grade<80){
		// System.out.println("C");
		// }else if(grade>=60&grade<70){
		// System.out.println("D");
		// }else{
		// System.out.println("E");
		// }

		// System.out.println("5+5="+5+5);
		// System.out.println(5+5+"=5+5");

		// java_04
		// WEEK，输出星期几
		// Scanner sc =new Scanner(System.in);
		// byte a = sc.nextByte();
		// switch(a){
		// case 1:
		// System.out.println("Monday");
		// break;
		// case 2:
		// System.out.println("Tuesday");
		// break;
		// case 3:
		// System.out.println("Wednesday");
		// break;
		// case 4:
		// System.out.println("Thursday");
		// break;
		// case 5:
		// System.out.println("Friday");
		// break;
		// case 6:
		// System.out.println("Saturday");
		// break;
		// case 7:
		// System.out.println("Sunday");
		// break;
		// case 8:
		// System.out.println("Funday");
		// break;
		// default:
		// System.out.println("输入错误！");
		// break;
		// }

		/*
		 * 看程序写结果
		 */
		// int x = 2;
		// int y = 3;
		// switch(x){
		// default:
		// y++;
		// break;
		// case 3:
		// y++;
		// case 4:
		// y++;
		// }
		// System.out.println("y="+y);//4
		// System.out.println("---------------");
		//
		// int a = 2;
		// int b = 3;
		// switch(a){
		// default:
		// b++;
		// case 3:
		// b++;
		// case 4:
		// b++;
		// }
		// System.out.println("b="+b);//6

		// 选择题
		// System.out.println("下面的几个人你最爱谁?");
		// System.out.println("68 王力宏");
		// System.out.println("65 林青霞");
		// System.out.println("66 张曼玉");
		// System.out.println("67 刘德华");
		//
		// /* Ascii码对照
		// 0100 0001 65 41 A
		// 0100 0010 66 42 B
		// 0100 0011 67 43 C
		// 0100 0100 68 44 D
		// */
		// //键盘录入选择的数据。
		// Scanner sc = new Scanner(System.in);
		//
		// System.out.println("请输入你的选择：");
		// int choiceNumber = sc.nextInt();
		//
		// //强制转换为字符类型
		// char choice = (char) choiceNumber;
		//
		// switch(choice) {
		// case 'A':
		// System.out.println("恭喜你,选择正确");
		// break;
		// case 'B':
		// System.out.println("不好意思，你选择有误");
		// break;
		// case 'C':
		// System.out.println("不好意思，你选择有误");
		// break;
		// case 'D':
		// System.out.println("不好意思，你选择有误");
		// break;
		// default:
		// System.out.println("没有该选项");
		// break;
		// }

		// 创建键盘录入对象
		// Scanner sc = new Scanner(System.in);
		//
		// //录入数据
		// System.out.println("请输入月份(1-12)：");
		// int month = sc.nextInt();
		// //这样写太麻烦了，我们使用一个我们不想使用的东西：case穿透
		// switch(month) {
		// case 1:
		// case 2:
		// case 12:
		// System.out.println("冬季");
		// break;
		// case 3:
		// case 4:
		// case 5:
		// System.out.println("春季");
		// break;
		// case 6:
		// case 7:
		// case 8:
		// System.out.println("夏季");
		// break;
		// case 9:
		// case 10:
		// case 11:
		// System.out.println("秋季");
		// break;
		// default:
		// System.out.println("你输入的月份有误");
		// }
		/*
		 * 需求：求出1-10之间数据之和
		 */
		// int sum = 0;
		// for(int x=0;x<=10;x++){
		// sum += x;
		// }
		// System.out.println(sum);
		//
		// /*求100之间奇数或偶数的和*/
		// int sum1=0;
		// for(int x=0;x<=100;x+=2){
		// sum1 +=x;
		// }
		// System.out.println(sum1);
		//
		// int sum2=0;
		// for(int x=0;x<=100;x++){
		// if(x%2==0){
		// sum2 +=x;
		// }
		// }
		// System.out.println(sum2);

		/* 需求：求5的阶乘。 */
		// int sum=1;
		// for(int x=1;x<=5;x++){
		// sum *= x;
		// }
		// System.out.println(sum);
		// System.out.println(1*2*3*4*5);

		/* 需求：在控制台输出所有的”水仙花数” */
		// int sum = 0;
		// for(int x=100;x<=999;x++){
		// int ge = x%10;
		// int shi= x/10%10;
		// int bai= x/100%10;
		// if((ge*ge*ge)+(shi*shi*shi)+(bai*bai*bai)==x){
		// System.out.println(x);
		// sum ++;
		// }
		// }
		// System.out.println("水仙花有"+sum);
		/*
		 * 练习： 请在控制台输出满足如下条件的五位数 个位等于万位 十位等于千位 个位+十位+千位+万位=百位
		 */
		// for(int x=10000;x<=99999;x++){
		// int g = x%10;
		// int s = x/10%10;
		// int b = x/100%10;
		// int q = x/1000%10;
		// int w = x/10000%10;
		// if(g==w&s==q&g+s+q+w==b){
		// System.out.println(x);
		// }
		// }
		/*
		 * 需求：请统计1-1000之间同时满足如下条件的数据有多少个： 对3整除余2 对5整除余3 对7整除余2
		 */
		// for(int x=1;x<=1000;x++){
		// if(x%3==2&x%5==3&x%7==2){
		// System.out.println(x);
		// }
		// }

		// Scanner sc = new Scanner(System.in);
		// byte day = sc.nextByte();
		//
		// if(day>7|day<1){
		// System.out.println("输入错误！");
		// }else if(day==1){
		// System.out.println("Monday");
		// }else if(day==2){
		// System.out.println("Tuesday");
		// }else if(day==3){
		// System.out.println("Wednesday");
		// }else if(day==4){
		// System.out.println("Thursday");
		// }else if(day==5){
		// System.out.println("Friday");
		// }else if(day==6){
		// System.out.println("Saturday");
		// }else{
		// System.out.println("Sunday");
		// }

		/*
		 * while 循环联系 输出三角形、倒三角、菱形、九九乘法表
		 */
		// for(int i=0;i<8;i++){ //控制行数
		// System.out.println();
		// for(int j=7;j>i;j--) //控制左侧空格
		// System.out.print("&");
		// for(int j=0;j<=i;j++) //因为空格，所以输出靠右的直角三角形
		// System.out.print("*");
		// for(int j=0;j<i;j++) //输出右边
		// System.out.print("*");
		// }
		// 用while 输出等腰三角形、菱形，done!

		// int h=0;
		// while(h<6){
		// h++;
		// System.out.println();
		//
		// int e=7;
		// while(e>h){
		// e--;
		// System.out.print(" ");
		// }
		// int f=1;
		// while(f<h){
		// f++;
		// System.out.print("*");
		// }
		// int g=0;
		// while(g<h){
		// g++;
		// System.out.print("*");
		// }
		// }
		//
		// int a=0;
		// while(a<6){
		// a++;
		// System.out.println();
		//
		// int b=0;
		// while(b<a){
		// b++;
		// System.out.print(" ");
		// }
		// int c=6;
		// while(c>a){
		// c--;
		// System.out.print("*");
		// }
		// int d=7;
		// while(d>a){
		// d--;
		// System.out.print("*");
		// }
		// }
		// While 输出 99乘法表，Done
		// int x=0;
		// while(x<9){
		// x++;
		// System.out.println();
		//
		// int y=0;
		// while(y<x){
		// y++;
		// System.out.print(x+"*"+y+"="+(x*y)+"\t");
		// }
		// }

		// 如何让控制台输出2次：Java基础班
		// 如何让控制台输出7次：Java基础班
		// 如何让控制台输出13次：Java基础班
		// for(int x=1; x<=10; x++) {
		// if(x%3 == 0) {
		// //break; == return;
		// //continue;
		// //System.out.println("What's up!Dude!");//补齐代码
		//
		// }
		// System.out.println("What's up!Dude!"+x%3);
		// }

		// 纸张折叠成珠穆朗玛峰高度的次数
		// 我国最高山峰是珠穆朗玛峰：8848m，
		// 我现在有一张足够大的纸张，厚度为：0.01m。
		// 请问，我折叠多少次，就可以保证厚度不低于珠穆朗玛峰的高度?
		// double x=0.01;
		// int sum=0;
		// do{
		// x *= 2;
		// sum +=1;
		// }while(x<8848);
		// System.out.println(sum);
		// System.out.println(x);

		// break 练习
		// for(int x = 0;x<10;x++){
		// if(x==3)
		// break;
		// System.out.println("Be cool! bro.");
		// }

		// 循环标签，break
		// wc:for(int x=0;x<3;x++){ //for 循环前加标签，便于流程控制 break,continue
		// nc:for(int y=0;y<4;y++){
		// if(y==2){
		// //break nc;
		// break wc;
		// }
		// System.out.println("*");
		// }
		// System.out.println();
		// }

		// 小芳存钱 2.0 这一百块真TM难存
		// int money=0;
		// int day = 0;
		// int count=0;
		// while(true){
		// day++;
		// money += 2.5;
		//
		// if(day%5==0)
		// {
		// money -= 6;
		// count++;
		// }
		// else if(money==100)
		// {
		// System.out.println("天数："+day);
		// System.out.println(money);
		// System.out.println(count);
		// break;
		// }
		// }

		// Java_05,方法
		// Scanner sc =new Scanner(System.in);
		// System.out.println("请输入乘法表行数：");
		// int n = sc.nextInt();
		//
		// int x = 10, y = 20,z = 22;
		// byte a = 3,b=4;
		// long c = 656461616,d = 569466322;
		// String e = "我",f = "我";
		//
		// //两个数求和 //赋值调用
		// int result = Sum(x, y);
		// System.out.println(result);
		// //三个数求和，重载：A:参数个数不同 B:参数类型不同 输出调用
		// System.out.println(Sum(x,y,z));
		// //两个数取最大值
		// System.out.println(Max(x,y));
		// //三个数取最大值
		// System.out.println(Max(x,y,z));
		// //乘法表
		// //System.out.println(TimesTable(n));
		// TimesTable(n);
		// //比较变量是否相等
		// System.out.println(Compare(x,y));
		// System.out.println(Compare(a, b));
		// System.out.println(Compare(c, d));
		// System.out.println(Compare(e, f));
		//
		// printer(5, 10);
		// System.out.println("======================");

		// Java_05,数组
		/*
		 * 定义一个数组，输出该数组的名称和数组元素值。 给数组元素赋值，再次输出该数组的名称和数组元素值。
		 */

		// int [] arr;
		// arr = new int[3];
		// arr[0]=100;
		// arr[1]=200;
		// arr[2]=300;
		// System.out.println(arr);
		// System.out.println(arr[0]);
		// System.out.println(arr[1]);
		// System.out.println(arr[2]);

		/*
		 * 定义两个数组，分别输出两个数组各自的数组名及元素值。 然后给每个数组的元素重新赋值，再次分别输出两个数组各自的数组名及元素值。
		 */
		// int [] arr1 = new int[1];
		// int [] arr2 = new int[1];
		// System.out.print(arr1);
		// System.out.println(" :"+arr1[0]);
		// System.out.print(arr2);
		// System.out.println(" :"+arr2[0]);
		//
		// arr1[0] = 22;
		// arr2[0] = 584;
		// System.out.print(arr1);
		// System.out.println(" :"+arr1[0]);
		// System.out.print(arr2);
		// System.out.println(" :"+arr2[0]);

		/*
		 * 定义第一个数组,定义完毕后，给数组元素赋值。赋值完毕后，在输出数组名称和元素。
		 * 定义第二个数组,定义完毕后，给数组元素赋值。赋值完毕后，在输出数组名称和元素。
		 * 定义第三个数组,把第一个数组的地址值赋值给它。(注意类型一致)，通过第三个数组的名称去把元素重复赋值。
		 * 最后，再次输出第一个数组数组名称和元素。
		 */

		// int [] arr1,arr2,arr3;
		// arr1 = new int[3]; arr1[0] = 11; arr1[1] = 12; arr1[2] = 13;
		// System.out.println(arr1);
		// System.out.println(arr1[0]);
		// System.out.println(arr1[1]);
		// System.out.println(arr1[2]);
		//
		// arr2 = new int[3]; arr2[0] = 14; arr2[1] = 15; arr2[2] = 16;
		// System.out.println(arr2);
		// System.out.println(arr2[0]);
		// System.out.println(arr2[1]);
		// System.out.println(arr2[2]);
		//
		// arr3 = new int[3]; arr3[0] = arr1[0]; arr3[1] = arr1[1]; arr3[2] =
		// arr1[2];
		// System.out.println(arr3);
		// System.out.println(arr3[0]);
		// System.out.println(arr3[1]);
		// System.out.println(arr3[2]);
		//
		// System.out.println("==============================================");
		// System.out.println(arr1);
		// System.out.println(arr1[0]);
		// System.out.println(arr1[1]);
		// System.out.println(arr1[2]);

		/*
		 * 数组的静态初始化： 格式：数据类型[] 数组名 = new 数据类型[]{元素1,元素2,…}; 简化格式： 数据类型[] 数组名 =
		 * {元素1,元素2,…};
		 * 
		 * 举例： int[] arr = new int[]{1,2,3};
		 * 
		 * 简化后：
		 * 
		 * int[] arr = {1,2,3};
		 * 
		 * 注意事项： 不要同时动态和静态进行。 如下格式： int[] arr = new int[3]{1,2,3}; //错误
		 */

		// int arr[] = {1,2,3,5};
		// System.out.println(arr);
		// for(int x=0;x<arr.length;x++){
		// System.out.println(arr[x]);
		// }

		/*
		 * 数组操作的两个常见小问题： ArrayIndexOutOfBoundsException:数组索引越界异常 原因：你访问了不存在的索引。
		 * 
		 * NullPointerException:空指针异常 原因：数组已经不在指向堆内存了。而你还用数组名去访问元素。
		 * 
		 * 作用：请自己把所有的场景Exception结尾的问题总结一下。以后遇到就记录下来。 现象，原因，解决方案。
		 */

		// int [] arr = new int[3];
		// //System.out.println(arr[3]);//ArrayIndexOutOfBoundsException:数组索引越界异常,原因：你访问了不存在的索引。
		//
		// int [] arr1 = null;
		// System.out.println(arr1[0]);//NullPointerException:空指针异常

		// 遍历数组方法测试
//		int[] arr = { 1, 2, 3, 4, 5, 6, 88, 7, 99, 21, 234, 235, 1, 342, 45, 356 };
//		String[] Sarr = { "甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "任", "癸" };
		// PrintArray(arr);
		// //数组最大值
		// ArryMax(arr);
		// //数组最小值
		// ArryMin(arr);
		// //逆序
		// ArryReverse(arr);
		// ArryReverse(Sarr);
		// //查询星期几
		// ArryChek(6);

		// 查询相同数据下标
		// int a = ArryEqual(234,arr);
		// int b = ArryEqual(arr,45);
		// System.out.println(b);
		// System.out.println(arr[b]);

		/*java_06
		 * 二维数组：就是元素为一维数组的一个数组。
		 * 
		 * 格式1： 数据类型[][] 数组名 = new 数据类型[m][n];
		 * 
		 * m:表示这个二维数组有多少个一维数组。 n:表示每一个一维数组的元素有多少个。
		 * 
		 * 注意： A:以下格式也可以表示二维数组 a:数据类型 数组名[][] = new 数据类型[m][n]; b:数据类型[] 数组名[] =
		 * new 数据类型[m][n]; B:注意下面定义的区别 int x; int y; int x,y;
		 * 
		 * int[] x; int[] y[];
		 * 
		 * int[] x,y[];
		 */
//		int [][] arr = new int [2][2];
//		System.out.println(arr);
//		System.out.println(arr[0]);
//		System.out.println(arr[1]);
//		System.out.println(arr[0][0]);
		
		//二维数组，简化格式
//		int [][] arr1 = {{1,2,3},{4,5,6},{7,8,9},{10,11,12},{56,85,46,100}};
		
		//二维数组遍历
//		for (int i = 0; i < arr1[0].length; i++) {
//			System.out.print(arr1[0][i]+" ");
//		}
		//改进,可写成方法
//		for (int i = 0; i < arr1.length; i++) {
//			for (int j = 0; j < arr1[i].length; j++) {
//				System.out.print(arr1[i][j]+" ");
//			}
//		}
		
		//二维数组求和方法
//		DyadicArrySum(arr1);
		
		/*

		需求：打印杨辉三角形(行数可以键盘录入)
		
		1
		1 1	
		1 2 1
		1 3 3 1
		1 4 6 4 1 
		1 5 10 10 5 1

		分析：看这种图像的规律
			A:任何一行的第一列和最后一列都是1
			B:从第三行开始，每一个数据是它上一行的前一列和它上一行的本列之和。
		
		步骤：
			A:首先定义一个二维数组。行数如果是n，我们把列数也先定义为n。
			  这个n的数据来自于键盘录入。
			B:给这个二维数组任何一行的第一列和最后一列赋值为1
			C:按照规律给其他元素赋值
				从第三行开始，每一个数据是它上一行的前一列和它上一行的本列之和。
			D:遍历这个二维数组。
	*/
		
		//等腰杨辉三角
//		Scanner sc = new Scanner(System.in);
//		System.out.println("行数：");
//		int n = sc.nextInt();
//		int [][] arr = new int[n][];
//		for (int i = 0; i < arr.length; i++) {
//			//给每一行数组定义长度，即定义一维数组的长度，i=0,所以 i+1，如果没有这一步，将报超出范围错误
//			arr[i] = new int[i+1];
//			
//			for (int j = 1; j < arr.length-i; j++) {
//				System.out.printf("  ");
//			}
//			//遍历数组，给储存空间赋值
//			for (int j = 0; j < arr[i].length; j++) {
//				if(j==0||j==arr[i].length-1){
//					arr[i][j] = 1;
//				}else{
//					arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
//				}
//				System.out.printf("%4d",arr[i][j]);	
//			}	
//			System.out.println();
//		}
		

		
		
		
//		 //定义二维数组的长度
//        int length = 10;
//        //声明二维数组
//        int[][] arr = new int[length][];
//        //遍历二维数组
//        for(int i = 0; i < arr.length; i++){
//            //给每个二维数据的元素赋值一维数组
//            arr[i] = new int[i+1];
//            //换行
//            System.out.println();  
//            //打印空格
//            for(int m = 0; m < arr.length - 1 - i; m++){
//                System.out.print("  ");
//            }
//        
//            //遍历一维数组
//            for(int j = 0; j < arr[i].length; j++){
//                //第一个元素和最后一个元素的值都是1
//                if( j == 0 || j == arr[i].length -1 ){
//                    arr[i][j] = 1;
//                }else{
//                    //当前一维数组的索引n元素的值，等于前一个数组索引n-1，加上索引n的值
//                    arr[i][j] = arr[i -1][j - 1] + arr[i - 1][j];
//                }
//                //格式化输出元素值
//                System.out.printf("%4d",arr[i][j]);
//            }
//        }
		
		
		
		/*
		某个公司采用公用电话传递数据信息，数据是小于8位的整数，为了确保安全，
		在传递过程中需要加密，加密规则如下：
			首先将数据倒序，然后将每位数字都加上5，再用和除以10的余数代替该数字，
			最后将第一位和最后一位数字交换。 请任意给定一个小于8位的整数，
			然后，把加密后的结果在控制台打印出来。 
			*/
//		Scanner sc = new Scanner(System.in);
//		System.out.println("请输入八位整数：");
//		int receive = sc.nextInt();
//		int [] arr = new int[8];
//		int index = 0;
//		while(receive>0&receive<=8){
//			arr[index] = receive%10;//从个位开始录入数据，完成倒序和录入数组
//			index++;
//			receive /= 10;//每次循环进一位，个、十、百、千、万、、、、
//			
//		}
//		System.out.println("------------------录入数据");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]);
//		}
//		//每位数字都加上5
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] += 5;
//			arr[i] %= 10;
//		}
//		//首尾交换
//		int temp = arr[0];
//		arr[0] = arr[index-1]; //index-1,从0开始自增，到7时遍历完成，但仍会再执行一次自增，所以 -1，直接写arr[7]报超出错误
//		arr[index-1] = temp;
//		
//		System.out.println();
//		System.out.println("------------------加密成功");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]);
//		}
		
		//破解
//		Crack(arr);
		
		
		//Java中的参数传递问题：
//		    int a = 10;
//	        int b = 20;
//	        System.out.println(" 基本类型：形式参数的改变对实际参数没有影响。//int byte short long  /char /double ");
//	        System.out.println("First：a:"+a+",b:"+b); //a:10,b:20
//	        change(a,b);
//	        System.out.println("End：a:"+a+",b:"+b); //???    a:10,b:20
//
//	        System.out.println("");
//	        
//	        System.out.println("引用类型：形式参数的改变直接影响实际参数。//class int[] interface");
//	        int[] arr = {1,2,3,4,5};
//	        System.out.println("First:"+arr[3]);
//	        change(arr);
//	        System.out.println("End:"+arr[3]); //???    4
//	    }
//
//	    public static void change(int a,int b) { //a=10,b=20
//	        System.out.println("C1：a:"+a+",b:"+b); //a:10,b:20
//	        a = b;    //a=20
//	        b = a + b; //b=40
//	        System.out.println("C2：a:"+a+",b:"+b); //a:20,b:40
//	    }
//
//	    public static void change(int[] arr) { //arr={1,2,3,4,5};
//	    	System.out.println("C1:"+arr[3]);
//	        for(int x=0; x<arr.length; x++) {
//	            if(arr[x]%2==0) {
//	                arr[x]*=2;
//	            }
//	        }
//	        System.out.println("C2:"+arr[3]);
//	        //arr={1,4,3,8,5};
//    }
		
		//PhoneTest,面向对象 Java_06_03 
//		Phone c = new Phone();
//		//输出属性
//		System.out.print(c.brand+" "+c.color+" "+c.price);
//		//调用方法
//		System.out.println(" ");
//		c.Call();
//		c.Message();
//		
//		//Student 测试，
//		Student st = new Student();
//		System.out.println(st.getName());
//		System.out.println(st.getAge());
//		System.out.println(st.getAddress());
//		st.Study();
//		st.Eat();
//		st.Sleep();
//		
//		//参数名是类名test, st 是学生类引用参数
//		c.Game(st);
		
		
		
		//Java_07,成员变量、局部变量， 
		//Variable v = new Variable();
		//System.out.println(v.num);
		//v.show();
		
		/*
		匿名对象：就是没有名字的对象。
		
		匿名对象的应用场景：
			A:调用方法，仅仅只调用一次的时候。
				注意：调用多次的时候，不适合。
				那么，这种匿名调用有什么好处吗?
					有，匿名对象调用完毕就是垃圾。可以被垃圾回收器回收。
			B:匿名对象可以作为实际参数传递
		 */
		//匿名即省略    Class  c = new Class(); 这一步，直接 new 一个 Class 对象
		//匿名对象
//		new Phone();
//		//匿名对象调用方法
//		new Student().Eat();
//		//匿名对象座位实际参数传递
//		new Phone().Game(new Student());
		
		//封装和Private关键字
		//测试学生类
//		Student s = new Student();
//		System.out.println(s.getName());
//		s.setName("王境泽");
//		System.out.println(s.getName());
//		
//		// 创建一个对象，先通过getXxx()方法输出成员变量的值。这一次的结果是：null---0---null
//		// 然后通过setXxx()方法给成员变量赋值。再次输出结果。这一次的结果是：三星---2999---土豪金
//		Phone p = new Phone();
//		System.out.println(p.getBrand()+" "+p.getColor()+" "+p.getPrice());
//		p.setBrand("三星");
//		p.setColor("红色");
//		p.setPrice(3666);
//		System.out.println(p.getBrand()+" "+p.getColor()+" "+p.getPrice());
		
		//测试 Student 的构造方法
//		Student st = new Student();
//		System.out.println(st);	
//		//多参数构造方法，简化对象实例化
//		Student st1 = new Student("江南",19,"北京XXX小区");
//		st1.Show();
		
		//Staff 类测试   (姓名，年龄，工号),面向对象，
//		Staff st = new Staff("手岛葵",35,1);
//		st.show();
//		
//		Phone p = new Phone();
//		p.Math();
//		People pe = new People(18,"女","董静丹");
//		pe.show();
//		Student st = new Student();
//		st.setAge(18);
//		st.setSex("男");
//		st.setName("陈独秀");
//		System.out.println(st.age+st.sex+st.name);
		
//		String a = Integer.toBinaryString(25);
//		System.out.println(a);
		
		/*Java_09 多态
		 * 
		 * 多态中的成员访问特点：
		A:成员变量
			编译看左边，运行看左边。
		B:构造方法
			创建子类对象的时候，访问父类的构造方法，对父类的数据进行初始化。
		C:成员方法
			编译看左边，运行看右边。
			（由于成员方法存在方法重写，所以它运行看右边。）
		D:静态方法
			编译看左边，运行看左边。
			(静态和类相关，算不上重写，所以，访问还是左边的)
		 * */
		
//		People p = new Student();
//		p.eat();	//输出子类得 eat 方法
//		System.out.println(p.age);	//输出父类的 age 25
		
		/*多态应用
		 * */
//		Student s = new Student();
//		Variable.StudentTool(s);//简化（整合）调用过程
//		
//		Staff a = new Staff("Chill", 18, 1);
//		Variable.StaffTool(a);
		
		/*
		多态的弊端：
			不能使用子类的特有功能。
	*/
//		People p = new Student();
//		p.eat();
		//p.Study();//指向子类的父类对象，无法调用子类方法		
		
		/*可以将父类对象强转为子类对象
		 * */
		
//		People p = new Student();//引用P对象，实例化Student对象
//		Student s = (Student)p;
//		p.eat();
//		s.eat();
//		s.Study();
		
		//抽象类不能被实例化,上面的实例化对象是 Student,引用了People
		//People r = new People();
		
		//final 引用类型和基本类型测试
		//基本类型
//		final int age = 10;
//		//age = 20;
//		//引用类型
//		Student s = new Student();
//		System.out.println(s.age);
//		s.setAge(100);
//		System.out.println(s.age);
		
	}
	
		

	/*
	 * 方法：完成特定功能的代码块。
	 * 
	 * 注意：在很多语言里面有函数的定义，而在Java中函数被称为方法。
	 * 
	 * 方法格式： 修饰符 返回值类型 方法名(参数类型 参数名1,参数类型 参数名2...) { 方法体语句; return 返回值; } 详细解释：
	 * 修饰符：目前就用 public static。后面我们再详细的讲解其他的修饰符。 返回值类型：就是功能结果的数据类型。
	 * 方法名：符合命名规则即可。方便我们的调用。 参数： 实际参数：就是实际参与运算的。 形式参数；就是方法定义上的，用于接收实际参数的。
	 * 参数类型：就是参数的数据类型 参数名：就是变量名 方法体语句：就是完成功能的代码。 return：结束方法的。
	 * 返回值：就是功能的结果，由return带给调用者。
	 * 
	 * 要想写好一个方法，就必须明确两个东西： A:返回值类型 结果的数据类型 B:参数列表 你要传递几个参数，以及每个参数的数据类型
	 * 
	 * 需求：求两个数据之和的案例
	 * 
	 * 方法的执行特点： 不调用，不执行。
	 * 
	 * 如何调用呢?(有明确返回值的调用) A:单独调用,一般来说没有意义，所以不推荐。
	 * B:输出调用,但是不够好。因为我们可能需要针对结果进行进一步的操作。 C:赋值调用,推荐方案。
	 * 
	 */
	// 这里有明确的返回值， int 所以定义该方法为 int类型
	public static int Sum(int a, int b) {
		return a + b;
	}

	/*
	 * 需求：在控制台输出如下的形状
	 *****
	 *****
	 *****
	 *****
	 * void类型返回值的方法调用： 单独调用 输出调用(错误) 赋值调用(错误)
	 */
	/*
	 * 写一个什么样子的方法呢?写一个h行l列的代码
	 * 
	 * 两个明确： 返回值类型：这个时候没有明确的返回值，不写东西还不行，所以，这里记住是void 参数列表：int h,int l
	 */
	public static void printer(int h, int l) {
		for (int x = 0; x < h; x++) {
			for (int y = 0; y < l; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	/*
	 * 方法重载： 在同一个类中，方法名相同，参数列表不同。与返回值类型无关。/ 参数列表不同： A:参数个数不同 B:参数类型不同
	 * 
	 */
	public static int Sum(int a, int b, int c) {
		return a + b + c;
	}

	/* 键盘录入两个数，返回两个数中较大值 */
	public static int Max(int a, int b) {
		return (a > b ? a : b);
	}

	/* 键盘录入三个数，求最大值 */
	public static int Max(int a, int b, int c) {
		// return(a>b?(a>c?a:c):(b>c?b:c));
		int temp = a > b ? a : b;
		int max = temp > c ? temp : c;
		return max;
	}

	/* 键盘录入一个数据n(1<=n<=9)，输出对应的nn乘法表 */
	public static void TimesTable(int n) {
		for (int x = 0; x <= n; x++) {
			System.out.println();
			for (int y = 1; y <= x; y++) {
				System.out.print(x + "*" + y + "=" + (x * y) + "\t");
			}
		}
		System.out.println();
	}

	/*
	 * 比较两个数据是否相等。参数类型分别为 两个byte类型，两个short类型，两个int类型，两个long类型， 并在main方法中进行测试
	 */
	public static boolean Compare(int a, int b) {
		System.out.print("int" + "\t");
		return (a == b);
	}

	public static boolean Compare(byte a, byte b) {
		System.out.print("byte" + "\t");
		return (a == b);
	}

	public static boolean Compare(long a, long b) {
		System.out.print("long" + "\t");
		return a == b;
	}

	public static boolean Compare(String a, String b) {
		System.out.print("String" + "\t");
		return a == b;
	}

	// 数组遍历方法
	public static void PrintArray(int[] arr) {
		System.out.print("[");
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 1) {
				System.out.println(arr[i] + "]");
			} else {
				System.out.print(arr[i] + ",");
			}
		}
	}

	/*
	 * 数组获取最值(获取数组中的最大值最小值)
	 * 
	 * 分析： A:定义一个数组，并对数组的元素进行静态初始化。 B:从数组中任意的找一个元素作为参照物(一般取第一个),默认它就是最大值。
	 * C:然后遍历其他的元素，依次获取和参照物进行比较，如果大就留下来，如果小，就离开。 D:最后参照物里面保存的就是最大值。
	 */
	public static void ArryMax(int[] arr) {
		int max = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
		}
		System.out.println("Max:" + max);
	}

	public static void ArryMin(int[] arr) {
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}
		}
		System.out.println("Min:" + min);
	}

	/*
	 * 数组元素逆序 (就是把元素对调)
	 * 
	 * 分析： A:定义一个数组，并进行静态初始化。 B:思路 把0索引和arr.length-1的数据交换 把1索引和arr.length-2的数据交换
	 * ... 只要做到arr.length/2的时候即可。
	 */
	public static void ArryReverse(int[] arr) {
		int last = arr.length - 1;
		for (int i = 0; i < arr.length / 2; i++) {
			arr[i] = arr[i] ^ arr[last - i]; // a = a^b
			arr[last - i] = arr[i] ^ arr[last - i]; // b = a^b
			arr[i] = arr[i] ^ arr[last - i]; // a = a^b
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	public static void ArryReverse(String[] arr) {
		for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
			String temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}

	/*
	 * 数组查表法(根据键盘录入索引,查找对应星期) 意思是：String[] strArray = {"星期一","星期二",...};
	 */
	public static void ArryChek(int day) {
		String[] arr = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		System.out.println("Today is " + arr[day - 1]);
	}

	/*
	 * 需求：数组元素查找(查找指定元素第一次在数组中出现的索引)
	 * 
	 * 分析： A:定义一个数组，并静态初始化。 B:写一个功能实现 遍历数组，依次获取数组中的每一个元素，和已知的数据进行比较
	 * 如果相等，就返回当前的索引值。
	 */
	public static int ArryEqual(int Equal, int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			if (Equal == arr[i]) {
				return i;
			}
		}
		return -1;
	}

	public static int ArryEqual(int[] arr, int Equal) {
		int index = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == Equal) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	/*
	公司年销售额求和
	某公司按照季度和月份统计的数据如下：单位(万元)
	第一季度：22,66,44
	第二季度：77,33,88
	第三季度：25,45,65
	第四季度：11,66,99
	
	分析：
		A:把题目的数据用二维数组来表示
			int[][] arr = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
		B:如何求和呢?
			求和其实就是获取到每一个元素，然后累加即可。
		C:定义一个求和变量sum，初始化值是0。
		D:通过遍历就可以得到每一个二维数组的元素。
		E:把元素累加即可。
		F:最后输出sum，就是结果。
*/
	//二维数组求和方法
	public static void DyadicArrySum(int [][] arr){
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println("总计："+sum);
	}
	
	//破解加密（戏精附体 (￣_￣|||)）
	public static void Crack(int [] arr){
		int index = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("");
		}
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("蛤蛤！我能破解你的加密程序！//戏精附体 (￣_￣|||)，密码是 123");
		System.out.println("请输入破解程序启动密码：");
		int a = sc.nextInt();
		if(a==123){
			System.out.println("通过验证！");
		}else{
			System.out.println("密码错误！");
			return;
		}
		
		System.out.println("------------------启动破解");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			index ++;
		}
		System.out.println();
		System.out.println("------------------正在破解");
		int temp = arr[0];
		arr[0] = arr[index-1];
		arr[index-1] = temp;
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] += 10;
			arr[i] -= 5; 
			arr[i] %= 10;
		}
		int b = 0;
		for (int start = 0,end = arr.length-1; start < arr.length/2; start++,end--) {
			 b = arr[start];
			 arr[start] = arr[end];
			 arr[end] = b;
		}
		System.out.println("********");
		System.out.println("------------------破解成功");
		for (int i = 0; i < index; i++) {
			System.out.print(arr[i]);
		}
	}

}

