package selectionCommitee.domain;

import java.util.List;

public class Faculty {
	
	private Integer id;
	private FacultyName name;
	private int numberOfStudents;
	private List<Subject> subjects;
	
	public Faculty() {}

	public Faculty(FacultyName name, int numberOfStudents, List<Subject> subjects) {
		this.name = name;
		this.numberOfStudents = numberOfStudents;
		this.subjects = subjects;
	}

	public Faculty(Integer id, FacultyName name, int numberOfStudents, List<Subject> subjects) {
		this.id = id;
		this.name = name;
		this.numberOfStudents = numberOfStudents;
		this.subjects = subjects;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public FacultyName getName() {
		return name;
	}

	public void setName(FacultyName name) {
		this.name = name;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public void setNumberOfStudents(int numberOfStudents) {
		this.numberOfStudents = numberOfStudents;
	}

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Faculty other = (Faculty) obj;
		if (name != other.name)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Faculty [id=" + id + ", name=" + name + ", numberOfStudents=" + numberOfStudents + ", subjects="
				+ subjects + "]";
	}
	
	
	
}
