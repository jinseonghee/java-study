package ch13;

import java.util.Comparator;

public class Member implements Comparator<Member> { //작은 아이디 부터 오름차순으로 구현

    private int memberId;        //회원 아이디
    private String memberName;   //회원 이름

    public Member(){ //default 생성자

    }

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

    @Override
    public int compare(Member member1, Member member2) { //CompareTo는 매개변수가 하나여서 나랑 비교 / compare은 매개변수 2개가 넘어와 하나는 나, 하나는 비교대상이다.
        return (member1.memberId - member2.memberId); //앞에꺼에서 뒤에껄 뺀게 더 크다 (올림차순)
        //return (member2.memberId - member1.memberId); // 내림차순
    }
}
    /*
    @Override
    public int compareTo(Member member) {
        //return (this.memberId - member.memberId);   //오름차순
        return (this.memberId - member.memberId) *  (-1);   //내림 차순
    }

     */

    /*
        @Override
        public int compareTo(Member member) { //맨 위에 class에서 implements Comparable<Member> 이렇게 써줬기 때문에 <>안에 있던 member가 넘어옴
                                              //나(= this = 새로 들어갈 element)과 Tree의 기존에 있는 값이 위치를 찾을때까지 (Member member) 이 매개변수 안으로 하나씩 넘어옴(=콜백 fucntion)
            if(this.memberId > member.memberId)                                //콜백 function : 내가 호출하는게 아닌 시스템이 호출해 주는 것
                return 1; //-1 은 내림차순
            else if(this.memberId < member.memberId)
                return -1; //1 은 내림차순
            else return 0; //반환값이 int이기 떄문에 내꺼와 넘어온 argument를 비교해서 내께 더 큰 경우는 양수 반, 그렇지 않으면 음수, 같으면 0반환
        } // 이렇게 구현하면 left는 작은값 , right는 큰값이 들어가 Traversal를 하면 오름차순으로 tree 구성
    }
     */
