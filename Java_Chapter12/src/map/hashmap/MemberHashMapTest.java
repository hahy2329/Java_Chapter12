package map.hashmap;

import collection.setandmap.Member;

public class MemberHashMapTest {

	public static void main(String[] args) {
		
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberLee = new Member(1001,"이지원");
		Member memberSon = new Member(1003, "손민국");
		Member memberPark = new Member(1002, "박서훤");
		Member memberHong = new Member(1004, "홍길동");
		
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberHong);
		
		
		memberHashMap.showAllMember();
		System.out.println();
		
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
		
		
		
		
		
		

	}

}
