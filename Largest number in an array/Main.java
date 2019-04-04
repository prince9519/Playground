import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<=n-1;i++)
      {
        a[i]=in.nextInt();
      }
      int maxno;
      if(a[0]>a[1])
      {
        maxno=a[0];
      }
      else
      {
        maxno=a[1];
      }
      for(int i=0;i<=n-1;i++)
      {
        if(maxno<a[i])
        {
          maxno=a[i];
        }
      }
        System.out.println(maxno);
      }
        
    }

