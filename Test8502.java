import java.util.*;
 
public class Test8502 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//一个三位数整数，求各位整数的和
		System.out.println("请输入一个1~1000的整数：");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b, c, d, e, sum;
		e = a / 1000;
		b = a / 100 % 10;
		c = a  / 10 % 10;
		d = a % 10;
		sum = b +c +d +e;
		System.out.println("结果为" + sum);
 
	}
 
}