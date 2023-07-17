import java.util.Scanner;
class Currency1
{
static int choice1,choice2,jpy=0,rs,us,gbp,euro,arab;
static void JPY(int choice1,int choice2)
	{

jpy=0.67*rs




	}
static void US(int choice1,int choice2)
	{

int rs;

	}

static void GBP(int choice1,int choice2)
	{

int rs;

	}
static void EURO(int choice1,int choice2)
	{

int rs;

	}
static void ARAB(int choice1,int choice2)
	{



	}


public static void main(String args[])
	{
Scanner sc=new Scanner(System.in);
	

System.out.println("1.JPY 2.EUR 3.GBP 4.USD 5.AED"); 
System.out.println("Enter the source currency(Currency I have) :");
choice1=sc.nextInt();
System.out.println("Enter the target currency(Currency I want) :");
choice2=sc.nextInt();
if(choice1==1 && choice2=2 || choice2=3 ||choice2=4 ||choice2=5)
{
JPY(choice1,choice2);

}
if(choice1=2 && choice2=1 || choice2=3 ||choice2=4 ||choice2=5)
{
US(choice1,choice2);

}
if(choice1==3&& choice2=1 || choice2=2 ||choice2=4 ||choice2=5)
{
GBP(choice1,choice2);

}
if(choice1==4 && choice2=1 || choice2=3 ||choice2=2 ||choice2=5)
{
EURO(choice1,choice2);

}
if(choice1==5 && choice2=1 || choice2=3 ||choice2=4 ||choice2=2)
{
ARAB(choice1,choice2);

}



	}

}


