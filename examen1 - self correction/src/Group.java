import java.util.HashSet;

public class Group extends Artist{
    private HashSet<Artist> member = new HashSet<>();

    public Group(String id, String artistName, String nationality, int beginYear, HashSet<Artist> member) {
        super(id, artistName, nationality, beginYear);
        this.member = member;
    }

    public HashSet<Artist> getMember() {
        return member;
    }

    public void setMember(HashSet<Artist> member) {
        this.member = member;
    }
}
