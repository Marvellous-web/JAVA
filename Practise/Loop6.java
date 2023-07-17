import java.util.Scanner;
class Loop6
{

public static void main(String args[])

{
Scanner sc=new Scanner(System.in);
int num,rem,sum=0;//234
num=sc.nextInt();
while(num!=0)//234!=0//23
{
rem=num%10;//234%10=4//3
sum=sum*10+rem;//4
//4
num=num/10;//234/10=23

}
System.out.println(sum);
}
}