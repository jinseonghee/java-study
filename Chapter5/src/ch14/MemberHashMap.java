package ch14;

import java.util.HashMap;
import java.util.Iterator;

public class MemberHashMap {

    private HashMap<Integer, Member> hashMap;  //<key, value>

    public MemberHashMap() { // constructor
        hashMap = new HashMap<>();
    }

    public void addMember(Member member) { //HashMap은 add할 때, put 메서드 사용
        hashMap.put(member.getMemberId(), member);
    }

    public boolean removeMember(int memberId) { //넘어온 매개변수 mnemberId를 해시테이블에서 지워라

        if(hashMap.containsKey(memberId)) { //hashMap의 containsKey 메서드
            hashMap.remove(memberId); // remove 할때 (key)로 지움
        }
        System.out.println("no element");
        return false;
    }

    public void showAllMember() {

        Iterator<Integer> ir = hashMap.keySet().iterator();  //HashMap은 Iterator를 가져올 수 있는 방법이 없어서 key, value 둘중에 하나를 골라서 가져와야 함
                                                    //여기선 key 를 통해 KeySet으로 가져옴.

        while (ir.hasNext()) { //key기반으로 hasNext를 통해 value의 값을 뽑아봄.

            int key = ir.next(); //key 값을 하나씩 가져옴
            Member member = hashMap.get(key);//key값으로 member를 꺼내옴 -> value가 꺼내짐(member가 value)
            System.out.println(member);
         }
    }
}
