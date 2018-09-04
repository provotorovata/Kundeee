package FirstLesson;

import java.util.Scanner;
import java.util.zip.DataFormatException;

public class Task10 {
    public void amountOfNumbe () throws DataFormatException {
        System.out.println("Введите любое число");
        Scanner scn = new Scanner(System.in);
        int k = scn.nextInt();
        int sum=0;
       while (k>0){
           sum += k%10;
           k /=10;
       }
        System.out.println("Сумма цыфр в числе " + sum);
    }

}
