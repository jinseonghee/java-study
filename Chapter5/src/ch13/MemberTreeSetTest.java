package ch13;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) { //원래 스트링 구현 방법이랑 똑같음.
        return s1.compareTo(s2); //오름차순
        //return s1.compareTo(s2) * (-1); //오름차순

    }
}

public class MemberTreeSetTest {

    public static void main(String[] args) {


            /*
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
         */
        TreeSet<String> set = new TreeSet<String>(new MyCompare()); //뭘로 비교할지 ()안에 넣어줘야 함.
        set.add("Park");
        set.add("Kim");
        set.add("Lee");

        System.out.println(set);//오름차순

    }
}
