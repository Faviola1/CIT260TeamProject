
public class Director {
	
	private int cod;
	private String name;
	private String nationality;
	
	public Director() {}
	public Director(int cod, String name, String nationality)
	{
		this.cod=cod;
		this.name=name;
		this.nationality=nationality;
	}
	
	public int getCod(){
		return(this.cod);
	}
	
	public void putCod(int cod) {
		this.cod=cod;
	}

	public String getName(){
		return(this.name);
	}
	
	public void putName(String name) {
	this.name=name;
	}


	public String getNationality(){
		return(this.nationality);
	}
		
	public void putNationality(String nationality) {
		this.nationality=nationality;
	}
	
	public void Show() {}
	
	public void Save() {}
	
	public void Search() {}
	

}
