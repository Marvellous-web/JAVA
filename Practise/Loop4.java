import java.util.*;
class Loop4
{

public static void main(String args[])
{
int num,rem=1;
Scanner sc=new Scanner(System.in);

num=sc.nextInt();
while(num>0)
{
rem=num*rem;
num--;
}
System.out.println(rem);
}
}