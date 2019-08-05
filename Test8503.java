import java.util.*;
public class Test8503 {
public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("请输入该月的利润：");
		int I = s.nextInt();
		long sum = 0L;
		
		if(I <= 100000) {
			sum = I / 100 * 10;
		}else if(I < 200000) {
			sum = (long) (100000 / 100 * 10 + (I - 100000) / 100 * 7.5);
		}else if(I < 400000) {
			sum = (long) (100000 / 100 * 10 + 100000 / 100 * 7.5 + (I - 200000) / 100 * 5);
		}else if(I < 600000) {
			sum = (long) (100000 / 100 * 10 + 100000 / 100 * 7.5 + 200000 / 100 * 5 + (I - 400000) / 100 * 3);
		}else if(I < 1000000) {
			sum = (long) (100000 / 100 * 10 + 100000 / 100 * 7.5 + 200000 / 100 * 5 + 200000 / 100 * 3 +(I - 600000) / 100 * 1.5);
		}else {
			sum = (long) (100000 / 100 * 10 + 100000 / 100 * 7.5 + 200000 / 100 * 5 + 200000 / 100 * 3 + 400000 / 100 * 1.5 + (I - 1000000) / 100);
		}
		
		System.out.println("该月发放的奖金为：" + sum);
	}
}