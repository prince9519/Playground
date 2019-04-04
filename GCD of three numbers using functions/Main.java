import java.util.Scanner;
public class Main{
	public static int fact(int n,int m)
	{
      int min;
      if(n<m)
      {
        min=n;
      }
      else
      {
        min=m;
      }
      while(min>=1)
      {
        if((n%min==0)&&(m%min==0))
        {
          return min;
        }
        min--;
      }
      return 0;
    }
  	public static void main (String[] args)
    {
      Scanner in=new Scanner(System.in);
    int n1=in.nextInt();
        int n2=in.nextInt();
        int n3=in.nextInt();
       int result=fact(n1,n2);
      System.out.print(fact(result,n3));
    }
    }
