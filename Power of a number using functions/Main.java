import java.util.Scanner;
class Main
{
  public static int pow(int base,int exponent)
  {
   int p=1;
    while(exponent>0)
    {
      p=p*base;exponent--;
    }
     return p;
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
   int m=in.nextInt();
    int sum=pow(n,m);
    System.out.print(sum);
  }
}

     