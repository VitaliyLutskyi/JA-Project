package selectionCommitee.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import selectionCommitee.service.FacultyRegistrationService;

@Controller
public class RegisteredUsersController {
	
	@Autowired
	private FacultyRegistrationService facultyRegistrationService;
	
	@GetMapping("/show-entrants")
	public ModelAndView showAllRegisteredUsers() {
		return new ModelAndView("showRegistrations", "facultyRegistrations", facultyRegistrationService.showAllRegisteredUsers());
	}
}
