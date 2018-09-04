package FirstLesson;

import java.util.Scanner;

public class Algorithm {
    // 1 * 2 * 3* 4* 5 = 120

    public void calculateFactorial () {
       System.out.println("Введите число, факториал которого будем вычислять");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int factorial = n;
        for (n--;n>0;n--){

            factorial *= n;
        }
        System.out.println(factorial);
    }
}
