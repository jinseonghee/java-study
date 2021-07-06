package ch06;

public class GenericPrinter<T> { //제네릭 타입<T>를 명시

    private T material;

    public T getMaterial() {
        return material;
    }

    public void setMaterial(T material) {
        this.material = material;
    }

    public String toString() {
        return material.toString();
    }
}
