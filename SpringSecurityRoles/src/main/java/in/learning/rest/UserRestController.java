package in.learning.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

	@GetMapping("/welcome")
	public String welcome() {
		
		return "Welcome";
	
	}
	@GetMapping("/admin")
	public String admin() {
		return "Admin";
	}
	@GetMapping("/user")
	public String user() {
		return "user";
	}
}
