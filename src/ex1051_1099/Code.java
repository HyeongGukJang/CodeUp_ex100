package ex1051_1099;

import java.util.Scanner;

public class Code {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		new Code();
	}

	public Code() {
//		ex1051();
//		ex1052();
//		ex1053();
//		ex1054();
//		ex1055();
//		ex1056();
//		ex1057();
//		ex1058();
//		ex1059();
//		ex1060();
//		ex1061();
//		ex1062();
//		ex1063();
//		ex1064();
//		ex1065();
//		ex1066();
//		ex1067();
//		ex1068();
		ex1069();
		
	}

	private void ex1051() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		isMoreBig(a, b);
	}

	private void isMoreBig(int a, int b) {
		if (b > a) {
			System.out.println("1");
		} else
			System.out.println("0");
	}

	private void ex1052() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		isSame(a, b);
	}

	private void isSame(int a, int b) {
		if (a != b) {
			System.out.println("1");
		} else
			System.out.println("0");
	}

	private void ex1053() {
		int answer = sc.nextInt();
		if (answer == 1) {
			System.out.println("0");
		} else if (answer == 0) {
			System.out.println("1");
		}
	}

	private void ex1054() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a == 1 && b == 1) {
			System.out.println("참");
		}
	}

	private void ex1055() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a == 1 && b == 1 || a == 0 && b == 0) {
			System.out.println("참");
		}
	}

	private void ex1056() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a == 1 && b == 0 || a == 0 && b == 1) {
			System.out.println("참");
		}
	}

	private void ex1057() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a == 1 && b == 1 || a == 0 && b == 0) {
			System.out.println("참");
		}
	}

	private void ex1058() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (a == 0 && b == 0) {
			System.out.println("참");
		}
	}

	private void ex1059() {
		int a = sc.nextInt();
		System.out.println(~a);
	}

	private void ex1060() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a & b);
	}

	private void ex1061() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a | b);
	}

	private void ex1062() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a ^ b);
	}

	private void ex1063() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a > b ? "0" : "1");
	}

	private void ex1064() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int min = (a > b ? b > c ? c : b : a > c ? c : a);
		System.out.println(min);
	}

	private void ex1065() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a % 2 == 0) {
			System.out.printf("%d", a);
		}
		if (b % 2 == 0) {
			System.out.printf("%d", b);
		}
		if (c % 2 == 0) {
			System.out.printf("%d", c);
		}
	}

	private void ex1066() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a % 2 == 0) {
			System.out.println("even");
		}else
			System.out.println("odd");
		if (b % 2 == 0) {
			System.out.println("even");
		}else
			System.out.println("odd");
		if (c % 2 == 0) {
			System.out.println("even");
		}else
			System.out.println("odd");
	}
	private void ex1067() {
		int a = sc.nextInt();
		if(a < 0 || a % 2 == 0) {
			System.out.println("minus");
			System.out.println("even");
		}else if(a > 0 || a % 2 != 0){
			System.out.println("plus");
			System.out.println("odd");
		}
	}
	private void ex1068() {
		int num = sc.nextInt();
		if(100 >= num && num >= 90) {
			System.out.println("A");
		}else if(89 >= num && num >= 70) {
			System.out.println("B");
		}else if(69 >= num && num >= 40) {
			System.out.println("C");
		}else if(39 >= num && num >= 0) {
			System.out.println("D");
		}
	}
	private void ex1069() {
		
	}
}
