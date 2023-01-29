package alone.practice;

public class StudentTest {

	public static void main(String[] args) {
		HashSetStudent hashSet = new HashSetStudent();
		
		Student studentHong = new Student(100, "홍길동");
		Student studentGang = new Student(200, "강감찬");
		Student studentLee = new Student(300, "이순신");
		Student studentJung = new Student(400, "정약용");
		Student studentSong = new Student(100, "송중기");
		
		hashSet.addStudent(studentHong);
		hashSet.addStudent(studentGang);
		hashSet.addStudent(studentLee);
		hashSet.addStudent(studentJung);
		hashSet.addStudent(studentSong);
		
		hashSet.showAllStudent();
		
		

	}

}
