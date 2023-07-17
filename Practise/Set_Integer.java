import java.util.*;
class Set_Integer
{
public static void mainn(String args[])
 {
int num,sum=0,sum1=0;
Scanner sc=new Scanner(System.in);
while(num!=0)
	{

System.out.println("Enter the number");

num=sc.nextInt();
if(num%2==0)
		{
sum=sum+num;

		}
else
		{
sum1=sum1+num;
		}
	}
System.out.println(sum);
System.out.println(sum1);
 }
}
