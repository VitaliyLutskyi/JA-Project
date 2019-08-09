package selectionCommitee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import selectionCommitee.domain.Faculty;
import selectionCommitee.repository.FacultyRepo;

@Service
public class FacultyService {
	
	@Autowired
	private FacultyRepo facultyRepo;
	
	public void save(Faculty faculty) {
		facultyRepo.save(faculty);
	}
	
	public List<Faculty> getAllFaculties(){
		return facultyRepo.findAll();
	}
	
	public Faculty findById(Integer id) {
		return facultyRepo.findById(id).get();
	}
}
