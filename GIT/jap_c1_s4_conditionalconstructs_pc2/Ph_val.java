import java.util.*;
class Ph_val
{
public static void main(String args[ ])
 {
float pH;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the pH value of an aquarium");
pH=sc.nextFloat();
if(pH<14)
	{
if(pH<7)
		{
		System.out.println("pH value is low, partial water change required "+pH);
		}
else if(pH>=7 && pH<=8)
		{
		System.out.println("pH value is fine "+pH);
		}
else
		{
		System.out.println("pH value is high, partial water change required "+pH);
		}
	}
else
	{
System.out.println("Invalid pH value");
	}
 }

}
