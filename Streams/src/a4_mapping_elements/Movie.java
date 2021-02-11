package a4_mapping_elements;

public class Movie {
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

}
