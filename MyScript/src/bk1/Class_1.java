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

		// default����ʾ�����������ƥ���ʱ�򣬾�ִ�иô������ݣ���if����else���ơ�
		// System.out.println("�����·ݣ�");
		// @SuppressWarnings("resource")
		// Scanner sc = new Scanner(System.in);
		// int month = sc.nextInt();
		// switch (month) {
		// case 1:
		// System.out.println("��ǰ�Ǵ���");
		// break;
		// case 2:
		// System.out.println("��ǰ�Ǵ���");
		// break;
		// case 3:
		// System.out.println("��ǰ�Ǵ���");
		// break;
		// case 4:
		// System.out.println("��ǰ���ļ�");
		// break;
		// case 5:
		// System.out.println("��ǰ���ļ�");
		// break;
		// case 6:
		// System.out.println("��ǰ���ļ�");
		// break;
		// case 7:
		// System.out.println("��ǰ���＾");
		// break;
		// case 8:
		// System.out.println("��ǰ���＾");
		// break;
		// case 9:
		// System.out.println("��ǰ���＾");
		// break;
		// case 10:
		// System.out.println("��ǰ�Ƕ���");
		// break;
		// case 11:
		// System.out.println("��ǰ�Ƕ���");
		// break;
		// case 12:
		// System.out.println("��ǰ�Ƕ���");
		// break;
		// default:
		// System.out.println("�����·ݴ���");
		// }
		// System.out.println("ѡ����ȷ�� 1+1=��");
		// System.out.println("A.1" + " " + "B.2");
		// System.out.println("C.3" + " " + "D.4");
		// @SuppressWarnings("resource")
		// Scanner sc = new Scanner(System.in);
		// String answer = sc.next();
		// switch (answer) {
		// case "A":
		// System.out.println("����");
		// break;
		// case "B":
		// System.out.println("����");
		// break;
		// case "c":
		// System.out.println("��ȷ");
		// break;
		// case "D":
		// System.out.println("����");
		// break;
		// }
		// for(int i=1;i<11;i++){
		// System.out.println(i);
		// }
		// //���10�������ֵĺ�
		// int K=0;
		// for(int i=10;i>0;i--){
		// K += i;
		// System.out.println(K);
		// }
		// ���100���ڵ�ż��������֮��
		// int k=0;
		// int j=0;
		// for(int i=0;i<=100;i++){
		// if(i%2==0)
		// k += i;
		// if(i%2!=0)
		// j += i;
		// }
		// System.out.println("ż����"+k);
		// System.out.println("������"+j);
		// ��������Ρ����Ρ��žų˷���
		// for(int i=0;i<8;i++){ //��������
		// System.out.println();
		// for(int j=7;j>i;j--) //�������ո�
		// System.out.print(" ");
		// for(int j=0;j<=i;j++) //��Ϊ�ո�����������ҵ�ֱ��������
		// System.out.print("*");
		// for(int j=0;j<i;j++) //����ұ�
		// System.out.print("*");
		// }
		// ����žų˷���
		// for(int i=1;i<=9;i++){
		// System.out.println();
		// for(int j=1;j<=i;j++)
		// System.out.print(j+"*"+i+"="+(i*j)+"\t");
		// }
		/*
		 * С��������ÿ�����2.5ԪǮ������������������ǣ�ÿ����һ���Ǵ�Ǯ�ĵ�5�����5�ı����Ļ��������Ứȥ6ԪǮ�����ʣ����������죬
		 * С���ſ��Դ浽100ԪǮ��
		 */
		// int money = 0;
		// int day = 1;
		// while(true){
		// money += 2.5;
		// if(money>=100){
		// System.out.println("��Ҫ��"+day+"��");
		// System.out.println(money);
		// break;
		// }
		// if(day%5==0){
		// money -= 6;
		// }
		// day++;
		// }
		// ��ȡ���������е����ֵ
		// int x = 123;
		// int y = 345;
		// int max = (x<y?x:y);// : �����ã�
		// System.out.println(max);

		// �����⣺��������Ĵ����ĸ�������?
		// short a = 1;
		// a = a+1; //���Ͳ�ƥ��:���ܴ�intת��Ϊshort
		// short s = 1;
		// s += s;
		// ++,--����ϰ��
		// ��һ�⣺
		// int a = 10;
		// int b = 10;
		// int c = 10;
		// //��ʾ a=a++ �ȸ�ֵ������ ; a=++a �������ٸ�ֵ
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
		// int y = (x--)+(--x)+(x*10); //�� x ��� --��ȫ�������ڶ���x�����㣬��һ��x���䣬�ڶ���x֮���x
		// ����2
		// //4+6+60
		// //x=5,6
		// System.out.println("y:"+y);
		//
		// int a = 4;
		// int b = (a++)+(a++)+(--a)+(a*10);// 4 6 50
		// System.out.println(b);

		// ��ȡ���������е����ֵ ����Ŀ�������
		// int x = 100;
		// int y = 300;
		// int z = 250;
		// //int min = (x>y?y:x);
		// int min = (z>y)?((z>x)?z:x):((y>x)?y:x); //���� x>y?x:y ģʽ�� (x>y)��
		// ���booleanֵ��ture���x,false ���y��
		// System.out.println(min);

		// |��&&��! ���롢�� ||��&&��^ ���롢��� �߼������
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

		// λ����� �Զ����ƽ������㣬 &: ��0��0��|����1��1��^����ͬ��0����ͬ��1�� ~��01����
		// int a = 3;
		// int b = 4;
		// String c = Integer.toBinaryString(-4);
		// System.out.println(3 & 4);
		// System.out.println(3 | 4);
		// System.out.println(3 ^ 4);
		// System.out.println(~3);
		// System.out.println(c);

		// ��򣬲�ʹ�õ���������������ab��ֵ +-/* ^
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

		// λ�����
		// <<:���� ������λ�������ұ߲���0
		// >>:���� ���λ��0����߲���0�����Ϊ��1����߲���1
		// >>>:�޷������� �������λ��0����1����߲���0

		/*
		 * ����¼����ϰ�� ����¼���������ݣ�����������������ͣ��������
		 */
		// Scanner sc1 = new Scanner(System.in);
		// int x = sc1.nextInt();
		// Scanner sc2 = new Scanner(System.in);
		// int y = sc2.nextInt();
		// x +=y;
		// System.out.println(x);

		/*
		 * ��ϰ�� ����¼���������ݣ���ȡ�����������е����ֵ ����¼���������ݣ��Ƚ������������Ƿ����
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
		 * if����ע����� A:�Ƚϱ��ʽ���ۼ򵥻��Ǹ��ӣ����������boolean����
		 * B:if�����Ƶ�����������һ����䣬�����ſ���ʡ�ԣ� ����Ƕ�����䣬�Ͳ���ʡ�ԡ�������Զ��Ҫʡ�ԡ�
		 * C:һ����˵����������ž�û�зֺţ��зֺž�û���������
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
		// System.out.println("a��ֵ��100");
		// System.out.println("over");
		// }
		// System.out.println("-------------------");
		//
		// int b = 100;
		// if(b != 100);
		// //������ʵ���������ģ�ֻ�����ǿ�����塣
		// //�����
		// {
		// System.out.println("b��ֵ��100");
		// System.out.println("over");
		// }

		// if else ��ϰ
		// int a = 10;
		// int b = 20;
		//
		// if(a==b){
		// System.out.println("yes");
		// }else{
		// System.out.println("no");
		// }
		/*
		 * ����if���ĵڶ��ָ�ʽ�ղ�Ҳ�������Ԫ�����������ɵ�Ч���� ���ԣ����Ǿ���Ϊ���ǿ������һ���Ĳ�����
		 * ���ǣ����Ǿ�һ������û����?�϶����ǡ�
		 * 
		 * ���� ��Ԫ�����ʵ�ֵģ������Բ���if���ʵ�֡���֮��������
		 * 
		 * ʲôʱ��if���ʵ�ֲ�������Ԫ�Ľ���? ��if�����ƵĲ�����һ���������ʱ��Ͳ��ܡ�
		 * Ϊʲô��?��Ϊ��Ԫ�������һ��������������������Ͼ�Ӧ����һ�������������һ�������
		 */
		// int x = 101;
		// //String s = (x%2 ==
		// 0)?System.out.println("100��һ��ż��"):System.out.println("100��һ������");//��Ԫ��������������ֻ�ܲ������
		//
		// if(x%2==0){
		// System.out.println("ż��");
		// }else{
		// System.out.println("����");
		// }

		// ���󣺼���¼��һ���ɼ����жϲ�����ɼ��ĵȼ���
		/*
		 * 90-100 ���� 80-90 �� 70-80 �� 60-70 ���� 0-60 ������
		 */
		// Scanner sc = new Scanner(System.in);
		// System.out.println("�ɼ�:");
		// int grade = sc.nextInt();
		// if(grade>90&&grade<100){
		// System.out.println("����");
		// }
		// if(grade>80&&grade<90){
		// System.out.println("����");
		// }
		// if(grade>70&&grade<80){
		// System.out.println("һ��");
		// }
		// if(grade>60&&grade<70){
		// System.out.println("����");
		// }
		// if(grade>0&&grade<60){
		// System.out.println("������");
		// }else{
		// System.out.println("�������");
		// }

		/*
		 * ��ȡ���������е����ֵ
		 * 
		 * �ɴ˰�����Ҫ��Ϊ�˽���if����ǿ���Ƕ��ʹ�õġ������ǿ��������Ƕ�ס�
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
		 * 13:��д����ʵ���������ݣ�if���ʵ�� ���Գɼ��ֵȼ��� 90~100 A�ȡ� 80-89 B�ȡ� 70-79 C�ȡ� 60-69
		 * D�ȡ� 60���� E�ȡ� ����ݸ����ɼ��������Ӧ�ĵȼ���
		 */
		// Scanner sc = new Scanner(System.in);
		// int grade = sc.nextInt();
		// if(grade>100|grade<0){
		// System.out.println("�������");
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
		// WEEK��������ڼ�
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
		// System.out.println("�������");
		// break;
		// }

		/*
		 * ������д���
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

		// ѡ����
		// System.out.println("����ļ��������˭?");
		// System.out.println("68 ������");
		// System.out.println("65 ����ϼ");
		// System.out.println("66 ������");
		// System.out.println("67 ���»�");
		//
		// /* Ascii�����
		// 0100 0001 65 41 A
		// 0100 0010 66 42 B
		// 0100 0011 67 43 C
		// 0100 0100 68 44 D
		// */
		// //����¼��ѡ������ݡ�
		// Scanner sc = new Scanner(System.in);
		//
		// System.out.println("���������ѡ��");
		// int choiceNumber = sc.nextInt();
		//
		// //ǿ��ת��Ϊ�ַ�����
		// char choice = (char) choiceNumber;
		//
		// switch(choice) {
		// case 'A':
		// System.out.println("��ϲ��,ѡ����ȷ");
		// break;
		// case 'B':
		// System.out.println("������˼����ѡ������");
		// break;
		// case 'C':
		// System.out.println("������˼����ѡ������");
		// break;
		// case 'D':
		// System.out.println("������˼����ѡ������");
		// break;
		// default:
		// System.out.println("û�и�ѡ��");
		// break;
		// }

		// ��������¼�����
		// Scanner sc = new Scanner(System.in);
		//
		// //¼������
		// System.out.println("�������·�(1-12)��");
		// int month = sc.nextInt();
		// //����д̫�鷳�ˣ�����ʹ��һ�����ǲ���ʹ�õĶ�����case��͸
		// switch(month) {
		// case 1:
		// case 2:
		// case 12:
		// System.out.println("����");
		// break;
		// case 3:
		// case 4:
		// case 5:
		// System.out.println("����");
		// break;
		// case 6:
		// case 7:
		// case 8:
		// System.out.println("�ļ�");
		// break;
		// case 9:
		// case 10:
		// case 11:
		// System.out.println("�＾");
		// break;
		// default:
		// System.out.println("��������·�����");
		// }
		/*
		 * �������1-10֮������֮��
		 */
		// int sum = 0;
		// for(int x=0;x<=10;x++){
		// sum += x;
		// }
		// System.out.println(sum);
		//
		// /*��100֮��������ż���ĺ�*/
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

		/* ������5�Ľ׳ˡ� */
		// int sum=1;
		// for(int x=1;x<=5;x++){
		// sum *= x;
		// }
		// System.out.println(sum);
		// System.out.println(1*2*3*4*5);

		/* �����ڿ���̨������еġ�ˮ�ɻ����� */
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
		// System.out.println("ˮ�ɻ���"+sum);
		/*
		 * ��ϰ�� ���ڿ���̨�������������������λ�� ��λ������λ ʮλ����ǧλ ��λ+ʮλ+ǧλ+��λ=��λ
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
		 * ������ͳ��1-1000֮��ͬʱ�������������������ж��ٸ��� ��3������2 ��5������3 ��7������2
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
		// System.out.println("�������");
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
		 * while ѭ����ϵ ��������Ρ������ǡ����Ρ��žų˷���
		 */
		// for(int i=0;i<8;i++){ //��������
		// System.out.println();
		// for(int j=7;j>i;j--) //�������ո�
		// System.out.print("&");
		// for(int j=0;j<=i;j++) //��Ϊ�ո�����������ҵ�ֱ��������
		// System.out.print("*");
		// for(int j=0;j<i;j++) //����ұ�
		// System.out.print("*");
		// }
		// ��while ������������Ρ����Σ�done!

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
		// While ��� 99�˷���Done
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

		// ����ÿ���̨���2�Σ�Java������
		// ����ÿ���̨���7�Σ�Java������
		// ����ÿ���̨���13�Σ�Java������
		// for(int x=1; x<=10; x++) {
		// if(x%3 == 0) {
		// //break; == return;
		// //continue;
		// //System.out.println("What's up!Dude!");//�������
		//
		// }
		// System.out.println("What's up!Dude!"+x%3);
		// }

		// ֽ���۵������������߶ȵĴ���
		// �ҹ����ɽ������������壺8848m��
		// ��������һ���㹻���ֽ�ţ����Ϊ��0.01m��
		// ���ʣ����۵����ٴΣ��Ϳ��Ա�֤��Ȳ��������������ĸ߶�?
		// double x=0.01;
		// int sum=0;
		// do{
		// x *= 2;
		// sum +=1;
		// }while(x<8848);
		// System.out.println(sum);
		// System.out.println(x);

		// break ��ϰ
		// for(int x = 0;x<10;x++){
		// if(x==3)
		// break;
		// System.out.println("Be cool! bro.");
		// }

		// ѭ����ǩ��break
		// wc:for(int x=0;x<3;x++){ //for ѭ��ǰ�ӱ�ǩ���������̿��� break,continue
		// nc:for(int y=0;y<4;y++){
		// if(y==2){
		// //break nc;
		// break wc;
		// }
		// System.out.println("*");
		// }
		// System.out.println();
		// }

		// С����Ǯ 2.0 ��һ�ٿ���TM�Ѵ�
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
		// System.out.println("������"+day);
		// System.out.println(money);
		// System.out.println(count);
		// break;
		// }
		// }

		// Java_05,����
		// Scanner sc =new Scanner(System.in);
		// System.out.println("������˷���������");
		// int n = sc.nextInt();
		//
		// int x = 10, y = 20,z = 22;
		// byte a = 3,b=4;
		// long c = 656461616,d = 569466322;
		// String e = "��",f = "��";
		//
		// //��������� //��ֵ����
		// int result = Sum(x, y);
		// System.out.println(result);
		// //��������ͣ����أ�A:����������ͬ B:�������Ͳ�ͬ �������
		// System.out.println(Sum(x,y,z));
		// //������ȡ���ֵ
		// System.out.println(Max(x,y));
		// //������ȡ���ֵ
		// System.out.println(Max(x,y,z));
		// //�˷���
		// //System.out.println(TimesTable(n));
		// TimesTable(n);
		// //�Ƚϱ����Ƿ����
		// System.out.println(Compare(x,y));
		// System.out.println(Compare(a, b));
		// System.out.println(Compare(c, d));
		// System.out.println(Compare(e, f));
		//
		// printer(5, 10);
		// System.out.println("======================");

		// Java_05,����
		/*
		 * ����һ�����飬�������������ƺ�����Ԫ��ֵ�� ������Ԫ�ظ�ֵ���ٴ��������������ƺ�����Ԫ��ֵ��
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
		 * �����������飬�ֱ��������������Ե���������Ԫ��ֵ�� Ȼ���ÿ�������Ԫ�����¸�ֵ���ٴηֱ��������������Ե���������Ԫ��ֵ��
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
		 * �����һ������,������Ϻ󣬸�����Ԫ�ظ�ֵ����ֵ��Ϻ�������������ƺ�Ԫ�ء�
		 * ����ڶ�������,������Ϻ󣬸�����Ԫ�ظ�ֵ����ֵ��Ϻ�������������ƺ�Ԫ�ء�
		 * �������������,�ѵ�һ������ĵ�ֵַ��ֵ������(ע������һ��)��ͨ�����������������ȥ��Ԫ���ظ���ֵ��
		 * ����ٴ������һ�������������ƺ�Ԫ�ء�
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
		 * ����ľ�̬��ʼ���� ��ʽ����������[] ������ = new ��������[]{Ԫ��1,Ԫ��2,��}; �򻯸�ʽ�� ��������[] ������ =
		 * {Ԫ��1,Ԫ��2,��};
		 * 
		 * ������ int[] arr = new int[]{1,2,3};
		 * 
		 * �򻯺�
		 * 
		 * int[] arr = {1,2,3};
		 * 
		 * ע����� ��Ҫͬʱ��̬�;�̬���С� ���¸�ʽ�� int[] arr = new int[3]{1,2,3}; //����
		 */

		// int arr[] = {1,2,3,5};
		// System.out.println(arr);
		// for(int x=0;x<arr.length;x++){
		// System.out.println(arr[x]);
		// }

		/*
		 * �����������������С���⣺ ArrayIndexOutOfBoundsException:��������Խ���쳣 ԭ��������˲����ڵ�������
		 * 
		 * NullPointerException:��ָ���쳣 ԭ�������Ѿ�����ָ����ڴ��ˡ����㻹��������ȥ����Ԫ�ء�
		 * 
		 * ���ã����Լ������еĳ���Exception��β�������ܽ�һ�¡��Ժ������ͼ�¼������ ����ԭ�򣬽��������
		 */

		// int [] arr = new int[3];
		// //System.out.println(arr[3]);//ArrayIndexOutOfBoundsException:��������Խ���쳣,ԭ��������˲����ڵ�������
		//
		// int [] arr1 = null;
		// System.out.println(arr1[0]);//NullPointerException:��ָ���쳣

		// �������鷽������
//		int[] arr = { 1, 2, 3, 4, 5, 6, 88, 7, 99, 21, 234, 235, 1, 342, 45, 356 };
//		String[] Sarr = { "��", "��", "��", "��", "��", "��", "��", "��", "��", "��" };
		// PrintArray(arr);
		// //�������ֵ
		// ArryMax(arr);
		// //������Сֵ
		// ArryMin(arr);
		// //����
		// ArryReverse(arr);
		// ArryReverse(Sarr);
		// //��ѯ���ڼ�
		// ArryChek(6);

		// ��ѯ��ͬ�����±�
		// int a = ArryEqual(234,arr);
		// int b = ArryEqual(arr,45);
		// System.out.println(b);
		// System.out.println(arr[b]);

		/*java_06
		 * ��ά���飺����Ԫ��Ϊһά�����һ�����顣
		 * 
		 * ��ʽ1�� ��������[][] ������ = new ��������[m][n];
		 * 
		 * m:��ʾ�����ά�����ж��ٸ�һά���顣 n:��ʾÿһ��һά�����Ԫ���ж��ٸ���
		 * 
		 * ע�⣺ A:���¸�ʽҲ���Ա�ʾ��ά���� a:�������� ������[][] = new ��������[m][n]; b:��������[] ������[] =
		 * new ��������[m][n]; B:ע�����涨������� int x; int y; int x,y;
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
		
		//��ά���飬�򻯸�ʽ
//		int [][] arr1 = {{1,2,3},{4,5,6},{7,8,9},{10,11,12},{56,85,46,100}};
		
		//��ά�������
//		for (int i = 0; i < arr1[0].length; i++) {
//			System.out.print(arr1[0][i]+" ");
//		}
		//�Ľ�,��д�ɷ���
//		for (int i = 0; i < arr1.length; i++) {
//			for (int j = 0; j < arr1[i].length; j++) {
//				System.out.print(arr1[i][j]+" ");
//			}
//		}
		
		//��ά������ͷ���
//		DyadicArrySum(arr1);
		
		/*

		���󣺴�ӡ���������(�������Լ���¼��)
		
		1
		1 1	
		1 2 1
		1 3 3 1
		1 4 6 4 1 
		1 5 10 10 5 1

		������������ͼ��Ĺ���
			A:�κ�һ�еĵ�һ�к����һ�ж���1
			B:�ӵ����п�ʼ��ÿһ������������һ�е�ǰһ�к�����һ�еı���֮�͡�
		
		���裺
			A:���ȶ���һ����ά���顣���������n�����ǰ�����Ҳ�ȶ���Ϊn��
			  ���n�����������ڼ���¼�롣
			B:�������ά�����κ�һ�еĵ�һ�к����һ�и�ֵΪ1
			C:���չ��ɸ�����Ԫ�ظ�ֵ
				�ӵ����п�ʼ��ÿһ������������һ�е�ǰһ�к�����һ�еı���֮�͡�
			D:���������ά���顣
	*/
		
		//�����������
//		Scanner sc = new Scanner(System.in);
//		System.out.println("������");
//		int n = sc.nextInt();
//		int [][] arr = new int[n][];
//		for (int i = 0; i < arr.length; i++) {
//			//��ÿһ�����鶨�峤�ȣ�������һά����ĳ��ȣ�i=0,���� i+1�����û����һ��������������Χ����
//			arr[i] = new int[i+1];
//			
//			for (int j = 1; j < arr.length-i; j++) {
//				System.out.printf("  ");
//			}
//			//�������飬������ռ丳ֵ
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
		

		
		
		
//		 //�����ά����ĳ���
//        int length = 10;
//        //������ά����
//        int[][] arr = new int[length][];
//        //������ά����
//        for(int i = 0; i < arr.length; i++){
//            //��ÿ����ά���ݵ�Ԫ�ظ�ֵһά����
//            arr[i] = new int[i+1];
//            //����
//            System.out.println();  
//            //��ӡ�ո�
//            for(int m = 0; m < arr.length - 1 - i; m++){
//                System.out.print("  ");
//            }
//        
//            //����һά����
//            for(int j = 0; j < arr[i].length; j++){
//                //��һ��Ԫ�غ����һ��Ԫ�ص�ֵ����1
//                if( j == 0 || j == arr[i].length -1 ){
//                    arr[i][j] = 1;
//                }else{
//                    //��ǰһά���������nԪ�ص�ֵ������ǰһ����������n-1����������n��ֵ
//                    arr[i][j] = arr[i -1][j - 1] + arr[i - 1][j];
//                }
//                //��ʽ�����Ԫ��ֵ
//                System.out.printf("%4d",arr[i][j]);
//            }
//        }
		
		
		
		/*
		ĳ����˾���ù��õ绰����������Ϣ��������С��8λ��������Ϊ��ȷ����ȫ��
		�ڴ��ݹ�������Ҫ���ܣ����ܹ������£�
			���Ƚ����ݵ���Ȼ��ÿλ���ֶ�����5�����úͳ���10��������������֣�
			��󽫵�һλ�����һλ���ֽ����� ���������һ��С��8λ��������
			Ȼ�󣬰Ѽ��ܺ�Ľ���ڿ���̨��ӡ������ 
			*/
//		Scanner sc = new Scanner(System.in);
//		System.out.println("�������λ������");
//		int receive = sc.nextInt();
//		int [] arr = new int[8];
//		int index = 0;
//		while(receive>0&receive<=8){
//			arr[index] = receive%10;//�Ӹ�λ��ʼ¼�����ݣ���ɵ����¼������
//			index++;
//			receive /= 10;//ÿ��ѭ����һλ������ʮ���١�ǧ���򡢡�����
//			
//		}
//		System.out.println("------------------¼������");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]);
//		}
//		//ÿλ���ֶ�����5
//		for (int i = 0; i < arr.length; i++) {
//			arr[i] += 5;
//			arr[i] %= 10;
//		}
//		//��β����
//		int temp = arr[0];
//		arr[0] = arr[index-1]; //index-1,��0��ʼ��������7ʱ������ɣ����Ի���ִ��һ������������ -1��ֱ��дarr[7]����������
//		arr[index-1] = temp;
//		
//		System.out.println();
//		System.out.println("------------------���ܳɹ�");
//		for (int i = 0; i < arr.length; i++) {
//			System.out.print(arr[i]);
//		}
		
		//�ƽ�
//		Crack(arr);
		
		
		//Java�еĲ����������⣺
//		    int a = 10;
//	        int b = 20;
//	        System.out.println(" �������ͣ���ʽ�����ĸı��ʵ�ʲ���û��Ӱ�졣//int byte short long  /char /double ");
//	        System.out.println("First��a:"+a+",b:"+b); //a:10,b:20
//	        change(a,b);
//	        System.out.println("End��a:"+a+",b:"+b); //???    a:10,b:20
//
//	        System.out.println("");
//	        
//	        System.out.println("�������ͣ���ʽ�����ĸı�ֱ��Ӱ��ʵ�ʲ�����//class int[] interface");
//	        int[] arr = {1,2,3,4,5};
//	        System.out.println("First:"+arr[3]);
//	        change(arr);
//	        System.out.println("End:"+arr[3]); //???    4
//	    }
//
//	    public static void change(int a,int b) { //a=10,b=20
//	        System.out.println("C1��a:"+a+",b:"+b); //a:10,b:20
//	        a = b;    //a=20
//	        b = a + b; //b=40
//	        System.out.println("C2��a:"+a+",b:"+b); //a:20,b:40
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
		
		//PhoneTest,������� Java_06_03 
//		Phone c = new Phone();
//		//�������
//		System.out.print(c.brand+" "+c.color+" "+c.price);
//		//���÷���
//		System.out.println(" ");
//		c.Call();
//		c.Message();
//		
//		//Student ���ԣ�
//		Student st = new Student();
//		System.out.println(st.getName());
//		System.out.println(st.getAge());
//		System.out.println(st.getAddress());
//		st.Study();
//		st.Eat();
//		st.Sleep();
//		
//		//������������test, st ��ѧ�������ò���
//		c.Game(st);
		
		
		
		//Java_07,��Ա�������ֲ������� 
		//Variable v = new Variable();
		//System.out.println(v.num);
		//v.show();
		
		/*
		�������󣺾���û�����ֵĶ���
		
		���������Ӧ�ó�����
			A:���÷���������ֻ����һ�ε�ʱ��
				ע�⣺���ö�ε�ʱ�򣬲��ʺϡ�
				��ô����������������ʲô�ô���?
					�У��������������Ͼ������������Ա��������������ա�
			B:�������������Ϊʵ�ʲ�������
		 */
		//������ʡ��    Class  c = new Class(); ��һ����ֱ�� new һ�� Class ����
		//��������
//		new Phone();
//		//����������÷���
//		new Student().Eat();
//		//����������λʵ�ʲ�������
//		new Phone().Game(new Student());
		
		//��װ��Private�ؼ���
		//����ѧ����
//		Student s = new Student();
//		System.out.println(s.getName());
//		s.setName("������");
//		System.out.println(s.getName());
//		
//		// ����һ��������ͨ��getXxx()���������Ա������ֵ����һ�εĽ���ǣ�null---0---null
//		// Ȼ��ͨ��setXxx()��������Ա������ֵ���ٴ�����������һ�εĽ���ǣ�����---2999---������
//		Phone p = new Phone();
//		System.out.println(p.getBrand()+" "+p.getColor()+" "+p.getPrice());
//		p.setBrand("����");
//		p.setColor("��ɫ");
//		p.setPrice(3666);
//		System.out.println(p.getBrand()+" "+p.getColor()+" "+p.getPrice());
		
		//���� Student �Ĺ��췽��
//		Student st = new Student();
//		System.out.println(st);	
//		//��������췽�����򻯶���ʵ����
//		Student st1 = new Student("����",19,"����XXXС��");
//		st1.Show();
		
		//Staff �����   (���������䣬����),�������
//		Staff st = new Staff("�ֵ���",35,1);
//		st.show();
//		
//		Phone p = new Phone();
//		p.Math();
//		People pe = new People(18,"Ů","������");
//		pe.show();
//		Student st = new Student();
//		st.setAge(18);
//		st.setSex("��");
//		st.setName("�¶���");
//		System.out.println(st.age+st.sex+st.name);
		
//		String a = Integer.toBinaryString(25);
//		System.out.println(a);
		
		/*Java_09 ��̬
		 * 
		 * ��̬�еĳ�Ա�����ص㣺
		A:��Ա����
			���뿴��ߣ����п���ߡ�
		B:���췽��
			������������ʱ�򣬷��ʸ���Ĺ��췽�����Ը�������ݽ��г�ʼ����
		C:��Ա����
			���뿴��ߣ����п��ұߡ�
			�����ڳ�Ա�������ڷ�����д�����������п��ұߡ���
		D:��̬����
			���뿴��ߣ����п���ߡ�
			(��̬������أ��㲻����д�����ԣ����ʻ�����ߵ�)
		 * */
		
//		People p = new Student();
//		p.eat();	//�������� eat ����
//		System.out.println(p.age);	//�������� age 25
		
		/*��̬Ӧ��
		 * */
//		Student s = new Student();
//		Variable.StudentTool(s);//�򻯣����ϣ����ù���
//		
//		Staff a = new Staff("Chill", 18, 1);
//		Variable.StaffTool(a);
		
		/*
		��̬�ı׶ˣ�
			����ʹ����������й��ܡ�
	*/
//		People p = new Student();
//		p.eat();
		//p.Study();//ָ������ĸ�������޷��������෽��		
		
		/*���Խ��������ǿתΪ�������
		 * */
		
//		People p = new Student();//����P����ʵ����Student����
//		Student s = (Student)p;
//		p.eat();
//		s.eat();
//		s.Study();
		
		//�����಻�ܱ�ʵ����,�����ʵ���������� Student,������People
		//People r = new People();
		
		//final �������ͺͻ������Ͳ���
		//��������
//		final int age = 10;
//		//age = 20;
//		//��������
//		Student s = new Student();
//		System.out.println(s.age);
//		s.setAge(100);
//		System.out.println(s.age);
		
	}
	
		

	/*
	 * ����������ض����ܵĴ���顣
	 * 
	 * ע�⣺�ںܶ����������к����Ķ��壬����Java�к�������Ϊ������
	 * 
	 * ������ʽ�� ���η� ����ֵ���� ������(�������� ������1,�������� ������2...) { ���������; return ����ֵ; } ��ϸ���ͣ�
	 * ���η���Ŀǰ���� public static��������������ϸ�Ľ������������η��� ����ֵ���ͣ����ǹ��ܽ�����������͡�
	 * �������������������򼴿ɡ��������ǵĵ��á� ������ ʵ�ʲ���������ʵ�ʲ�������ġ� ��ʽ���������Ƿ��������ϵģ����ڽ���ʵ�ʲ����ġ�
	 * �������ͣ����ǲ������������� �����������Ǳ����� ��������䣺������ɹ��ܵĴ��롣 return�����������ġ�
	 * ����ֵ�����ǹ��ܵĽ������return���������ߡ�
	 * 
	 * Ҫ��д��һ���������ͱ�����ȷ���������� A:����ֵ���� ������������� B:�����б� ��Ҫ���ݼ����������Լ�ÿ����������������
	 * 
	 * ��������������֮�͵İ���
	 * 
	 * ������ִ���ص㣺 �����ã���ִ�С�
	 * 
	 * ��ε�����?(����ȷ����ֵ�ĵ���) A:��������,һ����˵û�����壬���Բ��Ƽ���
	 * B:�������,���ǲ����á���Ϊ���ǿ�����Ҫ��Խ�����н�һ���Ĳ����� C:��ֵ����,�Ƽ�������
	 * 
	 */
	// ��������ȷ�ķ���ֵ�� int ���Զ���÷���Ϊ int����
	public static int Sum(int a, int b) {
		return a + b;
	}

	/*
	 * �����ڿ���̨������µ���״
	 *****
	 *****
	 *****
	 *****
	 * void���ͷ���ֵ�ķ������ã� �������� �������(����) ��ֵ����(����)
	 */
	/*
	 * дһ��ʲô���ӵķ�����?дһ��h��l�еĴ���
	 * 
	 * ������ȷ�� ����ֵ���ͣ����ʱ��û����ȷ�ķ���ֵ����д���������У����ԣ������ס��void �����б�int h,int l
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
	 * �������أ� ��ͬһ�����У���������ͬ�������б�ͬ���뷵��ֵ�����޹ء�/ �����б�ͬ�� A:����������ͬ B:�������Ͳ�ͬ
	 * 
	 */
	public static int Sum(int a, int b, int c) {
		return a + b + c;
	}

	/* ����¼���������������������нϴ�ֵ */
	public static int Max(int a, int b) {
		return (a > b ? a : b);
	}

	/* ����¼���������������ֵ */
	public static int Max(int a, int b, int c) {
		// return(a>b?(a>c?a:c):(b>c?b:c));
		int temp = a > b ? a : b;
		int max = temp > c ? temp : c;
		return max;
	}

	/* ����¼��һ������n(1<=n<=9)�������Ӧ��nn�˷��� */
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
	 * �Ƚ����������Ƿ���ȡ��������ͷֱ�Ϊ ����byte���ͣ�����short���ͣ�����int���ͣ�����long���ͣ� ����main�����н��в���
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

	// �����������
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
	 * �����ȡ��ֵ(��ȡ�����е����ֵ��Сֵ)
	 * 
	 * ������ A:����һ�����飬���������Ԫ�ؽ��о�̬��ʼ���� B:���������������һ��Ԫ����Ϊ������(һ��ȡ��һ��),Ĭ�����������ֵ��
	 * C:Ȼ�����������Ԫ�أ����λ�ȡ�Ͳ�������бȽϣ������������������С�����뿪�� D:�����������汣��ľ������ֵ��
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
	 * ����Ԫ������ (���ǰ�Ԫ�ضԵ�)
	 * 
	 * ������ A:����һ�����飬�����о�̬��ʼ���� B:˼· ��0������arr.length-1�����ݽ��� ��1������arr.length-2�����ݽ���
	 * ... ֻҪ����arr.length/2��ʱ�򼴿ɡ�
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
	 * ������(���ݼ���¼������,���Ҷ�Ӧ����) ��˼�ǣ�String[] strArray = {"����һ","���ڶ�",...};
	 */
	public static void ArryChek(int day) {
		String[] arr = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };
		System.out.println("Today is " + arr[day - 1]);
	}

	/*
	 * ��������Ԫ�ز���(����ָ��Ԫ�ص�һ���������г��ֵ�����)
	 * 
	 * ������ A:����һ�����飬����̬��ʼ���� B:дһ������ʵ�� �������飬���λ�ȡ�����е�ÿһ��Ԫ�أ�����֪�����ݽ��бȽ�
	 * �����ȣ��ͷ��ص�ǰ������ֵ��
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
	��˾�����۶����
	ĳ��˾���ռ��Ⱥ��·�ͳ�Ƶ��������£���λ(��Ԫ)
	��һ���ȣ�22,66,44
	�ڶ����ȣ�77,33,88
	�������ȣ�25,45,65
	���ļ��ȣ�11,66,99
	
	������
		A:����Ŀ�������ö�ά��������ʾ
			int[][] arr = {{22,66,44},{77,33,88},{25,45,65},{11,66,99}};
		B:��������?
			�����ʵ���ǻ�ȡ��ÿһ��Ԫ�أ�Ȼ���ۼӼ��ɡ�
		C:����һ����ͱ���sum����ʼ��ֵ��0��
		D:ͨ�������Ϳ��Եõ�ÿһ����ά�����Ԫ�ء�
		E:��Ԫ���ۼӼ��ɡ�
		F:������sum�����ǽ����
*/
	//��ά������ͷ���
	public static void DyadicArrySum(int [][] arr){
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		System.out.println("�ܼƣ�"+sum);
	}
	
	//�ƽ���ܣ�Ϸ������ (��_��|||)��
	public static void Crack(int [] arr){
		int index = 0;
		for (int i = 0; i < 10; i++) {
			System.out.println("");
		}
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("");
		System.out.println("��������ƽ���ļ��ܳ���//Ϸ������ (��_��|||)�������� 123");
		System.out.println("�������ƽ�����������룺");
		int a = sc.nextInt();
		if(a==123){
			System.out.println("ͨ����֤��");
		}else{
			System.out.println("�������");
			return;
		}
		
		System.out.println("------------------�����ƽ�");

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
			index ++;
		}
		System.out.println();
		System.out.println("------------------�����ƽ�");
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
		System.out.println("------------------�ƽ�ɹ�");
		for (int i = 0; i < index; i++) {
			System.out.print(arr[i]);
		}
	}

}

