import java.util.ArrayList;

public class Store {
    private ArrayList<User> userList;
    private ArrayList<Media> availableMediaList;

    public Store() {
        this.userList = new ArrayList<>();
        this.availableMediaList = new ArrayList<>();
    }

    public ArrayList<User> getUserList() {
        return userList;
    }

    public void setUserList(ArrayList<User> userList) {
        this.userList = userList;
    }

    public ArrayList<Media> getAvailableMediaList() {
        return availableMediaList;
    }

    public void setAvailableMediaList(ArrayList<Media> availableMediaList) {
        this.availableMediaList = availableMediaList;
    }

    public void addUser(User user) {
        userList.add(user);
    }


    public void displayUsers() {
        for (User user : userList) {
            System.out.println(user.getUsername());
        }
    }

    public void addMedia(Media media) {
        availableMediaList.add(media);
    }

    public void displayMedias() {
        for (Media media : availableMediaList) {
            System.out.println(media.toString());
        }
    }

    public Media searchBook(String title) {
        for (Media media : availableMediaList) {
            if (media instanceof Book && media.getTitle().equals(title)) {
                return media;
            }
        }
        System.out.println("Book: " + title + " not found.");
        return null;
    }
}
