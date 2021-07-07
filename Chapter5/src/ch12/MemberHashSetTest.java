package ch12;

public class MemberHashSetTest {

    public static void main(String[] args) {

        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");

        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberKim);
        memberHashSet.addMember(memberKang);

        memberHashSet.showAllMember(); //hashSet은 집합의 개념으로 동일한 값이 들어가지 않지만, 동일한 값은 직접 구현을 해주어야 한다.

        Member memberHong = new Member(1003, "홍길동");//HashSet을 쓰면 중복된 값이 나오면 안되는데, 여기선, Member 클래스 안에서 같은 값에 대한 정의를 해주지 않았기 떄문에 중복된 값이 나온다.
        memberHashSet.addMember(memberHong); //같은 값에 대한 정의는 Member class에서 equals 메서드와 hashcode 메서드로 해준다.
        memberHashSet.showAllMember(); // 들어간 순서대로 나오지 않는다.

    }
}
