import java.util.Scanner;
class Main{
	public static void main (String[] args) {
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      
        
        int l=n1%10;
         n1=n1/100;
      int f=n1%10;
        int sum=f+l;
        System.out.print(sum);
      
		// Type your code here
	}
}