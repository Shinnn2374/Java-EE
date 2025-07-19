package sia.firstMicroService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class FirstMicroServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstMicroServiceApplication.class, args);
	}

}
