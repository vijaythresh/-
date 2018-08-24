package haorendaimanageservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.vijaythresh.edloans")
@MapperScan(basePackages = "com.atguigu.haorendai.haorendaimanageservice.mapper")
@SpringBootApplication
public class HaorendaiManageserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(HaorendaiManageserviceApplication.class, args);
	}
}
