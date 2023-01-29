package collection.arraylist;

import java.util.ArrayList;

public class MemberArrayList {
	//멤버변수로 어레이리스트 선언
	private ArrayList<Member1> arrayList;
	
	//객체 생성시 어레이리스트 생성
	public MemberArrayList() {
		arrayList = new ArrayList<Member1>();
	}
	
	public void addMember(Member1 member) { //추가 메서드
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberID) {
		for(int i =0; i<arrayList.size(); i++) {
			Member1 member = arrayList.get(i);
			int tempID = member.getMemberID();
			if(tempID == memberID) {
				arrayList.remove(i);
				return true;
			}
		
		}
		System.out.println(memberID + "가 존재하지 않습니다.");
		return false;
		
		
	}
	
	public void showAllMember() {
		for(Member1 m : arrayList) {
			System.out.println(m);
		}
		
		System.out.println();
	}
	
	
	
}
