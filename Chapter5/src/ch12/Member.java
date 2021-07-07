package ch12;

import java.util.Objects;

public class Member {

    private int memberId;        //회원 아이디
    private String memberName;   //회원 이름

    public Member(int memberId, String memberName) { //생성자
        this.memberId = memberId;
        this.memberName = memberName;
    }

    public int getMemberId() {  //
        return memberId;
    }

    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    //hashSet을 쓰는 클래스 Member에서 넘어온 매개변수의 애가 나와 같은지를 체크해 주어야 한다.
    //물리적으로 다르지만 논리적으로 동일하다.
    @Override
    public boolean equals(Object obj) { //회원아이디가 같으면 같은 것
        if (obj instanceof Member) {  //넘어온 obj가 Member의 인스턴스인지 체크
            Member member = (Member) obj; //Member로 다운캐스팅
            if (this.memberId == member.memberId) {//this.memberId(내가 가진 멤버 아이디)와 넘어온 매개변수의 memberId(member.memberId)가 같은지
                return true;
            } else return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return memberId; //같은 멤버의 같은 객체일때, 동일한 hashCode의 값을 갖는게 맞다
    }

    @Override
    public String toString() {   //toString 메소드 오버로딩
        return memberName + " 회원님의 아이디는 " + memberId + "입니다";
    }
}
