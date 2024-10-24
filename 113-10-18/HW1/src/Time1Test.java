import java.util.Scanner;

public class Time1Test {
    public static void main(String[] args){
        //Time1 time = new...
        Time1 time = new Time1(23, 59, 58);

        //呼叫printUniversal()
        time.printUniversal();

        //呼叫printStandard()
        time.printStandard();

        //使用者輸入時間過了幾秒，用迴圈呼叫tick
        Scanner input = new Scanner(System.in);
        System.out.println("請輸入經過的秒數：");
        int seconds = input.nextInt();
        input.close();

        for (int i = 0; i < seconds; i++) {
            time.tick();
        }

        //呼叫printUniversal()
        time.printUniversal();

        //呼叫printStandard()
        time.printStandard();
    }
}
