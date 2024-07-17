class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    Clock(int h, int m, int s) {
        hours = h;
        minutes = m;
        seconds = s;
    }

    void SetHour(int h) {
        hours = h;
    }

    void SetMinute(int m) {
        minutes = m;
    }

    void SetSecond(int s) {
        seconds = s;
    }

    void DisplayTime(int mode) {
        if (mode == 1) {
            System.out.println(hours + ":" + minutes + ":" + seconds + "\n");
        } else if (mode == 2) {
            if (hours > 12) System.out.println(hours % 12 + ":" + minutes + " p.m." + "\n");
            else {
                if (hours < 10) System.out.print("0");
                System.out.println(hours + ":" + minutes + " a.m." + "\n");
            }
        } else System.out.println("Error");
    }

    public static void main(String[] args) {
        Clock c = new Clock(22, 53, 11);
        c.DisplayTime(1);
        c.DisplayTime(2);
        c.SetHour(11);
        c.DisplayTime(2);
        c.SetHour(9);
        c.DisplayTime(2);
    }
}
