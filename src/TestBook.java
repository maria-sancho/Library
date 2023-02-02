public class TestBook {

    public static void main(String[] args) {
        Author anAuthor =  new Author("Maria Sancho", "m.sancho.p1@gmail.com", 'm');
        Book aBook = new Book("Java for dummy", anAuthor, 19.95, 1000);

        Book anotherBook = new Book("Mas Java", new Author("JavaScript", "java@gmail..com", 'm'), 30.95, 918);

        System.out.println(aBook.getAuthor().getName());
        System.out.println(aBook.getAuthor().getEmail());

        Book[] books = {
                new Book("Java for dummy 1", anAuthor, 15.95, 1000),
                new Book("Java for dummy 2", anAuthor, 23.95, 2000),
                new Book("Java for dummy 3", anAuthor, 29.95, 3000),
                new Book("Java for dummy 4", anAuthor, 39.95, 4000),
                new Book("Java for dummy 5", anAuthor, 19.95, 5000)
        };

        for (Book book: books) {
            System.out.println(book.toString());
        }

    }



}