import java.util.Scanner;
class Employ
{

void Wage(String name,float base,int hrs)

	{
float sal;
System.out.println("Name :: "+name);
System.out.println("Name :: "+base);
System.out.println("Hours worked :: "+hrs);
sal=base*hrs;
if(hrs<41)
		{
sal=base*hrs;

System.out.println("Salary of employee :: "+sal+"$");
		}
else if(hrs<46 && hrs>40)
		{
int extra=hrs-40;//45-40=5

sal=40*base+extra*2*base;

System.out.println("Salary of employee :: "+sal+"$");
		}

else
		{
System.out.println("Salary of employee :: 0.0$");
		}

	}

public static void main(String args[])
	{

Employ em=new Employ();
Scanner sc=new Scanner(System.in);
System.out.println("Enter name of the employee");
String name=sc.nextLine();

System.out.println("Enter base pay of the employee");
float base_pay=sc.nextFloat();
System.out.println("Enter number of hours worked by the employee");
int hrs=sc.nextInt();
em.Wage(name,base_pay,hrs);
	}

}


