package serice_impl;
import java.util.HashMap;
import java.util.Map;

import service.Student_Service;
import module.Student;

public class Student_Service_Impl implements Student_Service {
	
	public Student_Service_Impl() {
	
	}
	private static Map<Integer,Student> student = new HashMap<Integer,Student>();
	
	@Override
	public boolean insert(int id, String name, int age) {
		Student s = new Student(id, name, age);
		student.put(s.getId(), s);
		if(student.isEmpty())
			return false;
		else
			return true;
	}

	@Override
	public Student search(int id) {
		student.put(1,new Student(1,"Saman",12));
		student.put(2,new Student(2,"Nimal",14));
		student.put(3,new Student(3,"Kamal",15));
		student.put(4,new Student(4,"Malith",23));
		student.put(5,new Student(5,"Tharidu",10));
		System.out.println(student.get(id));
		return student.get(id);
	}

	@Override
	public boolean delete(int id) {
		student.put(1,new Student(1,"Saman",12));
		student.put(2,new Student(2,"Nimal",14));
		student.put(3,new Student(3,"Kamal",15));
		student.put(4,new Student(4,"Malith",23));
		student.put(5,new Student(5,"Tharidu",10));
		if (student.remove(id) != null) {
			return true;
		} else {
			return false;
		} 
	}

}
