import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int p=1;
      while(n!=0)
      {
         p=p*n;
        n--;
      }
      System.out.print(p);
      
	}
}