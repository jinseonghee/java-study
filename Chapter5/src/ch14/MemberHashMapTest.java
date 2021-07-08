package ch14;

import java.util.Comparator;
import java.util.HashMap;
import java.util.TreeSet;

public class MemberHashMapTest {

    public static void main(String[] args) {

        MemberHashMap memberHashMap  = new MemberHashMap();

        Member memberHong = new Member(1004, "홍길동");
        Member memberLee = new Member(1001, "이순신");
        Member memberKim = new Member(1002, "김유신");
        Member memberKang = new Member(1003, "강감찬");

        memberHashMap.addMember(memberHong);
        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberKim);
        memberHashMap.addMember(memberKang);


        memberHashMap.showAllMember(); //hashSet은 집합의 개념으로 동일한 값이 들어가지 않지만, 동일한 값은 직접 구현을 해주어야 한다.

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>();//HashMap을 그냥 toString으로 돌릴때
        hashMap.put(1001, "Kim");
        hashMap.put(1002, "Lee");
        hashMap.put(1003, "Park");
        hashMap.put(1004, "Hong");

        System.out.println(hashMap); //pair 로 쌍으로 저장이 되어서 출력

    }
}
