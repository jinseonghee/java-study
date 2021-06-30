package ch15;

public class BookShelf extends Shelf implements Queue {

    @Override
    public void enQueue(String title) {
        shelf.add(title); //shelf가 protected로 선언되어 있기 때문에 사용 가능
    }

    @Override
    public String deQueue() {
        return shelf.remove(0); //ArrayList에서 사용할 수 있는 remove
    }

    @Override
    public int getSize() {
        return getCount(); //이미 size 를 Return 하고 있어서, count return
    }
}
