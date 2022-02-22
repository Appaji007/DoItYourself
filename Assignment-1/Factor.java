/*Write a Java Program to print all the Factors of the Given number*/

class Factor
{
	static int n;
static void FC(int n)
{
	for(int i=1; i<=n; i++)
		if(n%i==0)
			System.out.print(i+",");
			
}
public static void main(String args[])
{
System.out.println("the factor of 10 is");
FC(10);

}                     
}