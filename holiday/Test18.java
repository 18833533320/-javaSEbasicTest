
public class Test18 {
	public static void main(String[] args)
	{	
		
		
		
		
		
		for(int i=1;i<=1000;++i)
		{
			if(IsComplete(i))
				System.out.println(i);
			else continue;
		}
	}
	public static boolean IsComplete(int n)
	{
		//判断是否为完数
		int sum=0;
		for(int i=1;i<=n/2;++i)
		{
			if(n%i==0)
			{
				sum+=i;
			}
		}
		if(sum==n)
		{
			return true;
		}
		else return false;
	}
}
