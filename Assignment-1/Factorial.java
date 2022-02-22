class Factorial
{
public static void main(String args[])
{
int i, fact=1;
int Num = 6;
for(i=1; i<= Num; i++)
{

fact =fact*i;
}
System.out.println("factorial of "  + Num+" is =>  "+fact);
}
}