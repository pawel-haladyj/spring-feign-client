package pl.haladyj.feignproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients //enables FeignClient
public class FeignProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(FeignProjectApplication.class, args);
	}

}
