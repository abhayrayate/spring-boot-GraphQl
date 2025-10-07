package in.abhayit.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import in.abhayit.Entity.UserRegister;
import in.abhayit.Service.UserRegisterService;

@Controller
//@restController
public class GraphController {

	@Autowired
	private UserRegisterService  userRegisterService;
	
//	@GetMapping("/getAllRegisterDetails")
	@QueryMapping
	public List<UserRegister>getAllRegisterUserDetails(){
		
		List<UserRegister> allUserDetails = userRegisterService.getAllUserDetails();
		return allUserDetails;
	}
}

