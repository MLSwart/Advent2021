package DayFive;

import java.util.Arrays;
import java.util.Locale;

public class InputCleaner {
    public static void main(String[] args) {
        String string ="0,9 -> 5,9M8,0 -> 0,8M9,4 -> 3,4M2,2 -> 2,1M7,0 -> 7,4M6,4 -> 2,0M0,9 -> 2,9M3,4 -> 1,4M0,0 -> 8,8M5,5 -> 8,2";

        String[] stringCleaned1= string.split("->",2);
        System.out.println(Arrays.toString(stringCleaned1));



    }
}
