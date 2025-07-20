package sia.apiGetWay;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ApiGetWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGetWayApplication.class, args);
	}

	@Bean
	public GlobalFilter customJF(){
		return new CustomGlobalFilter();
	}

	@Bean
	public RouteLocator customRoutes(RouteLocatorBuilder builder){
		return builder.routes().route("test2", r -> r.path("/**").uri("http://localhost/api"))
				.build();
	}
}
