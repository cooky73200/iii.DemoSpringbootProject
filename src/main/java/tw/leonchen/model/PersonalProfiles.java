package tw.leonchen.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
@ConfigurationProperties(prefix = "profiles")
public class PersonalProfiles {
	private String name;
	private String address;
	private String phone;

}
