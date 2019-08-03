public class Test7 {
    public static void main(String[] args) {
    //打印实心正方形
        for(int i=1;i<=10;i++) {
		//控制实心正方形的行
            for(int j=1;j<=10;j++) {
		//控制实心正方形的列
                System.out.print("*"+" ");
                }
            System.out.println();
            }
        System.out.println("################");
        //打印空心正方形
        for(int k=1;k<=11;k++) {
            if(k>1&&k<11) {
                System.out.println("*                   *");
              }else {
            System.out.println("* * * * * * * * * * *");
        }
     }
   }
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
   
}