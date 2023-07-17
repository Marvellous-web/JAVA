import java.util.*;
class Loop5
{

public static void main(String args[])
{
int num,pow;
Scanner sc=new Scanner(System.in);

num=sc.nextInt();

pow=sc.nextInt();
for(int i=1;i<=pow;i++);
{
num=num*num;
}
System.out.println(num);
}
}