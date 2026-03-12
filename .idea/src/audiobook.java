
public class audiobook extends Mediaitem implements Playable {

    private String author;

    public audiobook(String title, String Author, int durationSeconds) {
        super(title, durationSeconds);
        this.author = Author; // gemmer forfatternavn
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void play() {
        System.out.println("Afspiller lydbog: \"" + title + "\" af " + author + " (" + formatTime(durationSeconds) + ")");
    }
}