//package com.example.demoreactivefsm;
//
////import com.example.demoreactivefsm.routing.greetings.GreetingClient;
//import com.example.demoreactivefsm.data.entities.student.Student;
//import com.example.demoreactivefsm.services.students.StudentService;
//import io.swagger.v3.oas.annotations.OpenAPIDefinition;
//import io.swagger.v3.oas.annotations.info.Info;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
//import org.springframework.boot.autoconfigure.r2dbc.R2dbcAutoConfiguration;
//import org.springframework.context.ConfigurableApplicationContext;
//import org.springframework.context.annotation.Bean;
//import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;
//
//@SpringBootApplication
//@EnableR2dbcRepositories
//@OpenAPIDefinition(info = @Info(title = "APIs", version = "1.0", description = "Documentation APIs v1.0"))
//public class Entry {
////	private static final Logger logger = LoggerFactory.getLogger(Entry.class);
//	public static void main(String[] args) {
//		ConfigurableApplicationContext context = SpringApplication.run(Entry.class, args);
////		GreetingClient greetingClient = context.getBean(GreetingClient.class);
////		var result = greetingClient.getMessage().block();
////		// We need to block for the content here or the JVM might exit before the message is logged
////		logger.info("{}", result);
//	}
//
//	@Bean
//	public CommandLineRunner commandLineRunner(
//					StudentService service) {
//		return args -> {
//			for (int i = 0; i < 100; i++) {
//				var student = Student.builder()
//								.firstname("Ali " + i)
//								.lastname("Bouali " + i)
//								.age(i)
//								.build();
//				service.save(student).subscribe();
//			}
//		};
//	}
//}