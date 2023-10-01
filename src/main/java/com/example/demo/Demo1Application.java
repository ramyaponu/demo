package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext con=SpringApplication.run(Demo1Application.class, args);
		
		DemoEntity de=new DemoEntity(1,"sri");
		DemoService ds=con.getBean(DemoService.class);
		System.out.println(ds.insertDemoEntity(de));
	//	System.out.println(ds.readByEntity(de));
	//	System.out.println(ds.updateEntity("sri", 1));
	//System.out.println(ds.deleteValues(1));
	//	ds.deleteValues(1);
	}

}
