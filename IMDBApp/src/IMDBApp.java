// IMDB quer dizer "Internet Movie Data Base".
public class IMDBApp {
    public static void main(String[] args) {
        String name = "Denzel Washington";
        short yearOfBorn = 1954;

        String[] movieTitles = new String[5];
        movieTitles[0] = "The Equalizer 2";
        movieTitles[1] = "Training Day";
        movieTitles[2] = "Malcolm X";
        movieTitles[3] = "The Book of Eli";
        movieTitles[4] = "Fences";

        float[] ratings = new float[5];
        ratings[0] = 6.7f;
        ratings[1] = 7.7f;
        ratings[2] = 7.7f;
        ratings[3] = 6.9f;
        ratings[4] = 7.2f;

        System.out.println();
        System.out.println("Actors name: " + name);
        System.out.println("Year of born: " + yearOfBorn + " (" + (2021 - yearOfBorn) + " years old).");
        System.out.println();
        System.out.println("Famous Movie Titles:");
        // O "for each loop" precisa de uma nova variável (no caso aqui, "movieTitle"), para representar uma INSTÂNCIA INDIVIDUAL dentro do Array:
        for (String movieTitle : movieTitles) {
            System.out.println(movieTitle);
        }

        System.out.println();

        System.out.println("Famous Movies Titles And IMDB Evaluation:");
        for (int i = 0; i < movieTitles.length; i++) {
            System.out.println(movieTitles[i] + " - " + evaluateRating(ratings[i]) + " (" + ratings[i] + ")");
        }
    }

    public static String evaluateRating(float rating) {
        String evaluatedRating = "";

        if (rating <= 5.0) {
            evaluatedRating = "bad";
        } else if (rating > 5.0 && rating <= 6.5) {
            evaluatedRating = "average";
        } else if (rating > 6.5 && rating <= 7.0) {
            evaluatedRating = "good";
        } else if (rating > 7.0 && rating <= 8.0) {
            evaluatedRating = "very good";
        } else if (rating > 8.0) {
            evaluatedRating = "amazing";
        }

        return evaluatedRating;
    }
}



/*
 *  December 28, 1954
 *  Denzel Washington, star of The Equalizer 2, looks back on four of his best-known movies including , , , and .
 *
 * */