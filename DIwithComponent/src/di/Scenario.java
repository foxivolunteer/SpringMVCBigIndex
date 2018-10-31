package di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Scenario {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		Salary salary = (Salary) ctx.getBean("salary");

		Employee myEmployee = (Employee) ctx.getBean("employee");
		myEmployee.setEmail("info@spring.com");
		myEmployee.setName("John Doe");

		System.out.println(myEmployee);
		((ClassPathXmlApplicationContext) ctx).close();
	}

}
