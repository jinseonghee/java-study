package ch19;

public abstract class Decorator extends Coffee { //혼자 사용할 일 없이 상속용으로 사용할거기 때문에 abstract

    Coffee coffee; //Decorator는 혼자 돌리지 못하기 때문에 Coffee를 멤버 인자 가지고 있어야 한다.

    public Decorator(Coffee coffee) //Constructor에 인자로 Coffee를 받는다. 인자로 올수 있는 애들은 커피에서 상속받은 모든 애들이 올 수 있다.
    {
        this.coffee = coffee;
    }

    @Override
    public void brewing() {

        coffee.brewing();
    }
}
