package quiz;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by longcoding on 2016. 4. 21..
 */


class QuizTest {
    public static void main(String[] args) {
        String[] test = {"C", "D", "B", "E", "A"};

        Arrays.sort(test, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return -1;
            }
        });
    }

}
