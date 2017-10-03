package problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentComparator {
	
	private static List<Student> input() {
		List<Student> student = new ArrayList<>();
		student.add(new Student().setId(33L).setFirstName("Tina").setGpa(3.68));
		student.add(new Student().setId(85L).setFirstName("Louis").setGpa(3.85));
		student.add(new Student().setId(56L).setFirstName("Samil").setGpa(3.75));
		student.add(new Student().setId(19L).setFirstName("Samar").setGpa(3.75));
		student.add(new Student().setId(22L).setFirstName("Lorry").setGpa(3.76));
		return student;
		
	}
	
	public static void main(String[] args) {
		List<Student> students = input();
		Collections.sort(students, Comparator.comparingDouble(Student::getGpa).reversed()
											.thenComparing(Student::getFirstName)
											.thenComparingLong(Student::getId));
		students.forEach(System.out::println);
	}
}
