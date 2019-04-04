import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   //Type your code 
   
    Scanner in=new Scanner(System.in);
      int n=in.nextInt();
    int x;
    for(x=1;x<=n;++x)
    {
      System.out.print(x);
      if((x%3==0)&&(n!=0))
       
      {System.out.print(",");
      }
      }  
  }
}