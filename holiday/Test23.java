public class Test23 {

	public static void main(String[] args) {
		int g, m, x;
		for (g = 0; g <= 20; g++) {
			for (m = 0; m <= 33; m++) {
				for (x = 0; x <= 100; x++) {
					if ((5 * g + 3 * m + x / 3 == 100) && (g + m + x == 100))
						System.out.println("����"+g+"ֻ��ĸ��"+m+"ֻ��С��" +x+"ֻ��\n");
				}
			}
		}
	}

}