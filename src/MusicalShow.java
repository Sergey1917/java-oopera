
public class MusicalShow extends Show {

     private String musicAuthor;
     private String librettoText = "";

    public MusicalShow(String title, int durationMinutes, String musicAuthor) {
        super(title, durationMinutes);
        this.musicAuthor = musicAuthor;
    }

    public void setLibrettoText(String librettoText) {
        this.librettoText = librettoText;
    }

    public void printLibretto() {
        System.out.println(librettoText);
 }

}
