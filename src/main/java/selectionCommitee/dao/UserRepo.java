package selectionCommitee.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import selectionCommitee.domain.User;

@Repository
public interface UserRepo extends JpaRepository<User, Integer>{
	
	Optional<User> findByEmail(String email);
}
