package Lista.Estudiantes.com.co;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = {"Lista.Estudiantes.com.co.repository"})
@EntityScan(basePackages = {"Lista.Estudiantes.com.co.Entity"})
@ComponentScan(basePackages = {"Lista.Estudiantes.com.co.Service", "Lista.Estudiantes.com.co.Api"})
@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
