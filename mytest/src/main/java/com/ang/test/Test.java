package com.ang.test;


import com.ang.anno.SpringConfig;
import com.ang.dao.UserDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		UserDao dao = (UserDao) annotationConfigApplicationContext.getBean("dao");
		dao.pringInfo();
	}

}
