
public class Ballet extends MusicalShow {

    private String choreographer;

    public Ballet(String title, int durationMinutes, String musicAuthor, String choreographer) {
        super(title, durationMinutes, musicAuthor);
        this.choreographer = choreographer;
    }
}
