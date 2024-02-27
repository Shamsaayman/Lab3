import java.util.ArrayList;

public class Book extends Media{
    private int stock;
    private ArrayList<Review>reviews;
    private ArrayList<User>purchasedList;

    public Book(String title, String auteur, String ISBN, double price , int stock) {
        super(title, auteur, ISBN, price);
        this.reviews = new ArrayList<>();
        this.purchasedList = new ArrayList<>();
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public ArrayList<Review> getReviews() {
        return reviews;
    }

    public void setReviews(ArrayList<Review> reviews) {
        this.reviews = reviews;
    }

    public ArrayList<User> getPurchasedList() {
        return purchasedList;
    }

    public void setPurchasedList(ArrayList<User> purchasedList) {
        this.purchasedList = purchasedList;
    }

    public void addReview(Review r){
     reviews.add(r);
    }
    public double getAverageRating(){
        int totalRating = 0;
        for (Review r : reviews) {
            totalRating += r.getRating();
        }

        return (double) totalRating / reviews.size();
    }


    public void purchase(User user){
    if(stock>0){
    purchasedList.add(user);
    stock--;
}
else{
    System.out.println(getTitle() + " is out of stock.");

}
    }
    public boolean isBestseller(){
        return getAverageRating() >= 4.5;
    }
    public void restock(int quantity){
        stock += quantity;
        System.out.println("Restocked " + quantity + " copies of " + getTitle() + ". New quantity in stock: " + stock);
    }

    @Override
    public String getMediaType() {
        if (isBestseller()) {
            return "Bestselling Book";
        } else {
            return "Book";
        }
    }

    @Override
    public String toString() {
        return super.toString() + "; QuantityInStock=" + stock + "; Reviews=" + reviews.size() +
                "; PurchasedList=" + purchasedList.size();    }
}
