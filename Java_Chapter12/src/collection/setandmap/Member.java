package collection.setandmap;

public class Member {
	
	private int memberID; // 회원 아이디
	private String memberName; // 회원 이름
	
	public Member(int memberID, String memberName) { 
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

	@Override
	public int hashCode() { //hashCode() 메서드가 회원 아이디를 반환하도록 재정의
		
		return memberID;
	}

	@Override
	public boolean equals(Object obj) { 
		if(obj instanceof Member) { //obj의 참조변수가 Object형 이지만 사실 인스턴스는 Member클래스라면..
			Member member = (Member)obj;
			
			if(this.memberID == member.memberID) { 
				//위의 조건식은 매개변수로 받은 회원아이디가 자신의 회원 아이디와 같다면! true반환
				return true;
			}
			else {
				return false;
			}
		} 
		
		else { //위의 조건이 아니라면 false 반환!
			return false;
		}
	}
	
	
	
	
	
	
	
	

}
