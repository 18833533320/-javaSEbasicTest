import java.util.*;
 
public class Test24{
 
	public static void main(String[] args) {
 
		int n = 8;// n 个人
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add("Person" + i);
		}
		//观察规律
		// 0  1  2  3  4  5  6  7
		// p0 p1 p2 p3 p4 p5 p6 p7 -->2 %list.size() = 2
		// p0 p1 p3 p4 p5 p6 p7 -->4%lits.seze() = 4
		// p0 p1 p3 p4 p6 p7 -->6 %list.size() = 0
		// p1 p3 p4 p6 p7 -->2 %list.size() = 2
		// p1 p3 p6 p7 -->4 %list.size() = 0
		// p3 p6 p7 -->2 %list.size() = 2
		// p3 p6  -->4 %list.size() = 0
		// p6  -->剩下 6
		//
 
		// 根据规律发现。每次下标+2 后 对集合长度取余后 刚好是要删除的位置。
		int tag = 0;
		while (list.size() > 1) {// 当最后只剩下一个后 出圈结束		
			tag += 2;
			tag %= list.size();
			list.remove(tag);
			// list.remove(tag = (tag + 2) % list.size());//等价与上面3行代码
		}
		System.out.println("最后留下的位置："+list.get(0));// 观察最后一个留下来的人。
 
	}
 
}