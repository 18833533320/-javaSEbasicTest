import java.util.*; 
public class Day02E2T1 {
public class Zifutongji{
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "123456789012";
		char[] chs = s.toCharArray();
		int oddsum=0,evensum=0;
		for (int i = 0; i < chs.length; i++) {
			if(chs[i] % 2 != 0) {
				oddsum+=chs[i]-'0';
			}
			if(chs[i] %2 == 0) {
				evensum+=chs[i]-'0';
			}
		}
		System.out.println("奇数数字相加之和："+oddsum);
		System.out.println("偶数数字相加之和："+evensum);
	}
 
}