package in.abhayit.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.abhayit.Entity.UserRegister;
import in.abhayit.Repository.UserRegisterRepo;

@Service
public class UserRegisterService {


	
	@Autowired
	private UserRegisterRepo userRegisterRepo;


	public List<UserRegister> getAllUserDetails() {
	
		List<UserRegister> List =userRegisterRepo.findAll();
		return List;
		
	}
}
