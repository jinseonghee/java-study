package ch03;

public class MyLinkedList {

    private MyListNode head;  //첫번째 element
    int count; //개수

    public MyLinkedList()
    {
        head = null;
        count = 0;
    }

    public MyListNode addElement( String data )
    {
        MyListNode newNode;

        if(head == null) { // head가 null이면 처음 시작이라는 말이니까 newNode로 설정
            newNode = new MyListNode(data);
            head = newNode; //맨 앞에 추가
        } else {
            newNode = new MyListNode(data);
            MyListNode temp = head;
            while (temp.next != null) {
                temp = temp.next; //맨 뒤에 추가
            }
            temp.next = newNode;
        }
        count++;
        return newNode;
    }

    public MyListNode insertElement(int position, String data ) //중간에 Node 가 들어가는 경우
    {
        int i;
        MyListNode tempNode = head;
        MyListNode preNode = null; // 앞의 node를 찾아야 함.

        MyListNode newNode = new MyListNode(data);

        if(position < 0 || position > count) { //배열과 똑같음. error
            return null;
        }
        if(position == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            for(i = 0; i < position; i++) {
                preNode = tempNode;
                tempNode = tempNode.next;
            }
            newNode.next = preNode.next;
            preNode.next = newNode;
        }
        count++;
        return newNode;
    }

    public MyListNode removeElement(int position) {
        int i;

        MyListNode tempNode = head;
        MyListNode preNode = null;

        if (position == 0) {
            head = tempNode.next; //맨 앞의 것을 지울 경우 head의 위치를 바꿔준다.
        } else {
            for (i = 0; i < position; i++) { // position의 바로 앞에 까지 previousNode를 찾는다.
                preNode = tempNode;
                tempNode = tempNode.next;
            }
            preNode.next = tempNode.next;
        }
        count --;
        return  tempNode;
    }

    public String getElement(int position)
    {
        int i;
        MyListNode tempNode = head;

        if(position >= count ){
            System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
            return new String("error");
        }

        if(position == 0){  //맨 인 경우

            return head.getData();
        }

        for(i=0; i<position; i++){
            tempNode = tempNode.next;

        }
        return tempNode.getData();
    }

    public MyListNode getNode(int position)
    {
        int i;
        MyListNode tempNode = head;

        if(position >= count ){
            System.out.println("검색 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
            return null;
        }

        if(position == 0){  //맨 인 경우

            return head;
        }

        for(i=0; i<position; i++){
            tempNode = tempNode.next;

        }
        return tempNode;
    }

    public void removeAll()
    {
        head = null;
        count = 0;

    }

    public int getSize()
    {
        return count;
    }

    public void printAll()
    {
        if(count == 0){
            System.out.println("출력할 내용이 없습니다.");
            return;
        }

        MyListNode temp = head;
        while(temp != null){
            System.out.print(temp.getData());
            temp = temp.next;
            if(temp!=null){
                System.out.print("->");
            }
        }
        System.out.println("");
    }

    public boolean isEmpty()
    {
        if(head == null) return true;
        else return false;
    }

}

