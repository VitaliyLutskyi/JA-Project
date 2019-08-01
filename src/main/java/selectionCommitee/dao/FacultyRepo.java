package selectionCommitee.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import selectionCommitee.domain.Faculty;

public interface FacultyRepo extends JpaRepository<Faculty, Integer>{
	
}
