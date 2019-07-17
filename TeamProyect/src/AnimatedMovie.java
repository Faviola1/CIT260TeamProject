
public class AnimatedMovie extends Movie{
	private String type;
	
	public AnimatedMovie(){
		super();}
	
	public AnimatedMovie(int index, String name, String language, int year, Director director, String type) {
		super(index, name,language, year, director);
		this.type=type;	
	}
	
	public String getType() {
		return(this.type);
	}

	public void putType(String type) {
		this.type=type;
	}
	
	public void Show() {}
	
	public void Save() {}
	
	public void Search() {}

}
