import org.w3c.dom.ls.LSOutput;

import java.awt.*;
import java.awt.event.*;
interface ABC{
    String HelloMess();
//    String DemoMess();
}
public class ButtonListenerOldWay {


    public static void main(String[] args) {



//      3-
              ABC abc= ()->{
            return "Hello";
        };
//        abc1=()->{
//            return "Hello1";
//        };


//
//       2- ABC abc=new ABC() {
//            @Override
//            public String HelloMess() {
//                return "Hello";
//            }
//
//            @Override
//            public String DemoMess() {
//                return "world";
//            }
//        };
//        System.out.println(buttonListenerOldWay.DemoMess());
//        System.out.println(buttonListenerOldWay.HelloMess());
        System.out.println(abc.HelloMess());
//
//
//    }
    }

//   1- @Override
//    public String HelloMess() {
//        return "Hello";
//    }
//
//    @Override
//    public String DemoMess() {
//        return "World";
//    }


}