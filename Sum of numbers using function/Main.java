import java.util.Scanner;
class Main{
	public static int sum(int y)
    {
	   int s=0;
      for(int i=1;i<=y;i++)
      {
        s=s+i;
        
      }
      return s;
    }
	public static void main (String[] args)
    {
      Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int b=sum(a);
      System.out.print(b);
      
	}
}