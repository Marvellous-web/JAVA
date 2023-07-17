import java.util.*;
class Sample14

{


public static void main(String args[])

{

int num,sq,sq1,add=0;
Scanner sc=new Scanner(System.in);
num=sc.nextInt();
sq=num*num;//81

while(sq>0)//81>0

{

sq1=sq%10;//1
add=add+sq1;//0+1//
sq=sq/10;//81/10=8


}

System.out.println(add);
if(add==num)

{
System.out.println("Neon number");
}
else
{
System.out.println("Non Neon Number");
}
}

}