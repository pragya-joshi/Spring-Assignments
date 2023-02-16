package com.springcore.component;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("/com/springcore/component/compconfig.xml");
//		Student stud=context.getBean("student_1",Student.class);
//		System.out.println(stud);

		Person person=context.getBean("person",Person.class);
		System.out.println(person);
	}
}
