import java.util.Scanner;
public class Palindrome
{
	public static void main(String  args[])
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
         int n = sc.nextInt();
      int m,rev=0,t;
		t=n;
		while(n!=0)
		{
			m=n%10;
			rev=rev*10+m;
			n=n/10;
		}
		if(t==rev)
		{
			System.out.println("NUMBER IS PALINDROME");
		}
		else
		  System.out.println("NUMBER IS  NOT PALINDROME");
	}
}
