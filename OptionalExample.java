package Java_8;


import java.util.List;
import java.util.Optional;

import Java_8.Student;

public class OptionalExample {
	public Student checkStudentFailed(Student std) {
		if(std.percent<33) {
			return std;
		}
		return null;
	}
	public Optional<Student> checkStudentFailedOptional(Student std) {
		if(std.percent<33) {
			return Optional.of(std);
		}
		return Optional.ofNullable(null);
	}
	public static void main(String[] args) {
		Student std = new Student(1, "Suresh", 25, null);
		OptionalExample ex=new OptionalExample();
		/*Student failed=ex.checkStudentFailed(std);
		if(failed!=null)
		System.out.println(failed.name);*/
		
		Optional<Student> stdOpt=ex.checkStudentFailedOptional(std);
		if(stdOpt.isPresent()) {
			System.out.println(stdOpt.get().name);
		}else {
			System.out.println("Student is not failed");
		}

	}

}
