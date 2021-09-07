package tw.leonchen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan //會自動尋找當前包下的annotation
public class DemoSpringbootProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringbootProjectApplication.class, args);
	}

}
