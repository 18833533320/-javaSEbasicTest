import java.util.*;
 
public class Test24{
 
	public static void main(String[] args) {
 
		int n = 8;// n ����
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add("Person" + i);
		}
		//�۲����
		// 0  1  2  3  4  5  6  7
		// p0 p1 p2 p3 p4 p5 p6 p7 -->2 %list.size() = 2
		// p0 p1 p3 p4 p5 p6 p7 -->4%lits.seze() = 4
		// p0 p1 p3 p4 p6 p7 -->6 %list.size() = 0
		// p1 p3 p4 p6 p7 -->2 %list.size() = 2
		// p1 p3 p6 p7 -->4 %list.size() = 0
		// p3 p6 p7 -->2 %list.size() = 2
		// p3 p6  -->4 %list.size() = 0
		// p6  -->ʣ�� 6
		//
 
		// ���ݹ��ɷ��֡�ÿ���±�+2 �� �Լ��ϳ���ȡ��� �պ���Ҫɾ����λ�á�
		int tag = 0;
		while (list.size() > 1) {// �����ֻʣ��һ���� ��Ȧ����		
			tag += 2;
			tag %= list.size();
			list.remove(tag);
			// list.remove(tag = (tag + 2) % list.size());//�ȼ�������3�д���
		}
		System.out.println("������µ�λ�ã�"+list.get(0));// �۲����һ�����������ˡ�
 
	}
 
}