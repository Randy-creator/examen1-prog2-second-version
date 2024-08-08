public abstract class Artist {
    protected String id;
    protected String artistName;
    protected String nationality;
    protected int beginYear;

    public Artist(String id, String artistName, String nationality, int beginYear) {
        this.id = id;
        this.artistName = artistName;
        this.nationality = nationality;
        this.beginYear = beginYear;
    }
}
