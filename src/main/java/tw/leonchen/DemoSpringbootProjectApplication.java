package tw.leonchen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@ServletComponentScan //會自動尋找當前包下的annotation
//可以找不到檔案 ignoreResourceNotFound = true
@PropertySource(value = {"classpath:jdbc.properties"},ignoreResourceNotFound = true)

public class DemoSpringbootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringbootProjectApplication.class, args);
	}

}
