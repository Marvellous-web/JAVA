public class MainMethod {
    public static void main(String[] args) {
        InnerClass innerClass = new InnerClass();
        InnerClass.OuterClass innOuterClass = innerClass.new OuterClass();
        System.out.println(innerClass.mess);
        System.out.println(innOuterClass.mess1);

    }

}
