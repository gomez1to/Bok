public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Author newAuthor = new Author("Shrimp","hejsan@fuckoff.com", 'F' );
        Book newBook = new Book("Shrimp on adventures", newAuthor, 19.99, 20);
    }
}