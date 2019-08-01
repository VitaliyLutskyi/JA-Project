package selectionCommitee.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import selectionCommitee.domain.User;

public interface UserRepo extends JpaRepository<User, Integer>{
	
	User findByEmail(String email);
}
