class function
 {

static int i=0;

static void abc()
{
i++;
if(i<=10)
{
System.out.println(i);
abc();
}
}

public static void main(String[]args)
{
  int a=5,b=10;
  int c=a+b;
  System.out.println(c);
  System.out.println("inside recursion");
  abc();
  int d=a*b;
  System.out.println("multiplication"+d);
  System.out.println("inside 2nd recursion");
  i=0;
  abc();
  
}
}