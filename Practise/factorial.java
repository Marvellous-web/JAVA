import java.util.*;
class factorial
{
static int fact(int n)
{
if(n==1)
{
return 1;
}
else
{
return (n*fact(n-1));
}
}

public static void main(String[]args)
{
int num,result;
Scanner sc=new Scanner(System.in);
System.out.println("enter number");
num=sc.nextInt();
result=fact(num);
System.out.println(result);




}
}