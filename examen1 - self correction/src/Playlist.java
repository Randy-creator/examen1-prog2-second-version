import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Playlist {
    private String name;
    private List<Music> listOfMusic;
    private HashSet<User> like = new HashSet<>();

    public Playlist(String name) {
        this.name = name;
        this.listOfMusic = new ArrayList<>();
    }

    public void addToPlaylist(Music song) {
        listOfMusic.add(song);
    }

    public void addToPlaylist(Album album) {
        listOfMusic.addAll(album.getAlbum());
    }

    public void liked(User user) {
        if (!like.contains(user)) {
            like.add(user);
        }
        else {
            like.remove(user);
        }
    }

    public int getTotalLikes() {
        return like.size();
    }

    public String getName() {
        return name;
    }

    public List getListOfMusic() {
        return listOfMusic;
    }

    public HashSet<User> getLike() {
        return like;
    }

    public void exclude(Genre genre) {
        for (int i = 0; i < listOfMusic.size(); i++) {
            Music song = (Music) listOfMusic.get(i);
            if (song.getGenre().equals(genre)) {
                listOfMusic.remove(i);
            }
        }
    }
}
