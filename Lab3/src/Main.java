//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Store s = new Store();
        System.out.println("          Online Store");
        System.out.println("---------------------------------");
        // movie and music and book
        Book book1 = new Book("Relentless", "Tim S.Grover", "1-2", 19.99, 10);
        Movie movie1 = new Movie("SpiderMan", "Benedict Cumberbatch", "3-4", 14.75, 148);
        Music music1 = new Music("Bohemian Rhapsody", "Queen", "5-6", 1.50, "Queen");
        s.addMedia(book1);
        s.addMedia(movie1);
        s.addMedia(music1);

        User user1 = new User("User1", "user1@gmail");
        user1.addToCart(book1);
        user1.addToCart(movie1);
        user1.addToCart(music1);
        user1.removeFromCart(book1);

        Review review1 = new Review("User1", 5, "good book");
        Review review2 = new Review("User2", 1, "bad book");
        book1.addReview(review1);
        System.out.println("---------------------------------");
        System.out.println("Average rating for " + book1.getTitle() + ": " + book1.getAverageRating());
        System.out.println("---------------------------------");
        s.displayMedias();
        s.displayUsers();
        System.out.println("---------------------------------");
        s.searchBook("The Great Gatsby");
        System.out.println("---------------------------------");
        user1.checkout();
    }
    }
