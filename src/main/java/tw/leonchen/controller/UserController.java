package tw.leonchen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import tw.leonchen.model.Users;
import tw.leonchen.model.UsersService;

@RestController
@RequestMapping(path = "/users")
public class UserController {

	@Autowired
	private UsersService uService;

	@GetMapping("/findusers1.controller")
	public List<Users> processFindUser1(){
		return uService.findUsers("ma");
	}

	@GetMapping("/findusers2.controller")
	public List<Users> processFindUser2(){
		return uService.findNameLike("%ma%");
	}
	@GetMapping("/findallusers.controller")
	public List<Users> processAllUsers(){
		return uService.findAll();
	}



}
