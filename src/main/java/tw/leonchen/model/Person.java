package tw.leonchen.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data @Builder @NoArgsConstructor @AllArgsConstructor
@Component
public class Person {

	@Value("${name}")
	private String name;
	@Value("${age}")
	private int age;

}
