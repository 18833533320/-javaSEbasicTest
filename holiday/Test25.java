import java.util.*;

public class Test25 {

    public static int shuzi() {
        Scanner s = new Scanner(System.in);
        System.out.println("请输入一个四位数:");
        int i = s.nextInt();
        return i;
    }

    public static int jiami(int i) {
        int a, aa, aaa, aaaa;
        a = i / 1000;
        aa = i / 100 % 10;
        aaa = i / 10 % 10;
        aaaa = i % 10;

        a = (a + 5) % 10;
        aa = (aa + 5) % 10;
        aaa = (aaa + 5) % 10;
        aaaa = (aaaa + 5) % 10;

        int o = 0;
        o = a;
        a = aaaa;
        aaaa = o;

        o = aa;
        aa = aaa;
        aaa = o;

        System.out.println("加密后的数字位为:" + a + aa + aaa + aaaa);

        return 0;
    }

    public static void main(String[] args) {
        int i = shuzi();
        jiami(i);
    }
}