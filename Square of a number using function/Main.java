import java.util.Scanner;
class Main
{
	public static int sqare(int n)
    {
	int a=n*n;
      return a;
	}
  
	public static void main (String[] args)
    {
      Scanner in=new Scanner(System.in);
      int a=in.nextInt();
      int b=sqare(a);
      System.out.print(b);
      
}
}