public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Shrimp","hejsan@fuckoff.com", 'F' );
        Author author2 = new Author("Lobster","hejsan@fuckme.com", 'M' );
        Book book1 = new Book("Shrimp on adventures", author1, 19.99, 10);
        Book book2 = new Book("Shrimp on adventures", author1, 49.99, 50);
        Book book3 = new Book("Shrimp on adventures", author2, 39.99, 15);
        Book book4 = new Book("Shrimp on adventures", author2, 29.99, 20);
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);
        System.out.println(book4);

    }
}