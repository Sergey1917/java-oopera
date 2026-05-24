import java.util.ArrayList;
import java.util.Objects;

public class Show {

    protected String title;  //Меняем доступ на protected для работы с полями в классах-наследниках
    protected int durationMinutes;
    protected Director director;
    protected ArrayList<Actor> actorsList = new ArrayList<>();

    public Show(String title, int durationMinutes, Director director) {
        this.title = title;
        this.durationMinutes = durationMinutes;
        this.director = director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public void printDirector() {
        System.out.println(director);
    }

    public void printActors() {
        for (Actor actor : actorsList) {
            System.out.println(actor);
        }
    }

    public void addActor(Actor actor) {
        if (actorsList.contains(actor)) {
            System.out.println("Этот актер уже участвует в шоу");
        } else {
            actorsList.add(actor);
        }
    }

    public void replaceActor(Actor actorToAdd, String surnameToReplace) {
        if (actorsList.contains(actorToAdd)) {                                         // Если актер, которого мы хотим
            System.out.println("Актер, которого вы хотите добавить, уже участвует в шоу"); // добавить, уже участвует,
            return;                                                                       // выводим сообщение и
        }                                                                                 // выходим из метода

        for (int i = 0; i < actorsList.size(); i++) {
            if (Objects.equals(actorsList.get(i).getSurname(), surnameToReplace)) { // Если актер, которого мы хотим
                actorsList.set(i, actorToAdd);                              // заменить, действительно в шоу, заменяем
                return;                                                     // его и выходим из метода
            }
        }
        System.out.println("Заменяемого актера нет в списке участвующих");
    }


}
