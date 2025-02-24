public class Watch {
    Pointer hour = new Pointer();
    Pointer minute = new Pointer();
    Pointer secoud = new Pointer();


    void setTime(int hour, int minute, int secoud) {
        this.hour.number = hour;
        this.secoud.number = secoud / 5;
        this.minute.number = minute / 5;
    }
    int radHour() {
        return hour.number;
    }

    int radMinute() {
        return minute.number * 5;
    }

    int readSecund(){
        return secoud.number * 5;
    }
}
