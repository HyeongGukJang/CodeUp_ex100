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
		ex1059();
		
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
		if(answer == 1) {
			System.out.println("0");
		}else if(answer == 0) {
			System.out.println("1");
		}
	}
	private void ex1054() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a == 1 && b == 1) {
			System.out.println("참");
		}
	}
	private void ex1055() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a == 1 && b == 1 || a == 0 && b == 0) {
			System.out.println("참");
		}
	}
	private void ex1056() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a == 1 && b==0 || a == 0 && b == 1) {
			System.out.println("참");
		}
	}
	private void ex1057() { 
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a == 1 && b == 1 || a == 0 && b == 0) {
			System.out.println("참");
		}  
	}
	private void ex1058() {
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(a == 0 && b == 0) {
			System.out.println("참");
		}
	}  
	private void ex1059() {

	}
}
