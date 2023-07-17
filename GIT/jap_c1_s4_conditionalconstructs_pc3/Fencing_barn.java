import java.util.*;

class Fencing_barn
{

public static void main(String args[ ])
	{

int ch,len,bre,rad,side;

Scanner sc=new Scanner(System.in);

System.out.println("Press 1 for Square Area");

System.out.println("Press 2 for Area of Circle");

System.out.println("Press 3 for Area of Rectangle");

System.out.println("Enter your choice");

ch=sc.nextInt();

switch(ch)
		{

case 1: System.out.println("Enter radius"); side=sc.nextInt(); System.out.println("Area of Square is "+side*side+"sq-m");
break;

case 2: System.out.println("Enter length");len=sc.nextInt(); System.out.println("Enter breadth");bre=sc.nextInt(); System.out.println("Area of Square is "+len*bre+"sq-m");
break;

case 3: System.out.println("Enter radius");rad=sc.nextInt(); System.out.println("Area of Circle is "+3.14*rad*rad+"sq-m");
break;

default: System.out.println("Invalid choice");

		}
	}
}
