package com.training.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.beans.Helloworld;
import com.training.beans.Person;

public class Testhello {

	public static void main(String[] args) {
		
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("hello.xml");
		System.out.println("Factory Created");
		Helloworld hw=(Helloworld)ctx.getBean("hwbean");
		Helloworld hw1=(Helloworld)ctx.getBean("hwbean");

        System.out.println(hw.sayhello());
        System.out.println(hw1.sayhello());
        
        Person p=(Person) ctx.getBean("p1");
       System.out.println(p);
        
	}

}
