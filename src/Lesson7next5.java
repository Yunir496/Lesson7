import java.util.*;
//6. Есть массив с оценками студентов, от 1 до 5. Надо написать программу, которая исключит всех студентов с оценкой  < 2.5
public class Lesson7next5 {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,2,3,4,5,5};
        List<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i< array.length;i++){
            if(array[i]>2){
                arr.add(array[i]);
            }
        }
        System.out.println(arr);
    }
}
