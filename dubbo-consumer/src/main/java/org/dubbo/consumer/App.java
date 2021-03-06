package org.dubbo.consumer;

import org.dubbo.api.service.DomoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// 测试常规服务
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
		context.start();
		System.out.println("consumer start");
		DomoService demoService = context.getBean(DomoService.class);
		System.out.println("consumer");
		System.out.println(demoService.getStr((1L)));
	}
}
