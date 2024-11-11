public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Author author1 = new Author("Вячеслав", "Лем");
        Author author2 = new Author("Федор", "Достоевский");

        Book book1 = new Book("Солярис", author1.getFirstName(), 1961);
        Book book2 = new Book("Идиот", author2.getFirstName(), 1868);
        book1.setYearPublication(1960);


        System.out.println(" Автор - " + author1.getFirstName() + " " + author1.getLastName() + " , название книги - " + book1.getTitle() + ", год публикации - " + book1.getYearPublication());
        System.out.println(" Автор - " + author2.getFirstName() + " " + author2.getLastName() + " , название книги - " + book2.getTitle() + ", год публикации - " + book2.getYearPublication());

    }
}