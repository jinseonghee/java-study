package ch13;

import java.util.TreeSet;

public class MemberTreeSetTest {

    public static void main(String[] args) {

        MemberTreeSet memberTreeSet = new MemberTreeSet();

        Member memberHong = new Member(1004, "홍길동");
        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");

        memberTreeSet.addMember(memberHong);
        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberKim);
        memberTreeSet.addMember(memberKang);


        memberTreeSet.showAllMember(); //hashSet은 집합의 개념으로 동일한 값이 들어가지 않지만, 동일한 값은 직접 구현을 해주어야 한다.

        //memberTreeSet.showAllMember();

    }
}
