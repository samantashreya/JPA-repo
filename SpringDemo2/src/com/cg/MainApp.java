package com.cg;


	import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

	import com.cg.shapes.Circle;

	public class MainApp {
		public static void main(String[] args) {
			ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		/*
		 * Circle c = (Circle) context.getBean("circle"); c.draw(); String message=
		 * context.getMessage("greeting", null, "Default Message", null);
		 * System.out.println(message); System.out.println("done");
		 */
			MessageSource messageSource =(MessageSource) context.getBean("messageSource");
			Locale locale=new Locale("en","Us");
			String message=messageSource.getMessage("welcome.message",null,"default",null);
			System.out.println(message);
		}

	}
	
	
	
	
	
	
	
	
	
	

