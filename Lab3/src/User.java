import java.util.ArrayList;
import java.util.List;

public class User {
    private String username;
    private String email;
    private ArrayList<Media> purchasedMediaList;
    private ArrayList<Media>shoppingCart;


    public User(String username, String email) {
        this.username = username;
        this.email = email;
        this.purchasedMediaList = new ArrayList<>();
        this.shoppingCart = new ArrayList<>();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Media> getPurchasedMediaList() {
        return purchasedMediaList;
    }

    public void setPurchasedMediaList(ArrayList<Media> purchasedMediaList) {
        this.purchasedMediaList = purchasedMediaList;
    }

    public ArrayList<Media> getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ArrayList<Media> shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public void addToCart(Media m){
        shoppingCart.add(m);
        System.out.println(username + " added " + m.getTitle() + " to the shopping cart.");
    }
    public void removeFromCart(Media media){
        shoppingCart.remove(media);
        System.out.println(username + " removed " + media.getTitle() + " from the shopping cart.");
    }
    public void checkout(){
        for (Media media : shoppingCart) {
            if (media instanceof Book) {
                ((Book) media).purchase(this);
            } else if (media instanceof Movie) {
                ((Movie) media).watch(this);
            } else if (media instanceof Music) {
                ((Music) media).listen(this);
            }
        }
        System.out.println("---------------------------------");
        System.out.println("Checked out");
        System.out.println("---------------------------------");

    }
    public void addToPurchasedMediaList(Media m) {
        purchasedMediaList.add(m);
        System.out.println(username + " purchased " + m.getTitle());
    }
}
