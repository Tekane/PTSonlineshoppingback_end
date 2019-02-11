package net.PTSonlineshoppingback_end;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@ComponentScan(basePackages = {"net.PTSonlineshoppingback_end.model","net.PTSonlineshoppingback_end.repository"
        + "net.PTSonlineshoppingback_end.securityConfig","net.PTSonlineshoppingback_end.services"})

public class Application{
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
   
}
