package com.cg.shapes;

	

	import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.annotation.Resource;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PostMapping;
//@Component
//@Controller
//@Service
//@Repository
	public class Circle  {
		@Autowired
		//@Resource
		private Point center;
		@Autowired        //check if already any class has implemented 
		MessageSource messageSource;
		
		public Point getCenter() {
			return center;
		}
		//@Required
		public void setCenter(Point center) {
			this.center = center;
		}
		public void draw() {
			String message=messageSource.getMessage("greeting", null, "default greeting", null);
			//System.out.println("Circle Drawn");
			//System.out.println("Circle Points("+center.getX()+","+center.getY()+")");
			System.out.println(message);
			String draw=messageSource.getMessage("circle.drawing", null,"default drwaing",null);
			String points=messageSource.getMessage("circle.points", new Object[] {center.getX(),center.getY()},"default drwaing",null);
			System.out.println(draw);
			System.out.println(points);
			
		}
		//@PostConstruct
		public void myInit() {
			System.out.println("My Init method executed");
		}
	//@PreDestroy
		public void myDestroy() {
			System.out.println("My default method executed");
		}
	
	}


