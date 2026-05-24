
public class MusicalShow extends Show {

    protected String musicAuthor;  //Меняем доступ на protected для работы с полями в классах-наследниках
    protected String librettoText;

    public MusicalShow(String title, int durationMinutes, Director director, String musicAuthor, String librettoText) {
        super(title, durationMinutes, director);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void setLibrettoText(String librettoText) {
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println(librettoText);
    }

}
