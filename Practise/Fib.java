class Fib
{

static int fibbo(int num)


{
if(num<0)

	{
return 0;
	}

else if(num==1)

	{

return 2;
	}
else
	{
		return 2*num*fibbo(num-1);
	}





}

public static void main(String args[])

{

int num=5;

System.out.println(fibbo(num));

}
}