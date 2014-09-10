package hello; 
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.SpringApplication;

import org.springframework.context.annotation.ComponentScan;
/**
 * This object bootstraps Spring Boot web application.
 * Via Gradle: gradle bootRun
 *
 * @author saung
 * @since 1.0
 */


object HelloWebApplication {

	def main(args: Array[String]){
	   SpringApplication.run(classOf[HelloConfig]);
	}
}