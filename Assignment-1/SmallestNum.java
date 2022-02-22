import java.util.*;

class SmallestNum
{
public static void main (String args[])
{
	int a,b,c,d,smallest;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter first num");
	a = sc.nextInt();
	System.out.println("Enter second num");
	b = sc.nextInt();
	System.out.println("Enter third num");
	c =sc.nextInt();
	
	d= a<b?a:b;
	
	smallest =c<d?c:d;
	
	System.out.println("the smallest number is"+smallest);
}
}