package collection.arraylist;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member1 memberLee = new Member1(1001,"이지원");
		Member1 memberHan = new Member1(1004,"한민국");
		Member1 memberHong = new Member1(1002,"홍길동");
		Member1 memberGang = new Member1(1003,"강감찬");
		
		memberArrayList.addMember(memberGang);
		memberArrayList.addMember(memberHan);
		memberArrayList.addMember(memberHong);
		memberArrayList.addMember(memberLee);
		
		memberArrayList.removeMember(1003);
		
		memberArrayList.showAllMember();
		

	}

}
