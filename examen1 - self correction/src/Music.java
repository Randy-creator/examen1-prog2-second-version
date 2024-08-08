import java.util.List;
import java.util.Objects;

public class Music {
    private String id;
    private String title;
    private int duration;
    private Genre genre;
    private Artist author;

    public Music(String id, String title, int duration, Genre genre, Artist author) {
        this.id = id;
        this.title = title;
        this.duration = duration;
        this.genre = genre;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Music music = (Music) o;
        return duration == music.duration && Objects.equals(id, music.id) && Objects.equals(title, music.title)
                && genre == music.genre && Objects.equals(author, music.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, duration, genre, author);
    }

    @Override
    public String toString() {
        return "Music{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", duration=" + duration +
                ", genre=" + genre +
                ", author=" + author +
                '}';
    }
}
