import java.util.*;
public class Test19 {

	public static void main(String[] args) {
	//将数组下标为0的位置的值设为0，用下标1位置的值表示第一次掉落或反弹
		double[] fall = new double[11];//掉落
		double[] rebound = new double[11];//反弹
		int sum = 0;//第n次落地时经过的总距离
		fall[0] = 0;fall[1] = 100;
		rebound[0] = 0;rebound[1] = 50;
		for(int i=2;i<11;++i){
			fall[i] = rebound[i-1];
			rebound[i] = fall[i]/2;
		}
		for(int i=1;i<10;++i){
			sum+=fall[i]+rebound[i];
		}
		sum+=fall[10];
		System.out.println("该球在第10次落地时，共经过距离为"+sum+"米");
		System.out.println("该球第10次反弹高"+rebound[10]+"米");
		
	}

}