public class OverloadingDemo {
    public static void main(String[] args) {
       OverloadingDemo overloadingDemo=new OverloadingDemo();
      int a=  overloadingDemo.Add(2,3);
      int b= overloadingDemo.Add(2,3,4);
        System.out.println(a);
        System.out.println(b);
    }
    public int Add(int x, int y)
    {
        return x+y;
    }
    public int Add(int x,int y, int z)
    {
        return x+y+z;
    }

}
