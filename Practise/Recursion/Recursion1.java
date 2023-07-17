public class Recursion1 {

  public static void main(String[] args) {

   PrintNum(9);
	

	}


	static void PrintNum(int n)
	public static int i=1;

	{	
		
		if(i<11)

		{		
		
		n=n*i;
		
		System.out.println(n);
		
		i=i+1;
		

		
		}
		PrintNum(n);
		
		

	}



}