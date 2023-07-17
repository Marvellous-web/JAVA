package org.example.modal;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Mytimemain {
    public static void main(String[] args) {
        ApplicationContext container=new ClassPathXmlApplicationContext("beans1.xml");
        Mytime t1=(Mytime)container.getBean("time1");
        System.out.println(t1);

    }
}
