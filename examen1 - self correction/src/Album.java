import java.util.HashSet;

public class Album {
    private String title;
    private Artist author;
    private HashSet<Music> album = new HashSet<>();

    public Album(String title, Artist author) {
        this.title = title;
        this.author = author;
    }

    public void addMusicToAlbum(Music song) {
        album.add(song);
    }

    public String getTitle() {
        return title;
    }

    public Artist getAuthor() {
        return author;
    }

    public HashSet<Music> getAlbum() {
        return album;
    }
}
