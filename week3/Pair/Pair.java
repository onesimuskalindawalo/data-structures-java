package ADTT.Pair;

import ADTT.interfaces.PairADT;


public class Pair<T> implements PairADT<T> {
    T left, right;

    public void reverse() {
        T temp = left;
        left = right;
        right = temp;
    }

    public Pair(T left, T right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return this.hashCode() + "<" + this.left + "," + this.right + ">";
    }
}
