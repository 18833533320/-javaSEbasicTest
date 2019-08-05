import java.util.Scanner; 
public class test010 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入一个表达式(例如： 5 + 3)：");
		int a = sc.nextInt();
		char ch = sc.next().charAt(0);
		int b = sc.nextInt();
		switch (ch) {
		case '+':
			jia(a, b);
			break;
		case '-':
			jian(a, b);
			break;
		case '*':
			cheng(a, b);
			break;
		case '/':
			chu(a, b);
			break;
		default:
			System.out.println("输入错误");
			break;
		}
	}
 
	private static void cheng(int a, int b) {
		int sum = a * b;
		System.out.println("两数积：" + sum);
	}
 
	private static void jian(int a, int b) {
		int sum = a - b;
		System.out.println("两数差：" + sum);
	}
 
	private static void chu(int a, int b) {
		if (b == 0) {
			System.out.println("除数不能为零~");
		} else {
			int sum = a / b;
			System.out.println("两数商：" + sum);
		}
	}
	private static void jia(int a, int b) {
		int sum = a + b;
		System.out.println("两数和：" + sum);
	}
}