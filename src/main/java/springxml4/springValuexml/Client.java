package springxml4.springValuexml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		System.out.println("beans xml file loaded");
		Student s1 = context.getBean("student",Student.class);
		System.out.println(s1);
		s1.displayInfo();
	}	
}
