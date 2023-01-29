package alone.practice;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetStudent {
	
	private HashSet<Student> hashSet;
	
	public HashSetStudent() {
		hashSet = new HashSet<Student>();
	}
	
	public void addStudent(Student student) {
		hashSet.add(student);
	}
	
	public boolean removeStudent(int studentID) {
		Iterator<Student> ir = hashSet.iterator(); //Iterator를 활용해 순회함.
		while(ir.hasNext()) {
			Student student = ir.next();
			int tempID = student.getStudentID();
			if(tempID == studentID) {
				hashSet.remove(student);
				return true;
			}
			
			
		}
		System.out.println(studentID +"가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllStudent() {
		for(Student s : hashSet) {
			System.out.println(s);
		}
		System.out.println();
	}
	
	

}
