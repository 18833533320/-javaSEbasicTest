import java.util.*;
 
public class Test8502 {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//һ����λ�����������λ�����ĺ�
		System.out.println("������һ��1~1000��������");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b, c, d, e, sum;
		e = a / 1000;
		b = a / 100 % 10;
		c = a  / 10 % 10;
		d = a % 10;
		sum = b +c +d +e;
		System.out.println("���Ϊ" + sum);
 
	}
 
}