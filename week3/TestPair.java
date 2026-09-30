package ADTT;
import ADTT.interfaces.PairADT;
import ADTT.Pair;

public class TestPair {
    public static void main(String[] args) {
        Pair<Integer> pair = new Pair<>(1, 2);
        System.out.println(pair);
        pair.reverse();
        System.out.println(pair);
    }
}