import java.util.*;
class Swaping
/*
{
	
public static void main(String args[])
{
System.out.println("enter the value of A&B");
Scanner sc = new Scanner(System.in);

int A =sc.nextInt();
int B =sc.nextInt();

System.out.println("before swaping "+A+" "+B);

A=A+B;
B=A-B;
A=A-B;
System.out.println("After swapping "+A+" "+B);

}

} */


{
public static void main(String args[])
{
	System.out.println("enter the value of A&B");
Scanner sc = new Scanner(System.in);

int A =sc.nextInt();//5
int B =sc.nextInt();//10

System.out.println("before swaping "+A+" "+B);

A=A*B;    //50
B=A/B;    //5
A=A/B;


System.out.println("After swapping "+A+" "+B);

}
}