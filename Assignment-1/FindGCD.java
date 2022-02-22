public class FindGCD 
{  
public static void main(String[] args)   
{  
int n1=15, n2=18;  
while(n1!=n2)   
{  
if(n1>n2)  
n1=n1-n2;  
else  
n2=n2-n1;  
}  
System.out.printf("GCD of n1 and n2 is: " +n2);  
}  
} 