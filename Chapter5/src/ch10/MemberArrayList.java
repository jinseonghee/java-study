package ch10;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {

    private ArrayList<Member> arrayList; //<>제너릭 클래스로 실제로 쓸 클래스를 넣어줌. 제너릭 타입을 써주지 않으면 object로 들어가서 member로 형변환 해줘야 한다.

    public MemberArrayList() {
        arrayList = new ArrayList<>();
    }

    public MemberArrayList(int size) {
        arrayList = new ArrayList<>(size);
    }

    public void addMember(Member member) {
        arrayList.add(member);
    }

    public boolean removeMember(int memberId) { //매개변수로 이 memberId가 들어오면 remove
        /*
        for(int i = 0; i < arrayList.size(); i++) {
            Member member = arrayList.get(i); // i번째를 꺼내옴 -> get(i)메서드가 있을 경우

            int tempId = member.getMemberId();
            if(tempId == memberId) {
                arrayList.remove(i);
                return true;
            }
        }*/

        Iterator<Member> ir = arrayList.iterator(); //<>안에 아무것도 써주지 않으면 Object로 반환, Iterator할 요소가 Member이기 때문에 <Member> 명시
                                                    // get(i)메서드가 없을 경우 iterator 메서드 사용
        while(ir.hasNext()) { //hasNext로 다음게 있는지 확인.(true인 동안만 돌면 됨.)

            Member member = ir.next(); //ir의 next인 다음껄 member에 주고 포인터 이동

            int tempId = member.getMemberId();
            if (tempId == memberId) {
                arrayList.remove(member);//arrayList의 remove 메서드 2개 중 object 지정 /index지정 -> remove(i)
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        for(Member member : arrayList) {
            System.out.println(member);
        }
        System.out.println();
    }
}
