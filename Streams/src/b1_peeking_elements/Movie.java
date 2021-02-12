package b1_peeking_elements;

public class Movie implements Comparable<Movie> {
	private String title;
	private int likes;

	public Movie(String title, int likes) {
		super();
		this.title = title;
		this.likes = likes;
	}

	public String getTitle() {
		return title;
	}

	public int getLikes() {
		return likes;
	}

	@Override
	public int compareTo(Movie o) {
		return 0;
	}

}
