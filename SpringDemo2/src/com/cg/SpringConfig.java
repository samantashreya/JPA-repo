package com.cg;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.cg.shapes.Circle;
import com.cg.shapes.Point;

@Configuration
@ComponentScan("com.cg")
//@ComponentScan(basePackages = {"com.cg","abc.xyz"})

public class SpringConfig {
	@Bean
	public Point center() {
		Point p = new Point();
		p.setX(20);
		p.setY(60);
		return p;
	}
	@Bean
	public Circle circle() {
		Circle c = new Circle();
		return c;
	}
}
