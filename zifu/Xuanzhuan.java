import java.util.Scanner; 
public class Xuanzhuan {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("������һ������");
    long num = sc.nextLong();
    long sum = 0;
    while (num != 0) {
        sum = sum * 10 + num % 10;
        num = num / 10;
    }
    System.out.println("������ķ�ת����" + sum);

}
}