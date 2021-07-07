package ch13;


import java.util.Iterator;
import java.util.TreeSet;

public class MemberTreeSet {

    private TreeSet<Member> treeSet;

    public MemberTreeSet() {
        treeSet = new TreeSet<Member>(new Member()); //내가 어떤걸로 구현을 해놨는지 Comparator되는 대상을 ()안에 명시 해야 한다.
    }

    public void addMember(Member member) {
        treeSet.add(member);
    }

    public boolean removeMember(int memberId) { //매개변수로 이 memberId가 들어오면 remove

        Iterator<Member> ir = treeSet.iterator(); //<>안에 아무것도 써주지 않으면 Object로 반환, Iterator할 요소가 Member이기 때문에 <Member> 명시
                                                    // get(i)메서드가 없을 경우 iterator 메서드 사용
        while(ir.hasNext()) { //hasNext로 다음게 있는지 확인.(true인 동안만 돌면 됨.)

            Member member = ir.next(); //ir의 next인 다음껄 member에 주고 포인터 이동

            int tempId = member.getMemberId();
            if (tempId == memberId) {
                treeSet.remove(member);//arrayList의 remove 메서드 2개 중 object 지정 /index지정 -> remove(i)
                return true;
            }
        }
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        for(Member member : treeSet) {
            System.out.println(member);
        }
        System.out.println();
    }
}
