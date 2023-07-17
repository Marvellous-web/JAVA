import java.util.*;
class Loop6
{

public static void main(String args[])
{
int num,rev,sum=0;
Scanner sc=new Scanner(System.in);

num=sc.nextInt();


for(int i=num;i<=0;i--);
{
rev=num%10;

sum=sum*10+rev;
num=num/10;


}
System.out.println(sum);
}
}