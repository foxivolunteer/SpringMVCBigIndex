package di;

import org.springframework.stereotype.Component;

@Component
public class Salary {

	private int grade = 15;
	private int salary = 10000;
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public Salary() {

	}

	@Override
	public String toString() {
		return "Salary [grade=" + grade + ", salary=" + salary + "]";
	}
}
