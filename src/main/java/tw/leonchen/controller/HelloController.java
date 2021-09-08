package tw.leonchen.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //相當於@Controller + @ResponseBody
public class HelloController {

	@GetMapping(path="/hello.controller")
	public String processAction() {
		return "Hello mary123";

	}

}
