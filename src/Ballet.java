
public class Ballet extends MusicalShow {

    private String choreographer;

    public Ballet(String title, int durationMinutes, Director director, String musicAuthor, String librettoText, String choreographer) {
        super(title, durationMinutes, director, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }
}
