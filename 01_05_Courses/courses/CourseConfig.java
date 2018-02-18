package courses;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:courses.properties")
public class CourseConfig {
	
	@Value("${course1.courseName}")
	String courseName;
	
	@Value("${course1.numberOfStudents}")
	int numberOfStudents;
	
	@Value("${course1.numberOfLessons}")
	int numberOfLessons;
	
	@Value("${course1.averageRate}")
	double averageRate;
	
	@Bean
	public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	@Bean
	public Course course() {
		return new Course(courseName, numberOfStudents, numberOfLessons, averageRate);
	}
}
