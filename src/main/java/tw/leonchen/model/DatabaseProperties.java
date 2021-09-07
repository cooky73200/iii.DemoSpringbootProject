package tw.leonchen.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
@Data
@Component
@ConfigurationProperties(prefix = "database")
public class DatabaseProperties {

	private String drivername;
	private String url;
	private String username;
	private String password;

}
