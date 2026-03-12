
public abstract class Mediaitem {


    protected String title;
    protected int durationSeconds;


    public Mediaitem(String title, int durationSeconds) {
        this.title = title;
        this.durationSeconds = durationSeconds;
    }


    public String getTitle() {
        return title;
    }

    public int getDurationSeconds() {
        return durationSeconds;
    }
    public String formatTime(int totalSecs) {
        int hours = totalSecs / 3600;
        int mins = (totalSecs % 3600) / 60;
        int secs = totalSecs % 60;


        if (hours > 0) {
            return hours + ":" + String.format("%02d", mins) + ":" + String.format("%02d", secs);
        } else {
            return mins + ":" + String.format("%02d", secs);
        }
    }




    @Override
    public String toString() {
        return "\"" + title + "\" – " + formatTime(durationSeconds);
    }
}