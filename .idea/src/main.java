import java.util.ArrayList;

public class main {
    public static void main(String[] args) {

        Mediaplayer player = new Mediaplayer();

        //Songs
        song song1 = new song("Bagmand", "Gili", 382);
        song song2 = new song("Bohemian Rhapsody", "Queen", 354);

        //Podcasts
        podcasty pod1 = new podcasty("Lex Fridman #400", "Lex Fridman", 6137);
        podcasty pod2 = new podcasty("The Joe Rogan Experience #2000", "Joe Rogan", 7823);
        podcasty pod3 = new podcasty("SImpleman podcast", "B TEAM", 7823);

        // lyderbægher ting
        audiobook book1 = new audiobook("Dune", "Frank Herbert", 76440);
        audiobook book2 = new audiobook("Metro 2033", "Ham der den ukrainske", 28800);

        player.printPlaylist();
        System.out.println();

        player.playAll();

        System.out.println();

        int totalSecs = player.getTotalDuration();
        System.out.println("Samlet spilletid: " + player.formatTotalTime(totalSecs));
    }
}