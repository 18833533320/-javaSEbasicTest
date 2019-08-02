
import java.util.Scanner;
public class test16 {
    public static void main(String[] args) {
	    Scanner console = new Scanner(System.in);
		System.out.print(" ‰»ÎΩ·π˚:");
		int rows = console.nextInt();
		int size = 10;
		int pages = pages(rows, size);
		System.out.println(pages);
    }
	public static int pages(int rows, int size) {
	    return rows % size == 0 ? rows / size : rows / size + 1;
    }
}