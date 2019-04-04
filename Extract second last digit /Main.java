import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code 
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      n1=n1/10;
      int n2=n1%10;
      System.out.print(n2);
	}
}