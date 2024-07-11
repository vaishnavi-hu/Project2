import java.util.*;
class Studentresult
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int m1=35,m2=55,m3=75,m4=100;
System.out.println("Enetr the 4 student marks");
m1=sc.nextInt();
m2=sc.nextInt();
m3=sc.nextInt();
m4=sc.nextInt();
if(m1<31||m2<25||m3<15||m4<10)
System.out.println("fail");
else
System.out.println("pass");
}
}


