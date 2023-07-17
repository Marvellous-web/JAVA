import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList=new ArrayList<>();
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.set(0,2);
        for (int a:arrayList
             ) {
            System.out.println(a);
        }
        System.out.println(arrayList);
    }


}
