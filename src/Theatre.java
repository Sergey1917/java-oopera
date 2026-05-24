public class Theatre {

    public static void main(String[] args) {
        //System.out.println("Поехали!");

        // Программно создаем объекты и заполняем их
        Director gergiev = new Director("Валерий", "Гергиев", Gender.MALE, 600);
        Director bogomolov = new Director("Константин", "Богомолов", Gender.MALE, 55);

        Actor tsiskaridze = new Actor("Николай", "Цискаридзе", Gender.MALE, 183);
        Actor zakharova = new Actor("Светлана", "Захарова", Gender.FEMALE, 168);
        Actor abdrazakov = new Actor("Ильдар", "Абдразаков", Gender.MALE, 187);


        Show besy = new Show("Бесы", 190, bogomolov); //+Режиссер при создании
        //besy.setDirector(bogomolov);
        besy.addActor(abdrazakov);
        besy.addActor(zakharova);

        Ballet ozero = new Ballet("Лебединое озеро", 150, gergiev, "П.И. Чайковский",
                "Принц Зигфрид влюбляется в Одетту, заколдованную в лебедя.",//+Либретто, режиссер при создании
                "Мариус Петипа");
        //ozero.setDirector(gergiev);
        ozero.addActor(tsiskaridze);
        ozero.addActor(zakharova);
        //ozero.setLibrettoText("Принц Зигфрид влюбляется в Одетту, заколдованную в лебедя.");

        Opera carmen = new Opera("Кармен", 200, gergiev, "Ж. Бизе",
                "История трагической любви и ревности солдата Хозе и цыганки Кармен.", //+Либретто, режиссер при создании
                80);
        //carmen.setDirector(gergiev);
        carmen.addActor(abdrazakov);
        carmen.addActor(tsiskaridze);
        //carmen.setLibrettoText("История трагической любви и ревности солдата Хозе и цыганки Кармен.");

        System.out.println("Выводим либретто музыкальных шоу.");
        ozero.printLibretto();
        carmen.printLibretto();

        System.out.println("Выводим списки актеров для каждого из шоу.");
        System.out.println("Бесы:");
        besy.printActors();
        System.out.println("Лебединое озеро:");
        ozero.printActors();
        System.out.println("Кармен:");
        carmen.printActors();

        System.out.println("Заменяем актера в одном из шоу и выводим список еще раз.");
        System.out.println("Кармен. Цискаридзе на Захарову:");
        carmen.replaceActor(zakharova, "Цискаридзе");
        carmen.printActors();

        System.out.println("Пробуем там же заменить актера, которого нет в шоу.");
        System.out.println("Кармен. Еще раз Цискаридзе на Захарову:");
        carmen.replaceActor(zakharova, "Цискаридзе");

        System.out.println("Пробуем добавить актера, который уже есть в шоу.");
        System.out.println("Капмен. Пробуем еще раз добавить Абдразакова:");
        carmen.addActor(abdrazakov);
    }
}
