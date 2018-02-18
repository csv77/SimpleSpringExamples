package courses;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(CourseConfig.class);
		Course course = context.getBean(Course.class);
		System.out.println("Name of the course: " + course.getName() +
				"\nnumber of students: " + course.getNumberOfStudents() +
				"\nnumber of lessons: " + course.getNumberOfLessons() + 
				"\naverage rate: " + course.getAverageRate());
		((AnnotationConfigApplicationContext)context).close();
	}
}
