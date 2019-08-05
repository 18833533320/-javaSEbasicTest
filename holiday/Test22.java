public class Test22 {
	public static void main(String[] args) {
		System.out.println("100-999之间的水仙花数有：");
		for (int i = 100; i <= 999; i++) {
			int ge = i % 10;              //取出三位数的个位
			int shi = i / 10 % 10;        //取出三位数的十位
			int bai = i / 10 / 10 % 10;	  //取出三位数的百位
			if (i == (ge * ge * ge) + (shi * shi * shi) + (bai * bai * bai)) {
			    System.out.println(i);
			}
		}
	}
}