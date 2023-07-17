import java.util.*;
class Sample12

{


public static void main(String args[])

{

float p,r,t;
double a;
p=1200f;r=5.4f;t=2f;
a=(1+r*0.01);
System.out.println(a);
for(int i=1;i<=t/2;i++)
{

a=a*a;

}
a=a*p;

System.out.println(a);

double ci=a-p;
System.out.println("CI will be"+ci);

}

}