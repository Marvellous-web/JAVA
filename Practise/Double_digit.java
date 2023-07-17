import java.util.*;
class Double_digit
{
static long Double_digit(long a)
{
long b=a,rem,sum=0,sum1=0;

while(a!=0)
{
rem=a%10;
sum=sum*10+rem;
sum=sum*10+rem;
a=a/10;
}

while(sum!=0)

{
rem=sum%10;
sum1=sum1*10+rem;
sum=sum/10;

}
if(b>0)
{fdgt
return sum1;
}
else if(b<0)
{
return -Math.abs(sum1);
}
else
{
return 0;
}
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
long num;
System.out.println("Enter number");
num=sc.nextLong();
System.out.println(Double_digit(num));
}
}