package com.kai.jpaonly;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SimpleSpringJpaDemo {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"spring-config.xml");
		UserService userService = ctx.getBean("userService", UserService.class);
		userService.createNewAccount("MyStic", "123456", 1);
		userService.createNewAccount("HanShanSnow", "123456", 1);

		AccountInfo accountInfo = userService.getAccountInfoById(1L);
		System.out.println(accountInfo);

		accountInfo = userService.getAccountInfoByUsername("HanShanSnow");
		System.out.println(accountInfo);

		ctx.close();
	}
}
