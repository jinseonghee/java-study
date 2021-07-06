package ch10;

import java.util.ArrayList;

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
        for(int i = 0; i < arrayList.size(); i++) {
            Member member = arrayList.get(i); // i번째를 꺼내옴

            int tempId = member.getMemberId();
            if(tempId == memberId) {
                arrayList.remove(i);
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
