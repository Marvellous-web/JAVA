package org.example.modal;

public class Mytime {
    private int hours,minutes,seconds;
    public Mytime()
    {
      return;
    }

    public Mytime(int h, int m, int s)
    {
        return;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours)
    {
        this.hours=hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public  String toString()
    {
        return hours+":"+minutes+":"+seconds;
    }
}
