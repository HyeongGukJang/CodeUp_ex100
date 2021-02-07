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
//		ex1069();
//		ex1070();
//		ex1071();
//		ex1072();
//		ex1073();
//		ex1074();
//		ex1075();
//		ex1076();
//		ex1077();
//		ex1078();
//		ex1079();
		ex1080();
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
		} else
			System.out.println("odd");
		if (b % 2 == 0) {
			System.out.println("even");
		} else
			System.out.println("odd");
		if (c % 2 == 0) {
			System.out.println("even");
		} else
			System.out.println("odd");
	}

	private void ex1067() {
		int a = sc.nextInt();
		if (a < 0 || a % 2 == 0) {
			System.out.println("minus");
			System.out.println("even");
		} else if (a > 0 || a % 2 != 0) {
			System.out.println("plus");
			System.out.println("odd");
		}
	}

	private void ex1068() {
		int num = sc.nextInt();
		if (100 >= num && num >= 90) {
			System.out.println("A");
		} else if (89 >= num && num >= 70) {
			System.out.println("B");
		} else if (69 >= num && num >= 40) {
			System.out.println("C");
		} else if (39 >= num && num >= 0) {
			System.out.println("D");
		}
	}

	private void ex1069() {
		char answer = sc.next().charAt(0);
		switch (answer) {
		case 'A':
			System.out.println("best!!!");
			break;
		case 'B':
			System.out.println("good!!");
			break;
		case 'C':
			System.out.println("run!");
			break;
		case 'D':
			System.out.println("slowly~");
			break;
		default:
			System.out.println("what?");
		}
	}

	private void ex1070() {
		int month = sc.nextInt();
		if (month == 12 || month == 1 || month == 2) {
			System.out.println("winter");
		} else if (month == 3 || month == 4 || month == 5) {
			System.out.println("spring");
		} else if (month == 6 || month == 7 || month == 8) {
			System.out.println("summer");
		} else
			System.out.println("fall");
	}

	private void ex1071() {
		while (true) {
			int a = sc.nextInt();
			if (a == 0)
				break;
			System.out.println(a);
		}
	}

	private void ex1072() {
		int a = sc.nextInt();
		int m[] = new int[a];

		for (int i = 0; i < a; i++) {
			m[i] = sc.nextInt();
		}
		for (int i = 0; i < a; i++) {
			System.out.println(m[i]);
		}
	}

	private void ex1073() {
		while (true) {
			int a = sc.nextInt();
			System.out.println(a);
			if (a == 0)
				break;
		}
	}

	private void ex1074() {
		int a = sc.nextInt();
		while (a > 100) {
			System.out.println("수를 초과 다시입력 : ");
			a = sc.nextInt();
		}
		while (a != 0) {
			System.out.println(a);
			a--;
		}
	}

	private void ex1075() {
		int a = sc.nextInt();
		while (a > 100) {
			System.out.println("수를 초과 다시입력 : ");
			a = sc.nextInt();
		}
		while (a != 0) {
			System.out.println(a);
			a--;
		}
	}

	private void ex1076() {
		System.out.println("알파벳입력 : ");
		char a = sc.next().charAt(0);
		char b = 'a';
		do {
			System.out.println(b + " ");
			b += 1;
		} while (b <= a);
	}

	private void ex1077() {
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();

		for (int i = 0; i <= a; i++) {
			System.out.println(i);
		}
	}

	private void ex1078() {
		System.out.print("정수 입력 : ");
		int a = sc.nextInt();

		int sum = 0;
		for (int i = 1; i <= a; i++) {
			if (i % 2 == 0) {
				sum += i;
			}
		}
		System.out.print(sum);
	}

	private void ex1079() {
		System.out.print("문자입력 : ");
		while (true) {
			char a = sc.next().charAt(0);

			if (a == 'q') {
				System.out.println(a);
				break;
			}
			System.out.println(a);
		}
	}

	private void ex1080() {
        System.out.print("정수입력 : ");
        int a = sc.nextInt();
        
        int sum=0;
        int count=0;
        if(a>=0&&a<=1000) {
            while(sum<a) {
                count++;
                sum+=count;
            }
        }
        System.out.println(count);
	}
	private void ex1081() {

	}
}
