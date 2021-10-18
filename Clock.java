public class Clock {
    private int hours;
    private int minutes;
    private int seconds;

    public Clock() {

        setTime(0, 0, 0);
    }

    public String toUniversalString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public Clock(int hrs, int min, int sec) {
        setTime(hrs, min, sec);
    }

    public void setTime(int hrs, int min, int sec) {
        if (hrs >= 0 && hrs < 24) {
            hours = hrs;
        } else {
            hours = 0;
        }
        if (min >= 0 && min < 60) {
            minutes = min;
        } else {
            minutes = 0;
        }
        if (sec >= 0 && sec < 60) {
            seconds = sec;
        } else {
            seconds = 0;
        }
    }
    public int getHours(){
        return hours;
    }
    public int getMinutes(){
        return minutes;
    }
    public int getSeconds(){
        return seconds;
    }
    public Clock(int sec) {
        setClock(sec);
    }

    public void setClock(int sec) {
        hours = sec / 3600;
        minutes = sec / 60 % 60;
        seconds = sec % 60;
    }

    public void tick() {
        this.seconds += 1;
        this.minutes += (int) (this.seconds /60);
        this.seconds = this.seconds %60;
        this.hours += (int) (this.minutes /60);
        this.minutes = this.minutes %60;
        this.hours = this.hours %24;
    }
    public void addClock(Clock clock){
        this.seconds += clock.getSeconds();
        this.minutes += clock.getMinutes();
        this.minutes +=(int)(this.seconds /60);
        this.seconds = this.seconds %60;
        this.hours += clock.getHours();
        this.hours +=(int)(this.minutes /60);
        this.minutes = this.minutes %60;
        this.hours = this.hours %24;
    }
    public void tickDown() {
        this.seconds -= 1;
        if (this.seconds < 0) {
            this.seconds += 60;
            this.minutes -=1;
        }
        if(this.minutes <0){
            this.minutes +=60;
            this.hours -=1;
        }
        if(this.hours <0){
            this.hours+=24;
        }
    }
    public void subtractClock(Clock clock){
        this.seconds +=this.minutes*60 + this.hours*3600;
        int clockTime = clock.getSeconds() + clock.getMinutes()*60 + clock.getHours()*3600;
        this.seconds -=clockTime;
        this.hours = this.seconds / 3600;
        this.minutes = this.seconds / 60 % 60;
        this.seconds = this.seconds % 60;

    }
    }

