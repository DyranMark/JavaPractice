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
		
		int x = 4;
		int y = (x--)+(--x)+(x*10); //�� x ��� --��ȫ�������ڶ���x�����㣬��һ��x���䣬�ڶ���x֮���x ����2
		//4+6+60
		//x=5,6
		System.out.println("y:"+y);
		
		int a = 4;
		int b = (a++)+(a++)+(--a)+(a*10);//         4  6    50
		System.out.println(b);
	}
}
