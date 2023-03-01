import java.util.*;
// 5. Найти число в массиве, которое повторяется большее кол-во раз
public class Lesson7next4 {
    static int len;
    static int res;
    static int vres;
    static int [] array = {1,2,4,2,3,4,5,5,5,5,6,7,8,9,1,2,3,5};

    public static void main(String[] args) {
        for(int i =0;i< array.length;i++){
            int a = chek(array[i]);{
               if(a>vres){
                   vres=a;
                   res=array[i];
               }
            }
        }
        System.out.println(res);
    }
    public static int chek(int count){
        int c = 0;
        for(int i = 0; i<array.length;i++){
             if(count == array[i]){
                 c++;
             }
        }
        return c;
    }
}
