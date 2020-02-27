package etude;

public class Resultat{
	private String matiere;
	private float note;

	public Resultat(String matiere, float note){
		this.matiere = matiere;
		this.note = note;
	}

	public float getNote(){
		return note;
	}

	public void setNote(float note){
		this.note = note;
	}
}