package springxml4.springValuexml;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.beans.factory.annotation.Value;

public class Student {

	@Value("${student.name}")
	private String name;
	
	@Value("${student.rollNo}")
	private int rollNo;
	
	@Value("${student.description}")
	private String description;

	
	public String getName() {
		return name;
	}

	//@Required
	//@Value("Michael")
	//@Value("${student.name}")
	public void setName(String name) {
		this.name = name;
		System.out.println("using setName method");
	}

	public int getRollNo() {
		return rollNo;
	}

	//@Value("1003")
	//@Value("${student.rollNo}")
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
		System.out.println("using setRollNo method");
	}

	public String getDescription() {
		return description;
	}

	//@Value("QA Analyst")
	//@Value("${student.description}")
	public void setDescription(String description) {
		this.description = description;
		System.out.println("using setDescription method");
	}

	public void displayInfo()
	{
		System.out.println("name : "+getName());
		System.out.println("rollNo : "+getRollNo());
		System.out.println("description : "+getDescription());
	}
}
