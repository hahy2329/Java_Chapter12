package collection.arraylist;



public class Member1 {
	
	private int memberID; // 회원 아이디
	private String memberName; // 회원 이름
	
	public Member1(int memberID, String memberName) { 
		this.memberID = memberID;
		this.memberName = memberName;
	}

	public int getMemberID() {
		return memberID;
	}

	public void setMemberID(int memberID) {
		this.memberID = memberID;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	@Override
	public String toString() { // Object의 toString()메서드 재정의 
		return memberName +"회원 님의 아이디는 " + memberID + "입니다.";
	}

	

	
}
