import java.util.Scanner;
class Main{
		public static int two(int n,int m)
    {
      int min;
      if(n>m)
        min=n; 
        else
          min= m;
      return min;
	    
	}
  public static void main (String[] args)
  {
    Scanner in=new Scanner(System.in);
     int n1=in.nextInt();
    int n2=in.nextInt();
    int n3=in.nextInt();
    int result=two(n1,n2);
    System.out.print(two(result,n3));
}
}	
