import java.util.*;
class Fenc_Barn
{


static void Squar(int side)
{

System.out.println("The area of square fence for chickens is "+(side*side));

}

static void Rectangel(int len, int bread)
{

System.out.println("The area of Rectangular fence for chickens is "+(len*bread));

}

static void Circ(int rad)
{

System.out.println("The area of Circlular fence for chickens is "+(3.14*rad*rad));

}


public static void main(String args[])

{
Scanner sc=new Scanner(System.in);
System.out.println("Select an option from list to calculate area of fence");
System.out.println("1. Square area for the chickens 2. Circular area for ducks 3. Rectangular area for cows");
int n=sc.nextInt();
if(n==1)

{
System.out.println("Enter side of square");
int area=sc.nextInt();
Squar(area);

}
else if(n==2)
{
System.out.println("Enter length and breadth of rectangle");
int len=sc.nextInt();
int bread=sc.nextInt();
Rectangel(len,bread);
}

else if(n==3)
{
System.out.println("Enter radius of Circle");
int area=sc.nextInt();
Circ(area);
}

else

{

System.out.println("Invalid choice");
}
}


}