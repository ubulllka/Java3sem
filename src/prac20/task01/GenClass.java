package prac20.task01;

import java.io.Serializable;

public class GenClass<T extends Comparable, V extends Serializable, K extends Animal> {
    private T tObj;
    private V vObj;
    private K kObj;

    public GenClass(T tObj, V vObj, K kObj) {
        this.tObj = tObj;
        this.vObj = vObj;
        this.kObj = kObj;
    }

    public T getTObj() {
        return tObj;
    }

    public void setTObj(T tObj) {
        this.tObj = tObj;
    }

    public V getVObj() {
        return vObj;
    }

    public void setVObj(V vObj) {
        this.vObj = vObj;
    }

    public K getKObj() {
        return kObj;
    }

    public void setKObj(K kObj) {
        this.kObj = kObj;
    }


    public void showClassesName(){
        System.out.println("T: " + tObj.getClass() + "\nV: " + vObj.getClass() + "\nK: " + kObj.getClass());
    }
}
