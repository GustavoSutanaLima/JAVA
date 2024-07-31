import java.util.LinkedList;
public class Main {
    public static void main(String[] args) {

        LinkedList<Song> mySimplePlaylist = new LinkedList<Song>();

        Album ironMaidenGreatestHits = new Album("Greatest Hits", "Iron Maiden");

        ironMaidenGreatestHits.addSong("Wasted Years", 3);
        ironMaidenGreatestHits.addSong("Brave New Wolrd", 5);
        ironMaidenGreatestHits.addSong("Book of Souls", 4);
        ironMaidenGreatestHits.addSong("Age of Innocence", 6);

        ironMaidenGreatestHits.addToPlaylist("Wasted Years", mySimplePlaylist);
        ironMaidenGreatestHits.addToPlaylist(3, mySimplePlaylist);

        printPlayList(mySimplePlaylist);

        removeSongFromPlaylist("Wasted Years", mySimplePlaylist);

        printPlayList(mySimplePlaylist);

        removeSongFromPlaylist("Wasted Years", mySimplePlaylist);

    }

    private static Song findSongTest(String title, LinkedList<Song> songs) {
        for (Song thisSong : songs) {
            if (thisSong.getTitle().equals(title)) {
                return thisSong;
            }
        }
        return null;
    }

    private static void printPlayList (LinkedList<Song> playList) {
        System.out.println("Complete list:");
        for (Song song : playList) {
            System.out.println("Song number #" + playList.indexOf(song) + ": " + song.getTitle());
        }
    }

    private static void removeSongFromPlaylist (String songName, LinkedList<Song> playList) {
        try {
            playList.remove(findSongTest(songName, playList));
        } catch (Exception e) {
            System.out.println("No such song on this playlist.");
        }
    }
}
