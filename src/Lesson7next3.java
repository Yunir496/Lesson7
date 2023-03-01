import java.util.*;
//#2 Задача 5
public class Lesson7next3 {
    public static void main(String args[]) {
        int[] arr = { 1, 2, 2, 3, 3, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5 };
        int num, max, count;
        num = max = count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                num = arr[i];
            }
            count = 0;
        }

        System.out.println(num + ": " + (max + 1));
    }
}