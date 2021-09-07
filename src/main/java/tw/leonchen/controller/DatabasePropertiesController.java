package tw.leonchen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tw.leonchen.model.DatabaseProperties;

@RestController
public class DatabasePropertiesController {
	@Autowired
	private DatabaseProperties dbp1;

	@GetMapping("/databaseprops.controller")
	public DatabaseProperties processDbPropsAction() {

		return dbp1;
	}

}
