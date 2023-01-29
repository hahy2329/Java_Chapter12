package map.hashmap;

import java.util.HashMap;
import java.util.Iterator;

import collection.setandmap.Member;


public class MemberHashMap {
	
	private HashMap<Integer, Member> hashMap; //key-value값 쌍으로 해시맵 선언
	
	public MemberHashMap() { // 객체 생성시 해시 맵<k,v> 생성
		hashMap = new HashMap<Integer, Member>();
	} 
	
	public void addMember(Member member) { //회원 추가 메서드
		
		hashMap.put(member.getMemberID(), member); //key-value 쌍으로 추가
	}
	
	public boolean removeMember(int memberID) { //회원 삭제 메서드
		if(hashMap.containsKey(memberID)) { // 해시맵에 매개변수로 받은 키 값인 회원 아이디가 있다면
			hashMap.remove(memberID);
			return true;
		}
		
		System.out.println(memberID +"가 존재하지 않습니다.");
		return false;
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator(); //해시맵에 키값을 가지고 순회하기.
		while(ir.hasNext()) { // 위의 코딩 동작 후 키 값 검사 결과 다음 키가 있다면!
			int key = ir.next(); //해당 키 값을 key변수로 받아와서
			Member member = hashMap.get(key);  // key로부터 value 가져오기
			System.out.println(member); //member는 toString()메서드에 의해 이름과 아이디로 출력
		}
		
		System.out.println("끝");
	}
	
	
	
	

}
