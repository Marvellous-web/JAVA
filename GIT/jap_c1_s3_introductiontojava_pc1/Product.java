import java.util.*;
class Product
{
public static void main(String args[])
{

float avg,sp=10.99f;
Scanner sc =new Scanner(System.in);
sp=sc.nextFloat();
System.out.println("Enter Item name : Rounded Kaisa Bowl");
System.out.println("Enter Selling Price : "+sp);
avg=(0.05f*sp)+sp;
System.out.println("Revised Price for Rounded Kaisa Bowl is $"+avg);


}
}