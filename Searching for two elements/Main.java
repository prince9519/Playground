import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a[]=new int[n];
      for(int i=0;i<=n-1;i++)
      {
        a[i]=in.nextInt();
      }
      int se1=in.nextInt();
      int se2=in.nextInt();
      int see1=-1;
      int see2=-1;
      for(int i=0;i<=n-1;i++)
      {
        if(se1==a[i])
          {
          see1=i;
        }
        if(se2==a[i])
        {
          see2=i;
        }
      }
      System.out.println(see1);
      System.out.println(see2);
    }
    }
