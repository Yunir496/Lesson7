import java.util.*;
/*2. Ввести число и отобразить строку:
        *
        **
        ***
        ****
        *****
        ******
 */
public class Lesson7next {
    public static void main(String[] args) {
         int a = new Scanner((System.in)).nextInt();
         for(int i = 0; i<a; i++){
             for(int j = 0;j<=i;j++){
                 System.out.print("*");
             }
             System.out.println();
         }
        //3. Найти сумму всех элементов массива.
        int[] array = {1,2,3,4,5};
        int sum = 0;
        for(int i = 0;i<array.length;i++){
            sum = sum+array[i];
        }
        System.out.println(sum);
    }
}
