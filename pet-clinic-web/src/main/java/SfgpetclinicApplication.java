import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@Configuration
@ComponentScan(basePackages = "com.springframework.sfgpetclinic.repositories")
@EntityScan("com.springframework.sfgpetclinic.model")
@EnableJpaRepositories("com.springframework.sfgpetclinic.repositories")
@SpringBootApplication
public class SfgpetclinicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SfgpetclinicApplication.class, args);
	}

}
