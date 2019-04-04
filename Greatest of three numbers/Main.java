import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in =new Scanner(System.in);
      // get three input from user
      int num1=in.nextInt();
      int num2=in.nextInt();
      int num3=in.nextInt();
      // compair num1 and num2
      if(num1>num2)
      {
        //compair num1 and num3
        if(num1>num3)
        {
          System.out.print(num1);
        }
        else
        {
          System.out.print(num3);
        }
      }
      else
      {
        // compair num2 and num3
        
        if(num2>num3)
        {
          System.out.print(num2);
        }
        else
        {
          System.out.print(num3);
        }
      }
    }
}