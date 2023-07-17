import java.util.Scanner;
class Loop7
{

public static void main(String args[])

	{
Scanner sc=new Scanner(System.in);
int num,rem,sum1=0,sum2=0;
System.out.println("Enter any number");
int n=sc.nextInt();
while(n>0)
		{

System.out.println("Do you want to continue");
int str=sc.nextInt();
if(str==1)
			{
System.out.println("Enter any number");
num=sc.nextInt();

			}
else if(str==2)
			{
break;
			}
else
			{
System.out.println("Invalid Choice");
			}

		
if(n%2==0)
			{
sum1=sum1+n;

			}
else 
			{
System.out.println(sum2+n);
			}
		}
	}
}