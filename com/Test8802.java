package cm.com;

public class Test8802 {
	public static void main(String[] args)
	{
	    float fl=9%4;//����ȡ��󸡵����͵Ľ��
	    double da=9+4.5;    //˫���ȼӷ�
	    double db=9-3.0;    //˫���ȼ���
	    double dc=9*2.5;    //˫���ȳ˷�
	    double dd=9/3.0;    //˫���ȳ���
	    double de=9%4;    //˫����ȡ��
	    System.out.println("\n��������������");
	    System.out.printf("9+4=%d \n",9+4);
	    System.out.printf("9-4=%d \n",9-4);
	    System.out.printf("9*4=%d \n",9*4);
	    System.out.printf("9/4=%d \n",9/4);
	    System.out.printf("9%%4=%d \n",9%4);
	    System.out.println("\n����������������");    //�������ļӡ������ˡ�����ȡ��
	    System.out.printf("9+4.5f=%f \n",9+4.5f);
	    System.out.printf("9-3.0f=%f \n",9-3.0f);
	    System.out.printf("9*2.5f=%f \n",9*2.5f);
	    System.out.printf("9/3.0f=%f \n",9/3.0f);
	    System.out.printf("9%%4=%f \n",1f);
	    System.out.println("\n˫����������������");    //˫�������ļӡ������ˡ�����ȡ��
	    System.out.printf("9+4.5=%4.16f \n",da);
	    System.out.printf("9-3.0=%4.16f \n",db);
	    System.out.printf("9*2.5=%4.16f \n",dc);
	    System.out.printf("9/3.0=%4.16f \n",dd);
	    System.out.printf("9%%4=%4.16f \n",de);
	    System.out.println("\n�ַ�����������");    //���ַ��ļӷ��ͼ���
	    System.out.printf("'A'+32=%d \n",'A'+32);
	    System.out.printf("'A'+32=%c \n",'A'+32);
	    System.out.printf("'a'-'B'=%d \n",'a'-'B');
	}
}
