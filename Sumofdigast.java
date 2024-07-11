import java.util.*;
class Sumofdigast
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n,sum=0,rem;
System.out.println("Enter the value n");
n=sc.nextInt();
while(n>0)
rem=n%10;
sum=sum;
n=n/10;
System.out.print("sum of digits of given number");
}
}
