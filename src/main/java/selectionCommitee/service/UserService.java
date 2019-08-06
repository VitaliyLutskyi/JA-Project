package selectionCommitee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import selectionCommitee.dao.UserRepo;
import selectionCommitee.domain.User;
import selectionCommitee.domain.UserRole;

@Service
public class UserService{
	
	@Autowired
	private UserRepo userRepo;
	
	@Autowired
	private PasswordEncoder bCryptPasswordEncoder;
	
	public void save(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		user.setRole(UserRole.ROLE_USER);
		userRepo.save(user);
	}
}
