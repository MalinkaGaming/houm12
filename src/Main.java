
public class Main {
    public static void main(String[] args) {
        Author firstAutor = new Author("Дмитрий", "Глуховский");
        Author scndAutor = new Author("Евгений", "Водолазкин");


        Book metro = new Book("Метро 2033", firstAutor, 2005);
        System.out.println(metro);
        Book lavr = new Book("Лавр", scndAutor, 2021);
        System.out.println(lavr);
        lavr.setYear(2022);
        System.out.println(lavr);
        //сравниваем
        System.out.println(firstAutor.equals(scndAutor));
        System.out.println(metro.equals(lavr));
        //чекаем хэш
        System.out.println(firstAutor.hashCode());
        System.out.println(metro.hashCode());
        System.out.println(metro.hashCode() == lavr.hashCode());
    }
}
