package com.mimaraslan;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Merkez {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("SpringBeanConfig.xml");
		
		context.start(); // Ayaga kaldiriliyor
		
		Yazar yazar = context.getBean("yazarBean",Yazar.class);

		System.out.println(yazar);
		System.out.println(yazar.getBilgi());
		
		
		
		context.close();
		
		
		
	}

}
