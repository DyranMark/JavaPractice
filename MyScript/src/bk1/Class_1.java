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
		// b = b^a; //01010
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

		 int x = 10, y = 20,z = 22;
		 //两个数求和
		 int result = sum(x, y);
		 System.out.println(result);
		 //三个数求和，重载：A:参数个数不同 B:参数类型不同
		 System.out.println(sum(x,y,z));
		 //取最大值
		 System.out.println(max(x,y));

		printer(5, 10);
		System.out.println("======================");

	}

	/*
    方法：完成特定功能的代码块。
    
    注意：在很多语言里面有函数的定义，而在Java中函数被称为方法。

    方法格式：
        修饰符 返回值类型 方法名(参数类型 参数名1,参数类型 参数名2...) {
            方法体语句;
            return 返回值;
        }
    详细解释：
        修饰符：目前就用 public static。后面我们再详细的讲解其他的修饰符。
        返回值类型：就是功能结果的数据类型。
        方法名：符合命名规则即可。方便我们的调用。
        参数：
            实际参数：就是实际参与运算的。
            形式参数；就是方法定义上的，用于接收实际参数的。
        参数类型：就是参数的数据类型
        参数名：就是变量名
        方法体语句：就是完成功能的代码。
        return：结束方法的。
        返回值：就是功能的结果，由return带给调用者。
        
    要想写好一个方法，就必须明确两个东西：
        A:返回值类型
            结果的数据类型
        B:参数列表
            你要传递几个参数，以及每个参数的数据类型
            
    需求：求两个数据之和的案例
    
    方法的执行特点：
        不调用，不执行。
        
    如何调用呢?(有明确返回值的调用)
        A:单独调用,一般来说没有意义，所以不推荐。
        B:输出调用,但是不够好。因为我们可能需要针对结果进行进一步的操作。
        C:赋值调用,推荐方案。
        
*/
	//这里有明确的返回值， int 所以定义该方法为 int类型
	public static int sum(int a, int b) {
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
	方法重载：
	在同一个类中，方法名相同，参数列表不同。与返回值类型无关。/	
	参数列表不同：
		A:参数个数不同
		B:参数类型不同
 
 */
	public static int sum(int a,int b,int c){
		return a+b+c;
	}
	
	/*键盘录入两个数，返回两个数中较大值*/
	public static int max(int a,int b){
			return(a>b?a:b);		 
	}
}
