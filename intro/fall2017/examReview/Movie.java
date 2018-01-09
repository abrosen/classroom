package examReview;

public class Movie {

	private String name;
	private String rating;
	private int[] reviews;
	
	public Movie(String name, String rating) {
		this.name = name;
		this.rating = rating;
		reviews = new int[5];
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setRating(String rating) {
		this.rating= rating;
	}
	
	public String getRating() {
		return this.rating;
	}
	
	
	public void addReview(int stars) {
		if(stars < 1 || stars > 5) {
			return;
		}
		
		int index =  stars -1;
		reviews[index]++;
	}
	
	public double getAverage() {
		double totalStars = 0.0;
		int numberReviews  = 0;
		for(int i = 0; i < reviews.length; i++) {
			numberReviews += reviews[i];
			totalStars += reviews[i]*(i+1);
		}
		return totalStars/numberReviews;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Movie m =  new Movie("Jaws 12: Jaws in Space", "R");
		m.addReview(5);
		m.addReview(3);
		m.addReview(3);
		m.addReview(1);
		m.addReview(1);
		m.addReview(1);
		m.addReview(1);
		m.addReview(1);
		m.addReview(1);
		System.out.println(m.getAverage());
	}

}
