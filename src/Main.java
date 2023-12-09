public class Main {
    public static void main(String[] args) {
        String nameMetro = " Metro ";
        int yearMetro = 2005;
        String authorMetro = "Дмитрий Глуховский ";


        String nameLavr = " Lavr ";
        int yearLavr = 2021;
        String authorLavr = "Евгений Водолазкин ";


        String[] names = {" Metro ", " Lavr "};
        int[] year = {2005, 2021};
        String[] author = {"Дмитрий Глуховский ", "Евгений Водолазкин "};

        for (int i = 0; i < names.length; i++) {
            System.out.println(" Имя - " + names[i] + " год " + year[i] + " автор " + author[i]);
        }
        Book Metro = new Book(" Metro ", 2005, "Дмитрий Глуховский ");
        System.out.println("Metro.name = " + Metro.getName());
        System.out.println("Metro.year = " + Metro.getYear());
        System.out.println("Metro.author = " + Metro.getAuthor());
        Metro.setYear(2006);
        System.out.println("metro.getYear () = " + Metro.getYear());
        Book Lavr = new Book("Lavr", 2021, "Евгений Водолазкин");
        System.out.println(" Lavr.name = " + Lavr.getName());
        System.out.println(" Lavr.year = " + Lavr.getYear());
        System.out.println("Lavr.author = " + Lavr.getAuthor());
        Lavr.setYear(2022);
        System.out.println("lavr.getYear () = " + Lavr.getYear());

        String authorsNameLavr = " Евгений ";
        String surnameAuthorsLavr = " Водолазкин ";

        String authorsNameMetro = "Дмитрий";
        String surnameMetro = "Глуховский ";

        String[] authors = {" Евгений ", " Дмитрий "};
        String[] surname = {" Водолазкин  ", " Глуховский "};

        System.out.println(" Имя - " + authors + " фамилия " + surname);
        Author Дмитрий = new Author("Дмитрий", "Глуховский");
        System.out.println("Метро.authors = " + Дмитрий.getAuthors());
        System.out.println("Метро.surname = " + Дмитрий.getSurname());

        Author Евгений = new Author("Евгений", "Водолазкин");
        System.out.println("Lavr.authors = " + Евгений.getAuthors());
        System.out.println("Lavr.surname = " + Евгений.getSurname());

    }
}

