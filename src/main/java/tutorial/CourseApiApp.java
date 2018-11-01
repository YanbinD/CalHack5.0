package tutorial;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//STEP 1: tell Spring this is a Spring application : Annotate the main class 
@SpringBootApplication
public class CourseApiApp {
	
	/* Spring boot create a spring appliation thats standalone, does not need a servlet 
	 container or deploying on the server By having a Class with Main method 
	 	which Create the serlet container and host the application 
	 
	 * STEP 2: 	
	 * The main method needs to 
	 *  1: tell spring boot to starts this application  
	 *  2: Create the servlet container and host the application in the serlet container 
	 *  
	 */ 
	
	public static void main(String[] args) {
		// Calling a static method, passing the class where the main method is located 
		// Second argument will be the args that passing thru in the main argument 
		SpringApplication.run(CourseApiApp.class, args); 
		
		
		
		// 

	}

}
