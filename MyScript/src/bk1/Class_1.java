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
		
		//default����ʾ�����������ƥ���ʱ�򣬾�ִ�иô������ݣ���if����else���ơ�
//		System.out.println("�����·ݣ�");
//		@SuppressWarnings("resource")
//		Scanner sc = new Scanner(System.in);
//		int month = sc.nextInt();
//		switch (month) {
//		case 1:
//			System.out.println("��ǰ�Ǵ���");
//			break;
//		case 2:
//			System.out.println("��ǰ�Ǵ���");
//			break;
//		case 3:
//			System.out.println("��ǰ�Ǵ���");
//			break;
//		case 4:
//			System.out.println("��ǰ���ļ�");
//			break;
//		case 5:
//			System.out.println("��ǰ���ļ�");
//			break;
//		case 6:
//			System.out.println("��ǰ���ļ�");
//			break;
//		case 7:
//			System.out.println("��ǰ���＾");
//			break;
//		case 8:
//			System.out.println("��ǰ���＾");
//			break;
//		case 9:
//			System.out.println("��ǰ���＾");
//			break;
//		case 10:
//			System.out.println("��ǰ�Ƕ���");
//			break;
//		case 11:
//			System.out.println("��ǰ�Ƕ���");
//			break;
//		case 12:
//			System.out.println("��ǰ�Ƕ���");
//			break;
//		default:
//			System.out.println("�����·ݴ���");
//		}
//		System.out.println("ѡ����ȷ�� 1+1=��");
//		System.out.println("A.1" + "     " + "B.2");
//		System.out.println("C.3" + "     " + "D.4");
//		@SuppressWarnings("resource")
//		Scanner sc = new Scanner(System.in);
//		String answer = sc.next();
//		switch (answer) {
//		case "A":
//			System.out.println("����");
//			break;
//		case "B":
//			System.out.println("����");
//			break;
//		case "c":
//			System.out.println("��ȷ");
//			break;
//		case "D":
//			System.out.println("����");
//			break;
//		}
//		for(int i=1;i<11;i++){
//			System.out.println(i);
//		}
//		//���10�������ֵĺ�
//		int K=0;
//		for(int i=10;i>0;i--){
//			K += i;
//			System.out.println(K);
//		}
		//���100���ڵ�ż��������֮��
//		int k=0;
//		int j=0;
//		for(int i=0;i<=100;i++){
//			if(i%2==0)
//			    k += i;
//			if(i%2!=0)
//				j += i;
//		}
//		System.out.println("ż����"+k);
//		System.out.println("������"+j);
		//��������Ρ����Ρ��žų˷���
//		for(int i=0;i<8;i++){			//��������
//			System.out.println();		
//			for(int j=7;j>i;j--)		//�������ո�
//				System.out.print(" ");	
//			for(int j=0;j<=i;j++)		//��Ϊ�ո�����������ҵ�ֱ��������
//				System.out.print("*");
//			for(int j=0;j<i;j++)		//����ұ�
//				System.out.print("*");
//		}
		//����žų˷���
//		for(int i=1;i<=9;i++){
//			System.out.println();
//			for(int j=1;j<=i;j++)
//				System.out.print(j+"*"+i+"="+(i*j)+"\t");
//		}
		/*С��������ÿ�����2.5ԪǮ������������������ǣ�ÿ����һ���Ǵ�Ǯ�ĵ�5�����5�ı����Ļ��������Ứȥ6ԪǮ�����ʣ����������죬С���ſ��Դ浽100ԪǮ��*/
//		int money = 0;
//		int day = 1;		    
//         while(true){
//        	 money += 2.5;
//        	 if(money>=100){
//        		 System.out.println("��Ҫ��"+day+"��");
//        		 break;
//        	 }
//        	 if(day%5==0){
//        		money -= 6;
//        	 }
//        	 day++;
//         }
		//��ȡ���������е����ֵ
//		int x = 123;
//		int y = 345;
//		int max = (x<y?x:y);// : �����ã�
//		System.out.println(max);
		
		//�����⣺��������Ĵ����ĸ�������?
//		short a = 1;
//		a = a+1;		//���Ͳ�ƥ��:���ܴ�intת��Ϊshort
//		short s = 1;
//		s += s;
		//++,--����ϰ��		
		//��һ�⣺
//		int a = 10;
//		int b = 10;
//		int c = 10;
//		//��ʾ  a=a++ �ȸ�ֵ������ ; a=++a �������ٸ�ֵ
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
//		int y = (x--)+(--x)+(x*10); //�� x ��� --��ȫ�������ڶ���x�����㣬��һ��x���䣬�ڶ���x֮���x ����2
//		//4+6+60
//		//x=5,6
//		System.out.println("y:"+y);
//		
//		int a = 4;
//		int b = (a++)+(a++)+(--a)+(a*10);//         4  6    50
//		System.out.println(b);
		
		//��ȡ���������е����ֵ      ����Ŀ�������
//		int x = 100;
//		int y = 300;
//		int z = 250;
//		//int min = (x>y?y:x);
//		int min = (z>y)?((z>x)?z:x):((y>x)?y:x); //����  x>y?x:y ģʽ�� (x>y)�� ���booleanֵ��ture���x,false ���y��
//		System.out.println(min);
		
		// |��&&��! ���롢��        ||��&&��^  ���롢���	�߼������ 
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
		
		//λ�����			�Զ����ƽ������㣬 &: ��0��0��|����1��1��^����ͬ��0����ͬ��1�� ~��01����
//		int a = 3;
//		int b = 4;
//		String c = Integer.toBinaryString(-4);
//		System.out.println(3 & 4);
//		System.out.println(3 | 4);
//		System.out.println(3 ^ 4);
//		System.out.println(~3);
//		System.out.println(c);
		
		//��򣬲�ʹ�õ���������������ab��ֵ  +-/*  ^
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

		
		//λ�����
		//	<<:����	������λ�������ұ߲���0
		//>>:����	���λ��0����߲���0�����Ϊ��1����߲���1
		//>>>:�޷������� �������λ��0����1����߲���0
		
		 /*
		����¼����ϰ��
			����¼���������ݣ�����������������ͣ��������
		 */
//		Scanner sc1 = new Scanner(System.in);
//		int x = sc1.nextInt();
//		Scanner sc2 = new Scanner(System.in);
//		int y = sc2.nextInt();
//		x +=y;
//		System.out.println(x);
		
		/*
		��ϰ��
			����¼���������ݣ���ȡ�����������е����ֵ
			����¼���������ݣ��Ƚ������������Ƿ����
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
		if����ע�����
			A:�Ƚϱ��ʽ���ۼ򵥻��Ǹ��ӣ����������boolean����
			B:if�����Ƶ�����������һ����䣬�����ſ���ʡ�ԣ�
			  ����Ƕ�����䣬�Ͳ���ʡ�ԡ�������Զ��Ҫʡ�ԡ�
			C:һ����˵����������ž�û�зֺţ��зֺž�û���������
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
//			System.out.println("a��ֵ��100");
//			System.out.println("over");
//		}
//		System.out.println("-------------------");
//		
//		int b = 100;
//		if(b != 100);  
//		//������ʵ���������ģ�ֻ�����ǿ�����塣
//		//�����
//		{
//			System.out.println("b��ֵ��100");
//			System.out.println("over");
//		}
		
		//if else ��ϰ
//		int a = 10;
//		int b = 20;
//		
//		if(a==b){
//			System.out.println("yes");
//		}else{
//			System.out.println("no");
//		}
		/*
		����if���ĵڶ��ָ�ʽ�ղ�Ҳ�������Ԫ�����������ɵ�Ч����
		���ԣ����Ǿ���Ϊ���ǿ������һ���Ĳ�����
		���ǣ����Ǿ�һ������û����?�϶����ǡ�
		
		����
			��Ԫ�����ʵ�ֵģ������Բ���if���ʵ�֡���֮��������
			
			ʲôʱ��if���ʵ�ֲ�������Ԫ�Ľ���?
				��if�����ƵĲ�����һ���������ʱ��Ͳ��ܡ�
				Ϊʲô��?��Ϊ��Ԫ�������һ��������������������Ͼ�Ӧ����һ�������������һ�������
		 */
//		int x = 101;
//		//String s = (x%2 == 0)?System.out.println("100��һ��ż��"):System.out.println("100��һ������");//��Ԫ��������������ֻ�ܲ������
//		
//		if(x%2==0){
//			System.out.println("ż��");
//		}else{
//			System.out.println("����");
//		}
		
		//���󣺼���¼��һ���ɼ����жϲ�����ɼ��ĵȼ���
		/*
			90-100 ����
			80-90  ��
			70-80  ��
			60-70  ����
			0-60   ������
		*/
//		Scanner sc = new Scanner(System.in);
//		System.out.println("�ɼ�:");
//		int grade = sc.nextInt();
//		if(grade>90&&grade<100){
//			System.out.println("����");
//		}
//		if(grade>80&&grade<90){
//			System.out.println("����");
//		}
//		if(grade>70&&grade<80){
//			System.out.println("һ��");
//		}
//		if(grade>60&&grade<70){
//			System.out.println("����");
//		}
//		if(grade>0&&grade<60){
//			System.out.println("������");
//		}else{
//			System.out.println("�������");
//		}
		
		/*
		��ȡ���������е����ֵ
		
		�ɴ˰�����Ҫ��Ϊ�˽���if����ǿ���Ƕ��ʹ�õġ������ǿ��������Ƕ�ס�
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
		//byte by = (byte)300;
		//System.out.println(by);
//		
//		String a = Integer.toBinaryString(~6);
//		System.out.println(a);
//		
//		String b = Integer.valueOf("111",2).toString();
//		System.out.println(b);
//		
//		int c = 4,d=4;
//		System.out.println(c==d?true:false);
		
//		boolean b = true;
//
//		if(b==false)
//		    System.out.println("a");
//		else if(b)
//		    System.out.println("b");
//		else if(!b)
//		    System.out.println("c");
//		else
//		    System.out.println("d");
//		                                                //b
		/*13:��д����ʵ���������ݣ�if���ʵ��
			���Գɼ��ֵȼ���
    			90~100    A�ȡ�
    			80-89    B�ȡ�
    			70-79    C�ȡ�
    			60-69    D�ȡ�
    			60����    E�ȡ�
			����ݸ����ɼ��������Ӧ�ĵȼ���*/
//		Scanner sc = new Scanner(System.in);
//		int grade = sc.nextInt();
//		if(grade>100|grade<0){
//			System.out.println("�������");
//		}else if(grade>=90){
//			System.out.println("A");
//		}else if(grade>=80&grade<90){
//			System.out.println("B");
//		}else if(grade>=70&grade<80){
//			System.out.println("C");
//		}else if(grade>=60&grade<70){
//			System.out.println("D");
//		}else{
//			System.out.println("E");
//		}
		
		//System.out.println("5+5="+5+5);
		//System.out.println(5+5+"=5+5");
		
		//java_04
		//WEEK��������ڼ�
//		Scanner sc =new Scanner(System.in);
//		byte a = sc.nextByte();
//		switch(a){
//		case 1:
//			System.out.println("Monday");
//			break;
//		case 2:
//			System.out.println("Tuesday");
//			break;
//		case 3:
//			System.out.println("Wednesday");
//			break;
//		case 4:
//			System.out.println("Thursday");
//			break;
//		case 5:
//			System.out.println("Friday");
//			break;
//		case 6:
//			System.out.println("Saturday");
//			break;
//		case 7:
//			System.out.println("Sunday");
//			break;
//		case 8:
//			System.out.println("Funday");
//			break;
//		default:
//			System.out.println("�������");
//			break;
//		}
		
		/*
		������д���
		 */
//		int x = 2;
//		int y = 3;
//		switch(x){
//			default:
//				y++;
//				break;
//			case 3:
//				y++;
//			case 4:
//				y++;
//		}
//		System.out.println("y="+y);//4
//		System.out.println("---------------");
//		
//		int a = 2;
//		int b = 3;
//		switch(a){
//			default:
//				b++;
//			case 3:
//				b++;
//			case 4:
//				b++;
//		}
//		System.out.println("b="+b);//6
		
		//ѡ����
//		System.out.println("����ļ��������˭?");
//		System.out.println("68 ������");	
//		System.out.println("65 ����ϼ");
//		System.out.println("66 ������");
//		System.out.println("67 ���»�");
//
//		/* Ascii�����
//		  0100 0001	65	41	A
//		  0100 0010	66	42	B
//		  0100 0011	67	43	C
//		  0100 0100	68	44	D
//		*/
//		//����¼��ѡ������ݡ�
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("���������ѡ��");
//		int choiceNumber = sc.nextInt();
//		
//		//ǿ��ת��Ϊ�ַ�����
//		char choice = (char) choiceNumber;
//		
//		switch(choice) {
//			case 'A':
//				System.out.println("��ϲ��,ѡ����ȷ");
//				break;
//			case 'B':
//				System.out.println("������˼����ѡ������");
//				break;
//			case 'C':
//				System.out.println("������˼����ѡ������");
//				break;
//			case 'D':
//				System.out.println("������˼����ѡ������");
//				break;
//			default:
//				System.out.println("û�и�ѡ��");
//				break;
//		}
		
		//��������¼�����
//		Scanner sc = new Scanner(System.in);
//		
//		//¼������
//		System.out.println("�������·�(1-12)��");
//		int month = sc.nextInt();
//		//����д̫�鷳�ˣ�����ʹ��һ�����ǲ���ʹ�õĶ�����case��͸
//				switch(month) {
//					case 1:
//					case 2:
//					case 12:
//						System.out.println("����");
//						break;
//					case 3:
//					case 4:
//					case 5:
//						System.out.println("����");
//						break;
//					case 6:
//					case 7:
//					case 8:
//						System.out.println("�ļ�");
//						break;
//					case 9:
//					case 10:
//					case 11:
//						System.out.println("�＾");
//						break;
//					default:
//						System.out.println("��������·�����");
//				}
	/*
	�������1-10֮������֮��
	*/
//		int sum = 0;
//		for(int x=0;x<=10;x++){
//			sum += x;
//		}
//		System.out.println(sum);
//		
//		/*��100֮��������ż���ĺ�*/
//		int sum1=0;
//		for(int x=0;x<=100;x+=2){
//			sum1 +=x;
//		}
//		System.out.println(sum1);
//		
//		int sum2=0;
//		for(int x=0;x<=100;x++){
//			if(x%2==0){
//				sum2 +=x;
//			}
//		}
//		System.out.println(sum2);
		
		/*������5�Ľ׳ˡ�*/
//		int sum=1;
//		for(int x=1;x<=5;x++){
//			sum *= x;
//		}
//		System.out.println(sum);
//		System.out.println(1*2*3*4*5);
		
		/*�����ڿ���̨������еġ�ˮ�ɻ�����*/
//		int sum = 0;
//		for(int x=100;x<=999;x++){
//			int ge = x%10;
//			int shi= x/10%10;
//			int bai= x/100%10;
//			if((ge*ge*ge)+(shi*shi*shi)+(bai*bai*bai)==x){
//				System.out.println(x);
//					sum ++;
//			}
//		}
//		System.out.println("ˮ�ɻ���"+sum);
	/*	��ϰ��
		���ڿ���̨�������������������λ��
		��λ������λ
		ʮλ����ǧλ
		��λ+ʮλ+ǧλ+��λ=��λ*/
//		for(int x=10000;x<=99999;x++){
//			int g = x%10;
//			int s = x/10%10;
//			int b = x/100%10;
//			int q = x/1000%10;
//			int w = x/10000%10;
//			if(g==w&s==q&g+s+q+w==b){
//				System.out.println(x);
//			}
//		}
		/*
	������ͳ��1-1000֮��ͬʱ�������������������ж��ٸ���
			��3������2
			��5������3
			��7������2*/	
//		for(int x=1;x<=1000;x++){
//			if(x%3==2&x%5==3&x%7==2){
//				System.out.println(x);
//			}
//		}
		
//		Scanner sc = new Scanner(System.in);
//		byte day = sc.nextByte();
//
//		if(day>7|day<1){
//		    System.out.println("�������");
//		}else if(day==1){
//		    System.out.println("Monday");
//		}else if(day==2){
//		    System.out.println("Tuesday");
//		}else if(day==3){
//		    System.out.println("Wednesday");
//		}else if(day==4){
//		    System.out.println("Thursday");
//		}else if(day==5){
//		    System.out.println("Friday");
//		}else if(day==6){
//		    System.out.println("Saturday");
//		}else{
//		    System.out.println("Sunday");
//		}
		
		/*while ѭ����ϵ
		��������Ρ������ǡ����Ρ��žų˷���
		 */
//		for(int i=0;i<8;i++){			//��������
//			System.out.println();		
//			for(int j=7;j>i;j--)		//�������ո�
//				System.out.print("&");	
//			for(int j=0;j<=i;j++)		//��Ϊ�ո�����������ҵ�ֱ��������
//				System.out.print("*");
//			for(int j=0;j<i;j++)		//����ұ�
//				System.out.print("*");
//		}
		//��while ������������Ρ����Σ�done!

//		int h=0;
//		while(h<6){			
//			h++;
//			System.out.println();
//			
//			int e=7;
//			while(e>h){
//				e--;	
//			System.out.print(" ");				
//			}
//			int f=1;
//			while(f<h){
//				f++;
//			System.out.print("*");
//			}
//			int g=0;
//			while(g<h){
//				g++;
//			System.out.print("*");
//			}
//		}	
//		
//		int a=0;
//		while(a<6){			
//			a++;
//			System.out.println();
//						
//			int b=0;
//			while(b<a){
//				b++;	
//			System.out.print(" ");				
//			}
//			int c=6;
//			while(c>a){
//				c--;
//			System.out.print("*");
//			}
//			int d=7;
//			while(d>a){
//				d--;
//			System.out.print("*");
//			}
//		}
		//While ��� 99�˷���Done
		int x=0;
		while(x<9){
			x++;
			System.out.println();
			
			int y=0;
			while(y<x){
				y++;
				System.out.print(x+"*"+y+"="+(x*y)+"\t");
			}
		}
	}
}
