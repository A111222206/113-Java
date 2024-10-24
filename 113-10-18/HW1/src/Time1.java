public class Time1 {
    //時hour 分minute 秒second
    private int hour;
    private int minute;
    private int second;

    //方法: 建構子(設定時分秒初始值 需檢查資料是否正確)
    public Time1(int hour, int minute, int second) {
        if (hour >= 0 && hour < 24 &&minute >= 0 && minute < 60 &&second >= 0 && second < 60){
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
        else
            System.out.println("請輸入24小時制的正確時間");
    }

    //方法: 加入get/set
    public void setHour(int hour) {
        if (hour >= 0 && hour < 24)
            this.hour = hour;
    }

    public int getHour() {
        return hour;
    }

    public void setMinute(int minute) {
        if (minute >= 0 && minute < 60)
            this.minute = minute;
    }

    public int getMinute() {
        return minute;
    }

    public void setSecond(int second) {
        if (second >= 0 && second < 60)
            this.second = second;
    }

    public int getSecond() {
        return second;
    }

    //方法: tick(時間增加一秒)
    public void tick() {
        if (++second == 60) {
            second = 0;
            if (++minute == 60) {
                minute = 0;
                if (++hour == 24) {
                    hour = 0;
                }
            }
        }
    }

    //方法: printUniversal(以24小時制輸出完整時間 00:01:00)
    public void printUniversal() {
        System.out.printf("%02d:%02d:%02d\n", hour, minute, second);
    }

    //方法: printStandard(以12小時制輸出完整時間 12:01:00AM)
    public void printStandard() {
        System.out.printf("%02d:%02d:%02d %s\n",
                ((hour == 0 || hour == 12) ? 12 : hour % 12),
                minute, second, (hour < 12 ? "AM" : "PM"));
    }
}
