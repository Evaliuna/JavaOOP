class Media {
    String title;
    int duration;
    
    Media(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }
    
    void play() {
        System.out.println("Playing: " + title + " (" + duration + " mins)");
    }
}

class Movie extends Media {
    String director;
    
    Movie(String title, int duration, String director) {
        super(title, duration);
        this.director = director;
    }
    
    @Override void play() {
        super.play();
        System.out.println("Director: " + director);
    }
}

class PremiumMovie extends Movie {
    String[] extras;
    
    PremiumMovie(String title, int duration, String director, String[] extras) {
        super(title, duration, director);
        this.extras = extras;
    }
    
    @Override void play() {
        System.out.println("=== PREMIUM CONTENT ===");
        super.play();
        System.out.println("Extras:");
        for (String e : extras) System.out.println("- " + e);
    }
}

public class Streaming {
    public static void main(String[] args) {
        Media[] library = {
            new Media("Documentary", 45),
            new Movie("Action Movie", 120, "John Director"),
            new PremiumMovie("Blockbuster", 150, "Jane Director", 
                           new String[]{"Trailer", "Interview"})
        };
        
        for (Media m : library) {
            m.play();
            System.out.println();
        }
    }
}
