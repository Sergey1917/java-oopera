
public class Opera extends MusicalShow {

    private int choirSize;

    public Opera(String title, int durationMinutes, Director director, String musicAuthor, String librettoText, int choirSize) {
        super(title, durationMinutes, director, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    public int getChoirSize() { //+Геттер для размера хора
        return choirSize;
    }
}
