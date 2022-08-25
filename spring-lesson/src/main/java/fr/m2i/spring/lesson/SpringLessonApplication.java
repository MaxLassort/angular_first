package fr.m2i.spring.lesson;

import fr.m2i.spring.lesson.model.Employee;
import fr.m2i.spring.lesson.service.AccountService;
import fr.m2i.spring.lesson.service.EmployeeService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
// Equivalent de
// @SpringBootConfiguration
// @EnableAutoConfiguration
// @ComponentScan(basePackages = {"fr.m2i.spring.lesson", "fr.m2i.data"})

@SpringBootApplication
public class SpringLessonApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SpringLessonApplication.class, args);

       EmployeeService emp = ctx.getBean(EmployeeService.class);
       emp.create(new Employee("Maxime", "Lassort"));
    }

}
