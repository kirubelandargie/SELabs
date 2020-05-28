package studentrecordsmgmtapp;

import java.time.LocalDate;
import java.time.Period;

public class Student {
	
	private String studentId;
	private String name;
	private LocalDate dateOfAdmission;
	
	public Student() {
		this("00001", "john");		
	}	
	
	public Student(String studentId, String name) {
		this.studentId = studentId;
		this.name = name;
		this.dateOfAdmission = LocalDate.now();
	}
		
	public Student(String studentId, String name, int aYear,
			int aMonth, int aDay) {
		this.studentId = studentId;
		this.name = name;
		this.dateOfAdmission =LocalDate.of(aYear, aMonth, aDay);
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getDateOfAdmission() {
		return dateOfAdmission;
	}

	public void setDateOfAdmission(LocalDate dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}

	@Override
	public String toString() {
		return "studentId=" + studentId + ", name=" + name + ", dateOfAdmission=" + dateOfAdmission +"\n";
	}
	
	public int calculateAge(LocalDate currentDate)
	{
			    // validate inputs ...
			    return Period.between(dateOfAdmission, currentDate).getYears();
			}
	
	

}
