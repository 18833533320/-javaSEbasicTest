public class Test22 {
	public static void main(String[] args) {
		System.out.println("100-999֮���ˮ�ɻ����У�");
		for (int i = 100; i <= 999; i++) {
			int ge = i % 10;              //ȡ����λ���ĸ�λ
			int shi = i / 10 % 10;        //ȡ����λ����ʮλ
			int bai = i / 10 / 10 % 10;	  //ȡ����λ���İ�λ
			if (i == (ge * ge * ge) + (shi * shi * shi) + (bai * bai * bai)) {
			    System.out.println(i);
			}
		}
	}
}