import java.util.Scanner;
public class Fibonacci {
 public static void main(String[] args)
{
  Scanner sc = new Scanner(System.in);
System.out.printf("Enter the number of terms: ");
int n = sc.nextInt();

int first=0,second = 1;
System.out.printf("Fibonacci Series: " + first + " " + second);
 for(int i = 2; i < n; i++)
{
int next = first + second;
System.out.print(" " + next);
first = second;
second = next;
}
sc.close();
 }
}