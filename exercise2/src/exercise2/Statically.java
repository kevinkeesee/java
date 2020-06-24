package exercise2;

public class Statically {
    //Once you have finished getting statistically.js to run, refactor the code here in Java.
	
	public String glue = "Epoxy";
	public String jello = "Jello";
	
	public void moveAndShake() {
		System.out.println("Never stagnate in life.  Be agile, change, and improve...");
	}
	
	public void stubborn() {
		this.moveAndShake();
		System.out.println("Please don't make me change... I just don't like it...");
	}
	
	public void explain() {
		this.stubborn();
		System.out.println(this.glue);
	}
	
	public static void main(String[] args) {
		Statically stats = new Statically();
		
		stats.moveAndShake();
		stats.stubborn();
		stats.explain();
		
		System.out.println(stats.glue);
		System.out.println(stats.jello);
	}
}