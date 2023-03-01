import java.util.*;
/*  4. Создайте массив с числами. Пользователь вводит значение, которое хочет найти.
          Если такое значение в массиве есть, то пользователю печатается номер значения в массиве.
          Если такого значения нет, то пользователю печатается -1.
 */
public class Lesson7next2 {
    public static void main(String[] args) {
        int a = new Scanner((System.in)).nextInt();
        int[] array = {1,2,3,4,5};
        System.out.println(find(array,a));

    }
    public static int find(int[] arr, int thingToFind){
        int i;
        for(i = 0; i < arr.length; i++){
            if(arr[i] == thingToFind){
                return i;
            }
        }
        return -1;
    }
}
