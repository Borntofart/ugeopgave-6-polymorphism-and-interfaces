
public class song extends Mediaitem implements Playable {

    private String artist;

    public song(String title, String artist, int durationSeconds) {
        super(title, durationSeconds);
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }


    @Override
    public void play() {
        System.out.println(" Afspiller: \"" + title + "\" af " + artist + " (" + formatTime(durationSeconds) + ")");
    }
}