package foodtracker.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {

	@RequestMapping(method = RequestMethod.GET, value = "/home")
	public String home() {
		return "home";
	}
}
