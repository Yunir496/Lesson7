import java.util.*;
//1. Вывести таблицу значений степеней 2, n- раз. N задает пользователь.

public class Lesson7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число для преобразования в степень");
      int a = scanner.nextInt();
        System.out.println("Введите степень");
      int n = scanner.nextInt();;
      for(int i = 1;i<=n;i++){
          a = a * i;
      }
        System.out.println(a);
    }
}
