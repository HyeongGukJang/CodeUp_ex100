package ex1003_1010;

import java.util.Scanner;

public class Code {
	Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new Code();
	}

	public Code() {
//		ex1003();
//		ex1004();
//		ex1005();
//		ex1006();
//		ex1007();
//		ex1008();
//		ex1010();
//		ex1011();
//		ex1012();
//		ex1013();
//		ex1014();
//		ex1015();
//		ex1017();
//		ex1018();
//		ex1019();
//		ex1020();
//		ex1021();
//		ex1024();
//		ex1025();
//		ex1026();
//		ex1027();
//		ex1028();
//		ex1029();
//		ex1030();
//		ex1031();
//		ex1032();
//		ex1033();
//		ex1034();
//		ex1035();
//		ex1036();
//		ex1037();
//		ex1038();
//		ex1039();
//		ex1040();
//		ex1041();
//		ex1042();
//		ex1043();
		ex1044();
	}

	private void ex1003() {
		System.out.println("Hello\nworld");
	}

	private void ex1004() {
		System.out.println("'Hello'");
	}

	private void ex1005() {
		System.out.println("\"Hello World\"");
	}

	private void ex1006() {
		System.out.println("\"!@#$%^&()*\"");
	}

	private void ex1007() {
		System.out.println("\"C:\\Download\\hello.cpp\"");
	}

	private void ex1008() {
		System.out.println("\u250C\u252C\u2510");
		System.out.println("\u251C\u253C\u2524");
		System.out.println("\u2514C\u2534C\u2518");
	}

	private void ex1010() {
		int n = 3;
		System.out.println(n);
	}

	private void ex1011() {
		char x = sc.next().charAt(0);
		System.out.println(x);
	}

	private void ex1012() {
		float x = sc.nextFloat();
		System.out.println(x);
	}

	private void ex1013() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.printf("%d,%d", a, b);
	}

	private void ex1014() {
		char a = sc.next().charAt(0);
		char b = sc.next().charAt(0);
		System.out.printf("%s, %s", b, a);
	}

	private void ex1015() {
		float a = sc.nextFloat();
		System.out.printf("%.2f", a);
	}

	private void ex1017() {
		int a = sc.nextInt();
		System.out.printf("%d, %d, %d", a, a, a);
	}

	private void ex1018() {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		while (h >= 24) {
			System.out.println("시간(시)을 다시 입력하세요..:");
			h = sc.nextInt();
			if (h <= 24)
				break;
		}
		int m = sc.nextInt();
		while (m >= 59) {
			System.out.println("시간(분)을 다시 입력하세요... : ");
			m = sc.nextInt();
			if (m <= 59)
				break;
		}
		System.out.printf("%d:%d", h, m);
	}

	private void ex1019() {
		int y = sc.nextInt();
		int m = sc.nextInt();
		int d = sc.nextInt();
		while (y >= 10000) {
			System.out.println("날짜(년)을 다시 입력하세요... :");
			y = sc.nextInt();
			if (y < 10000)
				break;
		}
		while (m >= 13) {
			System.out.println("날짜(월)을 다시 입력하세요... :");
			m = sc.nextInt();
			if (m < 13)
				break;
		}
		while (d >= 32) {
			System.out.println("날짜(일)을 다시 입력하세요... :");
			d = sc.nextInt();
			if (d < 32)
				break;
		}
		System.out.printf("%d.%d.%d", y, m, d);
	}

	private void ex1020() {
		String num = sc.next();
		num = num.replaceAll("-", "");
		System.out.println(num);
	}

	private void ex1021() {
		char a = sc.next().charAt(0);
		System.out.println(a);
	}
	
	private void ex1024() {
		String a = sc.next();
		char list[] = new char[a.length()];
		
		for (int i = 0; i< a.length(); i++) {
			list[i]=a.charAt(i);
		}
		for (char i:list) {
			System.out.println("'"+i+"'");
		}
	}
	private void ex1025() {
		String num = sc.next();
		int list[] = new int[num.length()];
		
		for(int i = 0; i<num.length(); i++) {
			list[i]=num.charAt(i)-'0';
		}
		System.out.println("["+list[0]*10000+"]");
		System.out.println("["+list[1]*1000+"]");
		System.out.println("["+list[2]*100+"]");
		System.out.println("["+list[3]*10+"]");
		System.out.println("["+list[4]+"]");
	}
	private void ex1026() {
		int h = sc.nextInt();
		int m = sc.nextInt();
		int s = sc.nextInt();
		while (h >= 24) {
			System.out.println("시간(시)을 다시 입력하세요..:");
			h = sc.nextInt();
			if (h <= 24)
				break;
		}
		while (m >= 59) {
			System.out.println("시간(분)을 다시 입력하세요... : ");
			m = sc.nextInt();
			if (m <= 59)
				break;
		}
		while(s >= 61) {
			System.out.println("시간(초)를 다시 입력하세요... : ");
			s = sc.nextInt();
			if(s <= 61)
				break;
		}
		System.out.printf("입력은 %d, %d, %d", h, m, s);
		System.out.println("\n");
		System.out.printf("%d", m ,"입니다.");
	}
	
	private void ex1027() {
		String a = sc.next();
		a=a.replace(".", "-");
		String list[] = a.split("-");
		System.out.println(list[2]+"-"+list[1]+"-"+list[0]);
	}
	
	private void ex1028() {
		long n = sc.nextLong();
		System.out.println(n);
	}
	
	private void ex1029() {
		double n = sc.nextDouble();
		System.out.println(n);
	}
	
	private void ex1030() {
		long n = sc.nextLong();
		System.out.println(n);
	}
	
	private void ex1031() {
		String a = Integer.toOctalString((sc.nextInt())); // 8진수 변환
		System.out.println(a);
	}
	private void ex1032() {
		String a = Integer.toHexString((sc.nextInt()));
		System.out.println(a);
	}
	private void ex1033() {
		String a = Integer.toHexString((sc.nextInt()));
		System.out.println(a.toUpperCase());
	}
	private void ex1034() {
		int a = Integer.valueOf(sc.next(),8);
		System.out.println(a);
	}
	private void ex1035() {
		int a = Integer.valueOf(sc.next(),16);
		String b = Integer.toOctalString(a);
		System.out.println(b);
	}
	private void ex1036() {
		char a = sc.next().charAt(0);
		System.out.println(a);
	}
	private void ex1037() {
		// 정수를 입력받아 아스키 문자로 출력하는 방법 (char)sc.nextInt();
		// 아스키 문자를 입력받아 정수를 출력하는 방법 (int)sc.next().charAt(0);
		int a = (int)sc.next().charAt(0);
		System.out.println(a);
	}
	private void ex1038() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		ex1038_sum(a, b);
	}

	private void ex1038_sum(int a, int b) {
		int c = a + b;
		System.out.println(c);
	}
	
	private void ex1039() {
		Long a = sc.nextLong();
		Long b = sc.nextLong();
		System.out.println(a + b);
	}
	
	private void ex1040() {
		int a = sc.nextInt();
		System.out.printf("%d", -a);
	}
	
	private void ex1041() {
		char a = sc.next().charAt(0);
		System.out.printf("%c", a+1);
	}
	
	private void ex1042() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		mul(a, b);
	}
	private void mul(int a, int b) {
		int c = a/b;
		System.out.println(c);
	}
	
	private void ex1043() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		rest(a, b);
	}
	private void rest(int a, int b) {
		int c = a%b;
		System.out.println(c);
	}
	private void ex1044() {
		int a = sc.nextInt();
		System.out.println(a+1);
	}
}
