package com.training.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.training.beans.MyUser;

public class TestMyUser {

		public static void main(String [] args) {
			
			ApplicationContext ctx=new ClassPathXmlApplicationContext("Myuser.xml");
		MyUser p	=(MyUser)ctx.getBean("user");
		System.out.println("Object p:"+p);
		
		}
}
