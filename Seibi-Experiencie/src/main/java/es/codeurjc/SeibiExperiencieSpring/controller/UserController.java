package es.codeurjc.SeibiExperiencieSpring.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import es.codeurjc.SeibiExperiencieSpring.model.User;
import es.codeurjc.SeibiExperiencieSpring.repository.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserRepository users;
	
	@GetMapping("/")
	public Collection<User> getUsers(){
		return users.findAll();
	}
}