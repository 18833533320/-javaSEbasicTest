import java.util.*;
public class Test19 {

	public static void main(String[] args) {
	//�������±�Ϊ0��λ�õ�ֵ��Ϊ0�����±�1λ�õ�ֵ��ʾ��һ�ε���򷴵�
		double[] fall = new double[11];//����
		double[] rebound = new double[11];//����
		int sum = 0;//��n�����ʱ�������ܾ���
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
		System.out.println("�����ڵ�10�����ʱ������������Ϊ"+sum+"��");
		System.out.println("�����10�η�����"+rebound[10]+"��");
		
	}

}