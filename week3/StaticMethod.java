import Box.Box;

public class StaticMethod {
    public static<T> void print(T[] array) {
        for (T elem : array)
            System.out.println(elem);
    }


    public static void main(String[] args) {
        Box box[] = new Box[5];
        Integer[] ints = new Integer[5];
        String[] strings = new String[5];
        int[] integers = new int[5];

        for(int i = 0; i < box.length; i++) {
            box[i] = new Box();
        }

        for (int i = 0; i < ints.length; i++) {
            ints[i] = (int)(Math.random() * 100);
        }
        String word = "";
        for (int i = 0; i < strings.length; i++) {
            for(int j = 0; j < 5; j++) {
                word += (Math.random() < 0.5 ? "A" : "B");
            }
            strings[i] = word;
            word = "";
        }

        for(int i = 0; i < integers.length; i++) {
            integers[i] = (int)(Math.random() * 10);
        }

        print(ints);
        print(strings);
       // print(integers);
       print(box);
        
    }
}