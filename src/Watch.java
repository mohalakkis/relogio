public class Watch {
    Pointer hour;
    Pointer minute;
    Pointer secoud;


    void setTime(int hour, int minute, int secoud) {
        this.hour.number = hour;
        this.secoud.number = secoud / 60;
        this.minute.number = minute / 60;
    }



}
