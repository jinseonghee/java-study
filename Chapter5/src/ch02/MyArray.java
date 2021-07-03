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
    //마지막 index(위치) = 전체 개수 : 4(count)) - 1(index: 3)
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



