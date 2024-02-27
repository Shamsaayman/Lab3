import java.util.ArrayList;
import java.util.List;

public class Movie extends Media{
    private int duration;

    public Movie(String title, String auteur, String ISBN, double price ,int duration) {
        super(title, auteur, ISBN, price);
        this.duration=duration;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    public void watch(User user){
        user.addToPurchasedMediaList(this);
    }
    public List<Movie> recommendSimilarMovies(List<Movie> movieCatalog) {
        List<Movie> recommendedMovies = new ArrayList<>();
        for (Movie movie : movieCatalog) {
            if (movie.getAuteur().equals(getAuteur()) && !movie.getTitle().equals(getTitle())) {
                recommendedMovies.add(movie);
            }
        }
        return recommendedMovies;
    }


    @Override
    public String getMediaType() {
        if (duration >= 120) {
            return " Long Movie";
        } else {
            return "Movie";
        }
    }

    @Override
    public String toString() {
        return super.toString() + "; Duration=" + duration;    }
}
