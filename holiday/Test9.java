public class Test9 {
    static void top() //top是输出上边的三角部分
    {
    for(int a=1;a<=3;a++){
        for(int b=1;b<=3-a+1;b++)
    System.out.print(" ");
        for(int c=1;c<=2*a-1;c++){
            if(c==1||c==2*a-1) 
    System.out.print("*");
    else
    System.out.print(" ");
    }
        System.out.println();
        }
}

static void bottom() //输出下边正方体部分
{
    int i;
    int j;
    for (i=1;i<=7;i++)
    {
    for(j=1;j<=7;j++)
    {if((i==1)|(i==7))
    {
    System.out.print("*");
    }
    else
    {
    if((j==1)|(j==7))
        System.out.print("*");
    else 
    System.out.print(" ");
    }
    }
    System.out.print("\n");
    }
}

public static void main(String[] args) {
    System.out.println("你家");
    top();
    bottom();
    }
}