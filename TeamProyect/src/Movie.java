
public class Movie {
	
	protected int index;
	protected String name;
	protected String language;
	protected int year;
	protected Director director;
	
	public Movie() {}
	
	public Movie(int index, String name, String language, int year, Director director){
		this.index=index;
		this.name=name;
		this.language=language;
		this.year=year;
		this.director=new Director();
	}
	
	public int getIndex(){
		return(this.index);
	}
	
	public void putIndex(int index) {
		this.index=index;
	}

	public String getName(){
		return(this.name);
	}
	
	public void putName(String name) {
		this.name=name;
	}
	
	public String getLanguage(){
		return(this.language);
	}
	
	public void putlanguage(String language) {
		this.language=language;
	}
	
	public int getYear(){
		return(this.year);
	}
	
	public void putYear(int year) {
		this.year=year;
	}

	public Director getDirector(){
		return(this.director);
	}
	
	public void putDirector(Director director) {
		this.director=director;
	}


}
