package ch02;

public class MyArray {

    int[] intArr;   	//int array
    int count;  		//개수(element)

    public int ARRAY_SIZE; //capacity(용량) : 잡아도 다 쓰지 않는다.
    public static final int ERROR_NUM = -999999999;

    public MyArray()
    {
        count = 0;
        ARRAY_SIZE = 10;
        intArr = new int[ARRAY_SIZE];
    }

    public MyArray(int size) //contstructor overloading
    {
        count = 0;
        ARRAY_SIZE = size;
        intArr = new int[size];
    }

    public void addElement(int num)
    {
        if(count >= ARRAY_SIZE){
            System.out.println("not enough memory");
            return;
        }
        intArr[count++] = num;
    }

    public void insertElement(int position, int num) { // position : index 값, num : 내가 넣으려는 element
         //마지막 index(위치) = 전체 개수 : 4(count)) - 1(index: 3) 즉, 맨 마지막 위치에서 부터 position 까지의 요소를 하나씩 뒤로 밀고, position에 값을 넣어준다.
        int i; //index를 나타냄

        if(position < 0 || position > count) { // position에 값이 0보다 작거나, 중간에 array는 비면 안되는데 count보다 크면 error
            return;
        }
        if(count >= ARRAY_SIZE) { // 배열이 꽉차서 못 넣는 경우 error
            return;
        }
        for (i = count -1; i >= position; i++) {
            intArr[i+1] = intArr[i]; //index가 뒤로 하나씩 이동 , 이동의 수는 요소의 개수에 비례(개수는 고려 안하고 차수만 고려하기 때문)
        }
        intArr[position] = num;
        count++; //배열 중간에 데이터가 들어감.
    }

    public int removeElement(int position) {

        int ret = ERROR_NUM;

        if(isEmpty()) {
            System.out.println("Array is empty");
            return ret;
        }

        if( position < 0 || position > count -1) { //index가 count-1인데 그 보다 큰 값은 줄 수 있는 값이 없기 때문에 error

            return ret;
        }
        ret = intArr[position]; //반환 값

        for(int i = position; i < count -1; i++) {
            intArr[i] = intArr[i+1]; //뒤에 있는 걸 복사
        }
        count--;

        return ret;
    }

    public int getSize()
    {
        return count;
    }

    public boolean isEmpty()
    {
        if(count == 0){
            return true;
        }
        else return false;
    }

    public int getElement(int position)
    {
        if(position < 0 || position > count-1){
            System.out.println("검색 위치 오류. 현재 리스트의 개수는 " + count +"개 입니다.");
            return ERROR_NUM;
        }
        return intArr[position];
    }

    public void printAll()
    {
        if(count == 0){
            System.out.println("출력할 내용이 없습니다.");
            return;
        }

        for(int i=0; i<count; i++){
            System.out.println(intArr[i]);
        }
    }

    public void removeAll()
    {
        for(int i=0; i<count; i++){
            intArr[i] = 0;
        }
        count = 0;
    }
}



