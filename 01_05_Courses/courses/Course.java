package courses;

public class Course {
	
	private String name;
	private int numberOfStudents;
	private int numberOfLessons;
	private double averageRate;
	
	public Course(String name, int numberOfStudents, int numberOfLessons, double averageRate) {
		this.name = name;
		this.numberOfStudents = numberOfStudents;
		this.numberOfLessons = numberOfLessons;
		this.averageRate = averageRate;
	}

	public String getName() {
		return name;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}

	public int getNumberOfLessons() {
		return numberOfLessons;
	}

	public double getAverageRate() {
		return averageRate;
	}
}
