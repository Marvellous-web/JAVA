
interface ABC1{
    public abstract void f1();
}
interface ABC2{
    public abstract void f1();
}

//has a relation
public class MultipleInterDemo {
    ABC1 abc1=new ABC1() {
        @Override
        public void f1() {
            System.out.println("Hello");
        }
    }
    ABC2 abc2=new ABC2() {
        @Override
        public void f1() {
            System.out.println("World");
        }
    };
}
