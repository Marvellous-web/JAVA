import java.util.*;
class Swapping_digit
{
public static void main(String args[])
{
int num,sum=0,rem,value1,rev=0,value2,val3,val4,val5,val6,i;
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
num=sc.nextInt();
value1=num;

while(num!=0)
{
rem=num%10;
rev=(rev*10)+rem;
sum++;
num=num/10;

}
System.out.println("counted digit= "+sum);
val4=rev;
val5=rev;
rev=0;
if(sum%2==0)
{
while(val4!=0)
{
rem=val4%10;
value2=rem;
val4=val4/10;
rem=val4%10;
val3=rem;
val4=val4/10;
rev=rev*10+val3;
rev=rev*10+value2;
}
System.out.println("swapped number= "+rev);

}
else
{
rev=0;

val6=val5%10;
while(val5!=0)
{
val5=val5/10;
rem=val5%10;
value2=rem;
val5=val5/10;
rem=val5%10;
val3=rem;
rev=rev*10+val3;
rev=rev*10+value2;
}
rev=rev/100;
System.out.print("swapped number= ");

System.out.print(val6);
System.out.print(rev);
}
}
}
