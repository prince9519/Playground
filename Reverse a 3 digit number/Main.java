import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in=new Scanner(System.in);
    int n1=in.nextInt();
    int num=0,rem;
    while(n1>0)
    {
      rem=n1%10;
      num=num*10+rem;
      n1=n1/10;
    }
    System.out.print(num);
  }
}