package main.java.webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.ui.Model;

import main.java.webapp.model.User;
import main.java.webapp.model.UserRepository;

@Controller    // This means that this class is a Controller
public class UserController {
	@Autowired // This means to get the bean called userRepository
	           // Which is auto-generated by Spring, we will use it to handle the data
	private UserRepository userRepository;

	@GetMapping(path="/add") // Map ONLY GET Requests
	public @ResponseBody String addNewUser (@RequestParam String name
			, @RequestParam Integer admin) {
		// @ResponseBody means the returned String is the response, not a view name
		// @RequestParam means it is a parameter from the GET or POST request

		User n = new User();
		n.setName(name);
		n.setAdmin(admin);
		userRepository.save(n);
		return "Saved";
	}

	@GetMapping(path="/all")
	public String getAllUsers(Model model) {
		// This returns a JSON or XML with the users
		Iterable<User> allUsers = userRepository.findAll();
		model.addAttribute("allUsers", allUsers);
		return "all.html";
	}
}