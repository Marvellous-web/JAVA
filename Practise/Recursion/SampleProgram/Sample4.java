import java.util.*;
class Sample4

{


public static void main(String args[])

{

int num1,num2,avg;
Scanner sc=new Scanner(System.in);
num1=sc.nextInt();
num2=sc.nextInt();
avg=num1+num2;
num2=avg-num2;
num1=avg-num1;

System.out.println(num1);
System.out.println(num2);
}

}