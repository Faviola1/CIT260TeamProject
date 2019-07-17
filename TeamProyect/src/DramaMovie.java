
public class DramaMovie extends Movie{

		private int grade;
		
		public DramaMovie(){
			super();}
		
		public DramaMovie(int index, String name, String language, int year, Director director, int grade) {
			super(index, name,language, year, director);
			this.grade=grade;	
		}
		
		public int getGrade() {
			return(this.grade);
		}

		public void putGrade(int grade) {
			this.grade=grade;
		}
		
		public void Show() {}
		
		public void Save() {}
		
		public void Search() {}

}
