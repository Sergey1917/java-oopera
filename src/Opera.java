
public class Opera extends MusicalShow {

    private int choirSize;

    public Opera(String title, int durationMinutes, String musicAuthor, int choirSize) {
        super(title, durationMinutes, musicAuthor);
        this.choirSize = choirSize;
    }
}
