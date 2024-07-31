import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album (String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>(); //Initializing the array list inside of the class;
    }

    public boolean addSong (String title, double duration) {
        if (findSong(title) == null) {
            this.songs.add(new Song(title, duration));
            return true;
        }
        return false;
    }

    // findSong parses for every Song in my array, for every song in my array i'm going to get
    // the title of my song and i'm going to compare it to the title of entry. If there's such
    // a title i'm returning the corresponding song or else i'm returning null;
    private Song findSong (String title) {
        for (Song thisSong : this.songs) {
            if (thisSong.getTitle().equals(title)) {
                return thisSong;
            }
        }
        return null;
    }

    public boolean addToPlaylist(int trackNumber, LinkedList<Song> playList) {
        int index = trackNumber - 1;
        if (index >= 0 && index <= this.songs.size()) {
            playList.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;
    }

    public boolean addToPlaylist(String title, LinkedList<Song> playList) {
        if (findSong(title) != null) {
            playList.add(findSong(title));
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;
    }
}
