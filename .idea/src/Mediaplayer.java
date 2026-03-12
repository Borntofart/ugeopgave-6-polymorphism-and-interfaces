import java.util.ArrayList;

public class Mediaplayer {


    ArrayList<Playable> playlist = new ArrayList<Playable>();
    public void add(Playable item) {
        playlist.add(item);
    }

    public void playAll() {
        for (Playable p : playlist) {
            p.play();
        }
    }

    public int getTotalDuration() {
        int total = 0;
        for (int i = 0; i < playlist.size(); i++) {
            total = total + playlist.get(i).getDurationSeconds();
        }
        return total;
    }

    public void printPlaylist() {
        System.out.println("=== Playlist (" + playlist.size() + " elementer) ===");
        for (int i = 0; i < playlist.size(); i++) {
            // vi skal bruge MediaItem for at kalde toString
            Mediaitem item = (Mediaitem) playlist.get(i);
            System.out.println((i + 1) + ". " + item.toString());
        }
    }

    //bruh
    public String formatTotalTime(int totalSecs) {
        int hours = totalSecs / 3600;
        int mins = (totalSecs % 3600) / 60;
        int secs = totalSecs % 60;
        return hours + ":" + String.format("%02d", mins) + ":" + String.format("%02d", secs);
    }
}