package tw.leonchen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import tw.leonchen.model.Bird;
import tw.leonchen.model.Bird.BirdBuilder;
import tw.leonchen.model.BirdService;

@RestController
public class BirdController {

	@Autowired
	private BirdService bService;
	@GetMapping("/jpainsert.controller")
	public Bird processInsert() {
		Bird bird1 = Bird.builder().bname("Eagle").color("gold").size("L").age(12).build();
		return bService.insert(bird1);

	}
	@GetMapping("/jspdelete.controller")
	public String processDelete() {

		if(bService.delete(103)) {
			return "OK";
		}
		return "Bird is not exists";

	}

	@GetMapping("/jpafindid.controller")
	public Bird processFindById() {

		return bService.getById(101);

	}

	@GetMapping("/japupdate.controller")
	public Bird processUpdate() {
		Bird bird2 = Bird.builder().bid(102).bname("eagle").color("black").size("M").age(13).build();
		return bService.update(bird2);

	}



}
