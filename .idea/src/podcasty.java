
public class podcasty extends Mediaitem implements Playable {

    private String host;

    public podcasty(String title, String host, int durationSeconds) {
        super(title, durationSeconds);
        this.host = host;
    }

    public String getHost() {
        return host;
    }

    @Override
    public void play() {
        System.out.println("Afspiller podcast: \"" + title + "\" med " + host + " (" + formatTime(durationSeconds) + ")");
    }
}