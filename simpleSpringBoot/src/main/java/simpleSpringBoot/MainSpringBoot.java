package simpleSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//1.add componentScan annotation which @ComponentScan is an annotation used in Spring Framework (specifically Spring Boot) to specify the base packages to scan for Spring-managed components
//2.add springBoootApplication Annotation which is used to convert simple maven application into total springboot Application
@ComponentScan
@SpringBootApplication
public class MainSpringBoot {

	public static void main(String[] args) {

		//3. add SpringApplication.run(MainClass.class, args);
		SpringApplication.run(MainSpringBoot.class, args);
		//4.run simple java Application
	}

}
