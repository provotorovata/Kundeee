package FirstLesson;

import java.util.Scanner;

public class Task8 {
    int k;
    public void weekday (){
        System.out.println("Введи число на которое хочешь узнать день недели");
        Scanner scn = new Scanner(System.in);
        k = scn.nextInt()% 7;
        System.out.println("НА введённый день будет день недели "+ k);

    }
}
