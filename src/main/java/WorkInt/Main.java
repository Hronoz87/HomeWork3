package WorkInt;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        List<Integer> intList2 = new ArrayList<>();

        int count = 0;

        for (int x : intList) {
            if (x > 0)
                if (x % 2 == 0)

                    intList2.add(x);


            boolean sorted = false;
            int temp;
            while (!sorted) {
                sorted = true;
                for (int i = 0; i < intList2.size() - 1; i++) {
                    if (intList2.get(i) > intList2.get(i + 1)) {
                        temp = intList2.get(i);
                        intList2.set(i, intList2.get(i + 1));
                        intList2.set(i + 1, temp);
                        sorted = false;
                    }
                }
            }
        }


        System.out.println(intList2);

    }
}
